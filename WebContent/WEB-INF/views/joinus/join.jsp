<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
				<input type="text" name="id"/>
				<input id="checkUidButton" class="button" type="button" value="중복확인"/>
			</dd>
		</dl>
		 
		<dl class="join-form-row">
			<dt class="join-form-title">비밀번호</dt>
			<dd class="join-form-data">
				<input type="password" name="password"/>
			</dd>
		</dl>
		 
	
		
		<dl class="join-form-row">
			<dt class="join-form-title">이름</dt>
			<dd class="join-form-data">
				<input type="text" name="name"/>
			</dd>
		</dl>
		 
		<dl class="join-form-row">
			<dt class="join-form-title">핸드폰번호</dt>
			<dd class="join-form-data">
				<input type="text" name="phone"/><span>   	[-를 포함해주세요 ex) 010-1234-5678]</span>
			</dd>
		</dl>
		
		<dl class="join-form-row">
			<dt class="join-form-title">이메일</dt>
			<dd class="join-form-data">
				<input type="email" name="email"/>
			</dd>
		</dl>
		<p class="btnInTable">
			<input class="btn btn-color" type="submit" value="가입하기" />
			<a class = "btn btn-gray" href="../home/index">취소하기</a> <!-- 나중에 메인확정되면 메인으로! -->
		</p>
	</form>
</div>