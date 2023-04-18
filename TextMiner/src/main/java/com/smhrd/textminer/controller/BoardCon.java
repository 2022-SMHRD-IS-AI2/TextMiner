package com.smhrd.textminer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.textminer.dto.BoardDTO;
import com.smhrd.textminer.dto.myDTO;
import com.smhrd.textminer.mapper.BoardMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class BoardCon {

	@Autowired
	private BoardMapper boardMapper;

	@GetMapping("/board")
	public String BoardList(HttpServletRequest request) {

		String search = request.getParameter("search");

		// 페이지 관련 설정
		String pageParam = request.getParameter("page");
		int page = 1; // 초기값 1설정
		if (pageParam != null) {
			page = Integer.parseInt(pageParam);
		}
		int limit = 10;
		int offset = (page - 1) * limit;
		
		int totalCount;
		
		if (search == null) {	
			totalCount = boardMapper.getBoardCount();
		}else {//////////////////////////////////////////////////
			totalCount = boardMapper.getsearchCount(search);
		}
		
		
		int totalPage = (totalCount % limit == 0) ? totalCount / limit : totalCount / limit + 1;
		List<BoardDTO> boardList;

		if (search == null) {
			boardList = boardMapper.selectBoardList(offset, limit);

		} else {
			boardList = boardMapper.search(search, offset);

		}

//      List<BoardDTO> boardList = boardMapper.selectBoardList();

//      for(BoardDTO bdto : boardList) {
//         System.out.println(bdto);
//      }

		// model.addAttribute("list", boardList); //value 값에 객체 지정 실시

		HttpSession session = request.getSession();

		session.setAttribute("list", boardList);

		session.setAttribute("cnt", totalCount); // 전체 데이터 갯수
		session.setAttribute("currentPage", page); // 현재페이지
		session.setAttribute("totalPage", totalPage); // 전체 페이지 갯수
		session.setAttribute("limit", limit); // 10
		session.setAttribute("offset", offset); // 페이지 수

		System.out.println("offset :" + offset + "\t limit : " + limit);
		System.out.println("게시물 10개 출력" + boardList);
		System.out.println("총 게시물 수 구하기 " + totalCount);
		System.out.println("현재 페이지" + page);

		return "board";

	}

//	@GetMapping("/search")
//	public String search(HttpServletRequest request) {
//
//		String search = request.getParameter("search");
//
//		String pageParam = request.getParameter("page");
//		int page = 1; // 초기값 1설정
//		if (pageParam != null) {
//			page = Integer.parseInt(pageParam);
//		}
//		int limit = 10;
//		int offset = (page - 1) * limit;
//		int totalCount = boardMapper.getBoardCount();
//
//		int totalPage = (totalCount % limit == 0) ? totalCount / limit : totalCount / limit + 1;
//
//		List<BoardDTO> searchList = boardMapper.search(search, offset);
//
//		HttpSession session = request.getSession();
//
//		session.setAttribute("list", searchList);
//
//		myDTO mydto = new myDTO(totalCount, page, totalPage, limit, offset);
//
//		session.setAttribute("mydto", mydto);
//
//
//		return "board";
//
//	}

//   최신오류
//   @RequestMapping("/board")
//   public @ResponseBody List<BoardDTO> selectBoardList(){
//      List<BoardDTO> list = boardMapper.selectBoardList();
//      return list;
//   

//   어려워 시도
//   public String boardTest(Model model) {
//      model.addAllAttributes("selectBoardAll",boardMapper.selectBoardAll());
//      return "/board";
//   }
//   

//   기존방법
//   @Autowired
//   BoardMapper boardMapper;
//   HttpServletResponse response;
//   
//   @RequestMapping("/board")
//   public String servletRequest(HttpServletRequest httpRequest) throws IOException{
//      System.out.println("보드매퍼 오는지?");
//      BoardDTO board = new BoardDTO();
//      boardMapper.allBoard(board);
//      
//      
//      HttpSession session = httpRequest.getSession();
//      session.setAttribute("board", board);
//      
//      System.out.println("보드매퍼2 오는지?");
//      
//      return "board";

}
