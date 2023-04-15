
<%@page import="java.util.List"%>
<%@page import="com.smhrd.textminer.mapper.BoardMapper"%>
<%@page import="com.smhrd.textminer.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>지원사업 공고 게시판</title>

    <link rel="stylesheet" href="css/board.css">
    
   <%  List<BoardDTO> dto = (List<BoardDTO>)session.getAttribute("list");%>
                    
   					
</head>




<body class="scroll">
    <div id="wrap">
        <header class="header">
            <div class="headerConts">
                <div class="header_left">
                    <ul class="item">
                        <li class="s_logo"><a href="/"><img src="image/head_logo.png"></a></li>
                    </ul>
                </div>
                <div class="header_right">
                    <ul class="item">
                        <li><a href="board.html">지원사업 공고</a></li>
                        <li><a href="mypage.html">MY PAGE</a></li>
                        <li><a href="main.html">LOG OUT</a></li>
                    </ul>
                </div>
            </div><!-- headerConts -->
        </header> <!-- header -->
        
      
        <div class="mainWrap">
            <div class="visual">
                <strong>지원사업 공고</strong>
            </div><!--visual -->
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
                    </div><!-- selectBox -->
                    <form action="#">
                        <input class="search__input" type="text" placeholder="검색어를 입력해주세요.">
                    </form>
                </div><!--keywordWrap-->
                <div class="tag_ul_list">
                       <ul class="tag_ul">
                        <li><a href="">금융</a></li>
                        <li><a href="">제조업</a></li>
                        <li><a href="">에너지</a></li>
                        <li><a href="">블록체인</a></li>
                    </ul>
                </div><!--tag_ul_list-->
                <div class="main">
                    <div class="board">
                        <table>
                            <thead>
                                   <tr>
                                    <th>번호</th>
                                    <th>사업분야</th>
                                    <th>지원사업명</th>
                                    <th>신청기간</th>
                                    <th>지자체</th>
                                    <th>등록일</th>
                                </tr>
                            </thead>
                            <tbody>
                            
                            
                            <%	
                            	for(int i = 0; i< dto.size() ;i++) {
                            	
                            	BoardDTO dtodto = dto.get(i);
   								
		   						int seq = dtodto.getB_seq();
		   						String keyword = dtodto.getB_keyword();
		                    	String title = dtodto.getB_title();
		                    	String region = dtodto.getB_region();
                            	
		
		                    %>
                            
                            
                            
							    <tr>
							         <td><%=seq%></td>    
							         <td><%=keyword %></td>
							         <td><%=title %></td>
							         <td>신청기간입력란</td>
							         <td><%=region %></td>
                                     <td>등록날자입력란</td>
							    </tr>
							    <%} %>
                                <!-- <tr>
                                    <td>2</td>
                                    <td>금융</td>
                                    <td><a href="/conts">생산자금(2023년·신재생에너지 금융지원사업 지원 공고)</a></td>
                                    <td>2023-04-17 ~ 2023-12-31</td>
                                    <td>산업통상 자원부</td>
                                    <td>2023-04-03</td>
                                </tr>
                                <tr>
                                    <td>3</td>
                                    <td>금융</td>
                                    <td><a href="/conts">생산자금(2023년·신재생에너지 금융지원사업 지원 공고)</a></td>
                                    <td>2023-04-17 ~ 2023-12-31</td>
                                    <td>산업통상 자원부</td>
                                    <td>2023-04-03</td>
                                </tr>
                                <tr>
                                    <td>4</td>
                                    <td>금융</td>
                                    <td><a href="/conts">생산자금(2023년·신재생에너지 금융지원사업 지원 공고)</a></td>
                                    <td>2023-04-17 ~ 2023-12-31</td>
                                    <td>산업통상 자원부</td>
                                    <td>2023-04-03</td>
                                </tr>
                                <tr>
                                    <td>5</td>
                                    <td>금융</td>
                                    <td><a href="/conts">생산자금(2023년·신재생에너지 금융지원사업 지원 공고)</a></td>
                                    <td>2023-04-17 ~ 2023-12-31</td>
                                    <td>산업통상 자원부</td>
                                    <td>2023-04-03</td>
                                </tr>
                                <tr>
                                    <td>6</td>
                                    <td>금융</td>
                                    <td><a href="/conts">생산자금(2023년·신재생에너지 금융지원사업 지원 공고)</a></td>
                                    <td>2023-04-17 ~ 2023-12-31</td>
                                    <td>산업통상 자원부</td>
                                    <td>2023-04-03</td>
                                </tr>
                                <tr>
                                    <td>7</td>
                                    <td>금융</td>
                                    <td><a href="/conts">생산자금(2023년·신재생에너지 금융지원사업 지원 공고)</a></td>
                                    <td>2023-04-17 ~ 2023-12-31</td>
                                    <td>산업통상 자원부</td>
                                    <td>2023-04-03</td>
                                </tr>
                                <tr>
                                    <td>8</td>
                                    <td>금융</td>
                                    <td><a href="/conts">생산자금(2023년·신재생에너지 금융지원사업 지원 공고)</a></td>
                                    <td>2023-04-17 ~ 2023-12-31</td>
                                    <td>산업통상 자원부</td>
                                    <td>2023-04-03</td>
                                </tr>
                                <tr>
                                    <td>9</td>
                                    <td>금융</td>
                                    <td><a href="/conts">생산자금(2023년·신재생에너지 금융지원사업 지원 공고)</a></td>
                                    <td>2023-04-17 ~ 2023-12-31</td>
                                    <td>산업통상 자원부</td>
                                    <td>2023-04-03</td>
                                </tr>
                                <tr>
                                    <td>10</td>
                                    <td>금융</td>
                                    <td><a href="/conts">생산자금(2023년·신재생에너지 금융지원사업 지원 공고)</a></td>
                                    <td>2023-04-17 ~ 2023-12-31</td>
                                    <td>산업통상 자원부</td>
                                    <td>2023-04-03</td>
                                </tr> -->
                            </tbody>
                        </table>
                        <div class="page-wrap">
                            <ul class="page-nation">
                                <li><a href="/board/list?p=1">1</a></li>
                                <li><a href="/board/list?p=2">2</a></li>
                                <li><a href="/board/list?p=3">3</a></li>
                                <li><a href="/board/list?p=4">4</a></li>
                                <li><a href="/board/list?p=5">5</a></li>
                            </ul>
                        </div>
                    </div> <!--board -->
                </div> <!-- main -->
            </div><!--ContsWrap -->
        </div><!-- mainWrap -->
        <div class="footer">
            <div class="fooeterConts">
                <p id="p_logo">match-up</p>
                <p id="p_ment">광주 동구 예술길 31-15 3층 <span>062-655-3509,9</span></p>
                <p id="p_ment">Copyrightⓒ2023 Team TextMiner.AllRightReserved.</p>
            </div><!-- footerConts -->
        </div><!-- footer -->

    </div><!-- #wrap -->
</body>

</html>