<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<div class="content-header">
	<h1 class="primary-title">결제</h1>
	<h2 class="secondary-title" >선택한 상품을 결제 합니다.</h2>
</div>



<div id="purchase-form">
	<div class="menu" >
		<img id="img" alt="" src="${ctx}/content/purchase/images/saram.JPG"> 
		<h1 id=menu-name >
		낙찰 정보
		</h1>
	</div>

		<dl class="purchase-form-row">
			<dt class="purchase-form-title">판매자</dt>
			 <dd class="purchase-form-data">
			</dd> 
		</dl>
		 
		<dl class="purchase-form-row">
			<dt class="purchase-form-title">물품명</dt>
			<dd class="purchase-form-data">
			
			</dd>
		</dl>
		
		<dl class="purchase-form-row">
			<dt class="purchase-form-title">낙찰금액</dt>
			<dd class="purchase-form-data">
				
			</dd>
		</dl>
		 
		<dl class="purchase-form-row">
			<dt class="purchase-form-title">배송비</dt>
			<dd class="purchase-form-data">
				
			</dd>
		</dl>
		
		
	<div class="menu">
		<img id="img" alt="" src="${ctx}/content/purchase/images/saram.JPG"> 
		<h1 id=menu-name>
		받는사람 정보
		</h1>
	</div>

		<dl class="purchase-form-row">
			<dt class="purchase-form-title">이름</dt>
			<dd class="purchase-form-data">
				<input id="uid" type="text" name="id" autofocus required/>
				<span id="id_signed"></span>
			</dd>
		</dl>
		 
		<dl class="purchase-form-row">
			<dt class="purchase-form-title">핸드폰번호</dt>
			<dd class="purchase-form-data">
				<input type="text" name="phone" pattern="\d{3}\-\d{4}\-\d{4}" required/><span>   	[-를 포함해주세요 ex) 010-1234-5678]</span>
			</dd>
		</dl>
		
		<dl class="purchase-form-row">
			<dt class="purchase-form-title">배송주소</dt>
			<dd class="purchase-form-data">
				<input type="text" name="name" required/>
			</dd>
		</dl>
		 
		<dl class="purchase-form-row">
			<dt class="purchase-form-title">이메일</dt>
			<dd class="purchase-form-data">
				<input type="email" name="email" required/>
			</dd>
		</dl>
		
	<div class="menu" >
		<img id="img" alt="" src="${ctx}/content/purchase/images/saram.JPG"> 
		<h1 id=menu-name >
		결제 정보
		</h1>
	</div>

		<dl class="purchase-form-row">
			<dt class="purchase-form-title">결제 수단 선택</dt>
			 <dd class="purchase-form-data">
			 	<input type="radio" name="purchase_type" id="radio-money" value="무통장입금" checked/>
					<label for="type1">무통장입금</label>
				<input type="radio" name="purchase_type" id="radio-credit" value="신용카드"/>
					<label for="type2">신용카드</label>
				<input type="radio" name="purchase_type" id="radio-phone" value="휴대폰결제"/>
					<label for="type2">휴대폰결제</label>
			</dd> 
		</dl>
		
		
		<p class="btnInTable">
			<input id="submit" class="btn btn-color" type="submit" value="결제하기" />
			<a class = "btn btn-gray" href="../home/index">취소하기</a> <!-- 나중에 메인확정되면 메인으로! -->
		</p>
		
</div>
				
				

