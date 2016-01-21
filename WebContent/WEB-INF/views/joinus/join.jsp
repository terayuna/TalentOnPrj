<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script src="http://code.jquery.com/jquery-2.2.0.min.js"
	type="text/javascript">
</script>
	
<script>



$(document).ready(function(){
	
	var check = false;
	
	
	$("#checkUidButton").click(function() {
		var uid = $("#uid").prop("value");
		var data="uid="+uid;
		var request = new XMLHttpRequest();
		
		if(uid == ""){
            alert('ID를 입력해주세요.');
        }

		request.onreadystatechange=function(){
			
			if(request.readyState==4)   // operation is complete
			{
				
				if(request.responseText==="ok") {
					$('#id_signed').html("사용가능한 ID입니다").css('color', 'green');
					check = true;
				}
				else {
					$('#id_signed').html("중복된 ID입니다").css('color', 'red'); 
					check = false;
				}
			}
		};

		request.open("POST","idCheck",true);  //false면 동기, true면 비동기식
		request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		request.setRequestHeader("Content-length", data.length);
		request.setRequestHeader("Connection", "close");
		request.send(data); 
		
	});
	
	$("#submit").click(function(event) {
		
		if(check==false) {
			event.preventDefault();
			alert("ID중복체크를 하세요");
		}
		
	});
	
});
</script>
<!-- 정규표현식으로 이메일 번호 다 거르기 (pattern속성) -->
<div class="content-header">
	<h1 class="primary-title">회원 가입</h1>
	<h2 class="secondary-title" >로그인하시면 TALENT ON의 각종 서비스를 이용하실 수 있습니다.</h2>
</div>
<!-- thead:무조건 단일 사용/ tbody:중복가능,게시판의 공지사항부분과 글부분 나눌때 중복이 사용된다 -->

<div id="join-form">
	<form action="" method="post">
		<dl class="join-form-row">
			<dt class="join-form-title">아이디</dt>
			<dd class="join-form-data">
				<input id="uid" type="text" name="id" autofocus required/>
				<input id="checkUidButton" class="button" type="button" value="중복확인"/>
				<span id="id_signed"></span>
			</dd>
		</dl>
		 
		<dl class="join-form-row">
			<dt class="join-form-title">비밀번호</dt>
			<dd class="join-form-data">
				<input type="password" name="password" required/>
			</dd>
		</dl>
		
		
		<dl class="join-form-row">
			<dt class="join-form-title">이름</dt>
			<dd class="join-form-data">
				<input type="text" name="name" required/>
			</dd>
		</dl>
		 
		<dl class="join-form-row">
			<dt class="join-form-title">핸드폰번호</dt>
			<dd class="join-form-data">
				<input type="text" name="phone" pattern="\d{3}\-\d{4}\-\d{4}" required/><span>   	[-를 포함해주세요 ex) 010-1234-5678]</span>
			</dd>
		</dl>
		
		<dl class="join-form-row">
			<dt class="join-form-title">이메일</dt>
			<dd class="join-form-data">
				<input type="email" name="email" required/>
			</dd>
		</dl>
		<p class="btnInTable">
			<input id="submit" class="btn btn-color" type="submit" value="가입하기" />
			<a class = "btn btn-gray" href="../home/index">취소하기</a> <!-- 나중에 메인확정되면 메인으로! -->
		</p>
	</form>
</div>