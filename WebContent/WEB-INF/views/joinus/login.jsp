<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<div class="content-header">
	<h1 class="primary-title">LOGIN</h1>
	<h2 class="secondary-title" >로그인하시면 TALENT ON의 각종 서비스를 이용하실 수 있습니다.</h2>
</div>

<div class="board-write">
	<form action="<c:url value="/j_spring_security_check"/>" method="post">
		<fieldset>
			<legend class="hidden">로그인 폼</legend>
			<ul id="loginBox" class="clearfix">
				<li class="small-margin">
					<label for="id">&nbsp;&nbsp;&nbsp;아이디</label>
					<input name="j_username" class="text" />
				</li>
				<li class="small-margin">
					<label for="password">비밀번호</label>
					<input name="j_password" type="password" class="text" />
				</li>
			</ul>

			<input type="submit" class="btn btn-large btn-color" value="LOGIN"></a>
			<div style="color:red"><c:if test="${param.error!=null}">아이디 또는 비밀번호가 틀렸습니다.</c:if></div>
		</fieldset>
	</form>
</div>

<div class="board-btns">
	<a href="" class = "btn btn-color">회원가입</a>
	<a href="searchId" class = "btn btn-gray">아이디찾기</a>
	<a href="searchPwd" class = "btn btn-gray">비밀번호찾기</a>
</div>
	
	
	