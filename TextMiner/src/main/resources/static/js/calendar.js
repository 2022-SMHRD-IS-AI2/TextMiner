$(document).ready(function() {
	var calendar = $('#calendar').fullCalendar({
		// 캘린더 옵션
		selectable: true,
		selectHelper: true,
		editable: true,
		eventLimit: true,
		events: [
			// 일정 데이터
		],
		select: function(start, end) {
			// 일정 추가 모달창 열기
			var title = prompt('일정 제목:');
			var eventData;
			if (title) {
				eventData = {
					title: title,
					start: start,
					end: end
				};
				calendar.fullCalendar('renderEvent', eventData, true); // 일정 렌더링
			}
			calendar.fullCalendar('unselect');
		},
		editable: true,
		eventDrop: function(event, delta, revertFunc) {
			// 일정 이동시
		},
		eventResize: function(event, delta, revertFunc) {
			// 일정 리사이즈시
		},
		eventClick: function(event, jsEvent, view) {
			// 일정 클릭시
		}
	});

		 $.ajax({
		        type:"GET", // 겟으로 해도됨
		        url:url, // 서블릿 유알엘 매핑값
		        dataType:"text", // 받아올때 데이터 타입
		        data:{  // 보낼데이터 ()
		            //name : $('#ajaxConName').val(),
		            //age : $('#ajaxConAge').val(), 
		            seq : b_seq
		        },
		        success : function(data){ // 성공했을때
		           // alert('ajax GET 통신 성공');
		            
		            if(data == "성공"){
						alert('scrap하셨습니다!');
					}else{
						alert('실패');
					}
					
		            //var $div = $('<div></div>');
		            //var text = document.createTextNode(data);
		            //$div.append(data);
		            //$div.appendTo($('#myDiv'))
		        
		        },
		        error : function(request,status,error){ // 통신자체 실패했을때
		            alert('code:'+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error); //에러 상태에 대한 세부사항 출력
		            alert(e);
		        }
		    })

});
