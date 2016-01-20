<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="content-header">
	<h1 class="primary-title">내 정보 변경</h1>
	<h2 class="secondary-title" >정보를 변경하세요</h2>
</div>

<form id ="modify-information" action="" method="post">
	<div id="essential-information">
		<h1 id="subtitle">필수 정보</h1>
		<dl class="modify-form-row">
			<dt class="modify-form-title">아이디</dt>
			<dd class="modify-form-data">
				<input type="text" name="id" value="아이디"/>
			</dd>
		</dl>
		 
		<dl class="modify-form-row">
			<dt class="modify-form-title">이름</dt>
			<dd class="modify-form-data">
				<input type="text" name="name"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">비밀번호</dt>
			<dd class="modify-form-data">
				<input type="password" name="password" value=""/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">비밀번호 확인</dt>
			<dd class="modify-form-data">
				<input type="password" name="password-check"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">이메일</dt>
			<dd class="modify-form-data">
				<input type="email" name="email"/>
			</dd>
		</dl>
	</div>
	<div id="additory-information">
		<h1 id="subtitle">부가 정보</h1>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">주소</dt>
			<dd class="modify-form-data">
				<input type="text" name="address" value="주소"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">휴대 전화</dt>
			<dd class="modify-form-data">
				<input type="text" name="phone" pattern="\d{3}\-\d{4}\-\d{4}" required/><span>   	[-를 포함해주세요 ex) 010-1234-5678]</span>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">SNS</dt>
			<dd class="modify-form-data">
				<input type="text" name="id" value="SNS"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">자기소개</dt>
			<dd class="modify-form-data">
				<input type="text" name="id" value="자기소개"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">작가알림</dt>
			<dd class="modify-form-data">
				<input type="radio" name="ab" value="yes"/>
					<label for="type1">네</label>
				<input type="radio" name="ab" value="no" checked/>
					<label for="type2">아니오</label>
			</dd>
		</dl>
	</div>
	
	<p class="article-control">
		<input class="btn btn-color" type="submit" value="가입하기"/>
		<a class ="btn btn-gray" href="../../home/index">취소하기</a>
	</p>
</form>