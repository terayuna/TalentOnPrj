<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script>

window.onload = function(){
	
	
	/* var display= document.querySelector("#radio-display");
	var purchase= document.querySelector("#radio-purchase");
	var bid= document.querySelector("#radio-bid");
	
	var purchaseForm = document.querySelector(".purchase-form-row");
	var bidForm = document.querySelector(".bid-form-row");
	
	display.onclick = function(){
		purchaseForm.style.display="none";
		bidForm.style.display="none";
	};
	
	purchase.onclick = function(){
		purchaseForm.style.display="block";
		bidForm.style.display="none";
	};
	
	bid.onclick = function(){
		purchaseForm.style.display="none";
		bidForm.style.display="block";
	}; */
	
	/* var type = document.querySelectorAll("input[type=radio]");
	var vis;
	
	for(var i=0; i<3 ; i++){
		vis = (type[i].checked) ? "block" : "none";
		type[i].style.display=vis;
	} */
	
	
	/* for(var i=0;i<3;i++){
		type[i].onclick = function(){
			type[i].sytle.display = "block";
		}
	} */
	
	
}

   
</script>

<a class ="btn btn-gray" href="../../home/index">비밀번호 변경</a>

<div class="content-header">
	<h1 class="primary-title">내 정보 변경</h1>
	<h2 class="secondary-title" >정보를 변경하세요</h2>
</div>

<form id ="modify-information" action="" method="post">
	<div id="essential-information">
		<div class="menu" >
			<img id="img" alt="" src="${ctx}/content/purchase/images/saram.JPG"> 
			<h1 id="subtitle">필수 정보</h1>
		</div>	
		<dl class="modify-form-row">
			<dt class="modify-form-title">아이디</dt>
			<dd class="modify-form-data">
				<input type="text" name="id" value="${member.id}" readonly/>
			</dd>
		</dl>
		 
		<dl class="modify-form-row">
			<dt class="modify-form-title">이름</dt>
			<dd class="modify-form-data">
				<input type="text" name="name" value="${member.name}" readonly/>
			</dd>
		</dl>
		
		
		<!-- <dl class="modify-form-row">
			<dt class="modify-form-title">비밀번호 확인</dt>
			<dd class="modify-form-data">
				<input type="password" name="password-check"/>
			</dd>
		</dl> -->
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">이메일</dt>
			<dd class="modify-form-data">
				<input type="email" name="email" value="${member.email}"/>
			</dd>
		</dl>
	</div>
	<div id="additory-information">
		<div class="menu" >
			<img id="img" alt="" src="${ctx}/content/purchase/images/saram.JPG"> 
			<h1 id="subtitle">부가 정보</h1>
		</div>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">주소</dt>
			<dd class="modify-form-data">
				<input type="text" name="address" value="${member.address}"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">휴대 전화</dt>
			<dd class="modify-form-data">
				<input type="text" name="phone" pattern="\d{3}\-\d{4}\-\d{4}" value="${member.phone}"/><span>   	[-를 포함해주세요 ex) 010-1234-5678]</span>
			</dd>
		</dl>
		
		<!-- <dl class="modify-form-row">
			<dt class="modify-form-title">SNS</dt>
			<dd class="modify-form-data">
				<input type="text" name="sns" value="SNS"/>
			</dd>
		</dl> -->
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">자기소개</dt>
			<dd class="modify-form-data">
				<input type="text" name="self_introduction" value="${member.self_introduction}"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">작가알림</dt>
			<dd class="modify-form-data">
				<input type="radio" name="notification_status" value="yes"
					<c:if test="${member.notification_status=='yes'}"> checked</c:if>/>
				<label for="type1">네</label>
				<input type="radio" name="notification_status" value="no"
					<c:if test="${member.notification_status=='no'}"> checked</c:if>/>
				<label for="type2">아니오</label>
			</dd>
		</dl>
	</div>
	
	<p class="article-control">
		<input class="btn btn-color" type="submit" value="변경하기"/>
		<a class ="btn btn-gray" href="../../home/index">취소하기</a>
	</p>
</form>