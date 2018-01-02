$(document).ready(function(){
	// navMenu setting
	$.ajax({
		type : "GET",
		url : "http://localhost:8080/privateBlog/sample/getMenuList.do",
		dataType : 'jsonp',
		error : function(){
			alert("수신 실패");
		},
		success : function(data){
			console.log(data);
		}
	});

	// left nav menu append() test


	// 마우스 클릭 : console.log 출력
	$(".menuLv1").click(function(){
		var id = $(this).attr('id');
		alert("id : " + id);
	});

	$("#menu100").on("click",function(){
		alert('clicked!');
		/* 다른 사이트로 이동 */
		// $(location).attr('href',"http://www.naver.com");
		// location.href = "http://www.naver.com";
		/* 다른 파일(html)로 이동 */
		location.href = "./moved.html";
	});

	// nav-menu 클래스에 마우스 호버링 시
	$(".nav-menu li").hover(function(){
		// 해당 li 태그에 속한 ul 태그를 보여준다
		$("ul:first",this).show();
	}, function(){
		// 마우스 뗐을 때 : 숨긴다.
		$("ul:first",this).hide();
	});
});