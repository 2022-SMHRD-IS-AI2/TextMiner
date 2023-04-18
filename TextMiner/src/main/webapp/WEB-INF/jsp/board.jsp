
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="com.smhrd.textminer.mapper.BoardMapper"%>
<%@page import="com.smhrd.textminer.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>지원사업 공고 게시판</title>


<link rel="stylesheet" href="css/board.css">

</head>


<body class="scroll">

	<div id="wrap">
		<header class="header">
			<div class="headerConts">
				<div class="header_left">
					<ul class="item">
						<li class="s_logo"><a href="/"><img
								src="image/head_logo.png"></a></li>
					</ul>
				</div>
				<div class="header_right">
					<ul class="item">
						<li><a href="board.html">지원사업 공고</a></li>
						<li><a href="mypage.html">MY PAGE</a></li>
						<li><a href="main.html">LOG OUT</a></li>
					</ul>
				</div>
			</div>
			<!-- headerConts -->
		</header>
		<!-- header -->


		<div class="mainWrap">
			<div class="visual">
				<strong>지원사업 공고</strong>
			</div>
			<!--visual -->
			<div class="ContsWrap">
				<div class="keywordWrap">
					<div class="selectBox click">
						<button class="label">지원사업명</button>
						<ul class="optionList">
							<li class="optionItem"><a href="">지원사업명</a></li>
							<li class="optionItem"><a href="">사업분야</a></li>
							<li class="optionItem"><a href="">지자체</a></li>
						</ul>
						<script type="text/javascript" src="../JS/board.js"></script>
					</div>
					<!-- selectBox -->
					<form action="#">
						<input class="search__input" type="text"
							placeholder="검색어를 입력해주세요.">
					</form>
				</div>
				<!--keywordWrap-->
				<div class="tag_ul_list">
					<ul class="tag_ul">
						<li><a href="">금융</a></li>
						<li><a href="">제조업</a></li>
						<li><a href="">에너지</a></li>
						<li><a href="">블록체인</a></li>
					</ul>
				</div>
				<!--tag_ul_list-->
				<div class="main">
					<div class="board">
						<table>
							<thead>
								<tr>
									<th>번호</th>
									<th>사업분야</th>
									<th>지원사업명</th>
									<th>지역</th>
									<th>시작일자</th>
									<th>마감일자</th>
								</tr>
							</thead>
							<tbody>
							<%
							// 페이징 처리 관련 코드
							HttpSession sessions = request.getSession();
							
						    
							int cnt = (int)sessions.getAttribute("cnt");
						    int currentPage = 1;
						    if(request.getParameter("page") != null) {
						        currentPage = Integer.parseInt(request.getParameter("page"));
						    }
						    int limit = (int)sessions.getAttribute("limit"); // 한페이지당 보여줄 게시글 수 
						    //int limit = (int)sessions.getAttribute("limit");
						   	int offset = (int)sessions.getAttribute("offset");  //현재 페이지의 게시글 시작위치
						    //int offset = (int)sessions.getAttribute("offset");
						    int totalPage = (int)sessions.getAttribute("totalPage");
							
						    
						    //List<BoardDTO> boardList = (List<BoardDTO>) session.getAttribute("list");
							%>
					
							<% 
							// 게시물 내용 출력하는 코드
							List<BoardDTO> list = (List<BoardDTO>)sessions.getAttribute("list");
							
							for(int i = 0; i < limit && i < list.size(); i++){
								
								BoardDTO bdto = list.get(i);
								
								int seq = bdto.getB_seq();
								String keyword = bdto.getB_keyword();
								String title = bdto.getB_title();
								String region = bdto.getB_region();
								Date sdate = bdto.getB_sdate();
								Date edate = bdto.getB_edate();
								
							
							
							// 데이터 날짜 폼 바꿔주는 코드
							SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
							Date transSdate = bdto.getB_sdate();
							String tSdate = dateFormat.format(transSdate);
							Date transEdate = bdto.getB_edate();
							String tEdate = dateFormat.format(transEdate);
							%>
							<tr>
								<td><%=seq%></td>
								<td class="ellipsis"><%=keyword%></td>
								<td><a href="/conts1?b_seq=<%=seq%>"><%=title %></a></td>
								
								<td><%=region%></td>
								<td><%=tSdate%></td>
								<td><%=tEdate%></td>
							</tr>
							<%
								}
							%>


							</tbody>
						</table>
						
						<!--  페이지 번호 출력 -->
					    <br>
					<div class="page-wrap">
					    <div class="page-nation"> 
					    <% for(int i = 1; i <= totalPage; i++) { %>
					        <% if(i == currentPage) { %>
					            <a href="board?page=<%=i%>"><%=i%></a>
					        <% } else { %>
					            <a href="board?page=<%=i%>"><%=i%></a>
					        <% } %>
					    <% } %>
					    
						  </div>
						</div>  
						<%-- 
						<div class="page-wrap">
						<ul class="page-nation">
							<% if (startPage > 10) { %>
							<li><a href="?pageNum=<%=startPage-pageBlock%>">&lt;&lt;</a></li>
							<% } %>
							
							<% for (int i = startPage; i <=endPage; i++) { %>
								<% if( i == pageNum) { %>
								 <li class="active"><a href="#!"><%=i%></a></li>
								<% } else { %> 
								<li><a href="?pageNum=<%=i%>"><%=i%></a></li>
								<%} %>
							<%} %>
							
							<% if (endPage < totalPage) { %>
							<li><a href="?pageNum=<%=startPage+pageBlock%>">&gt;&gt;</a></li>
   							 <% } %>	
						</ul>
						</div> --%>
						
						
						<!-- <div class="page-wrap">

                            <ul class="page-nation">
                                <li><a href="/board/list?p=1">1</a></li>
                                <li><a href="/board/list?p=2">2</a></li>
                                <li><a href="/board/list?p=3">3</a></li>
                          
                            </ul>
                        </div> -->
					</div>
					<!--board -->
				</div>
				<!-- main -->
			</div>
			<!--ContsWrap -->
		</div>
		<!-- mainWrap -->
		<div class="footer">
			<div class="fooeterConts">
				<p id="p_logo">match-up</p>
				<p id="p_ment">
					광주 동구 예술길 31-15 3층 <span>062-655-3509,9</span>
				</p>
				<p id="p_ment">Copyrightⓒ2023 Team TextMiner.AllRightReserved.</p>
			</div>
			<!-- footerConts -->
		</div>
		<!-- footer -->

	</div>
	<!-- #wrap -->
</body>

</html>