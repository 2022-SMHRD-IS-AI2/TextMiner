<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>마이페이지</title>

    <link href='https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.10.2/fullcalendar.min.css' rel='stylesheet' />
    <link href='https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.10.2/fullcalendar.print.min.css' rel='stylesheet'
        media='print' />
    <script src='https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js'></script>
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script>
    <script src='https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.10.2/fullcalendar.min.js'></script>
    <link rel="stylesheet" href="css/mypage_member.css"> <!-- css 연결 위치 -->

</head>

<body class="scroll">
    <div id="wrap">
        <header class="header">
            <div class="headerConts">
                <div class="header_left">
                    <ul class="item">
                        <li class="s_logo"><a href="main.html"><img src="../image/head_logo.png"></a></li>
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
                <strong>MY PAGE</strong>
            </div><!--visual -->
            <div class="main">
                <div class="contsWrap">
                    <div class="topMenu">
                        <ul>
                            <li><a href="./mypage.html" class="menuLink">스크랩</a></li>
                            <li><a href="./mypage_member.html" class="menuLink">정보수정</a></li>
                            <li><a href="./mypage_calendar.html" class="menuLink">캘린더</a></li>
                        </ul>
                    </div><!-- topMenu -->
                    <div class="scrapTable">
                        <div class="menuName">
                            <p>캘린더</p>
                        </div><!-- menuName-->
                        <form action="#" method="post">
                            <table>
                                <colgroup>
                                    <col class="w_1">
                                    <col class="w_2">
                                </colgroup>
                                <tbody>
                                    <tr>
                                        <th >아이디</th>
                                        <td class="top-td">yg5057gmail@naver.com</td>
                                    </tr>
                                    <tr>
                                        <th >
                                            <label>이름</label>
                                        </th>
                                        <td>조연경</td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <label>휴대전화</label>
                                        </th>
                                        <td><input type="text" placeholder=" 수정 하실 전화번호를 입력해주세요" name="phonNb"></td>
                                    </tr>
                                    <tr>
                                        <th >
                                            <label>E-MAIL</label>
                                        </th>
                                        <td><input type="text" placeholder="수정 하실 E-MAIL 을 입력해주세요" name="email"></td>
                                    </tr>
                                    <tr>
                                        <th class="bottom-td">
                                            <label>기업 명</label>
                                        </th>
                                        <td class="bottom-td"><input type="text" placeholder="수정 하실 기업 이름을 입력해주세요" name="EnterpriseNM"></td>
                                    </tr>
                                </tbody>
                            </table>
                            <div class="btn">
                                <input type="submit" value="정보수정">
                               <a href="./main.html" class="btn_cancle">취소</a>
                            </div>
                        </form>
                    </div><!-- scrapTable -->
                </div> <!-- contsWrap -->
            </div> <!-- main -->
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