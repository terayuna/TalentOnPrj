<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<link href="reset.css" type="text/css" rel="stylesheet"> 


<%-- <c:set var="ctx" value="${pageContext.request.contextPath}"/> --%>


<link href="${pageContext.request.contextPath}/content/bidWindow/css/bidWindow.css" type="text/css" rel="stylesheet" />  


<div class="popup popup-bid" id="popup-bid">
	<div>
		<!-- <img src="content/bid/images/test1.png" alt="작품이미지" /> -->
	</div>
	<div class="popup-wrapper">
		<div class="info-box">
			<div>
				<div class="count" id="rest_time_pop_div">
					<span class="label">종료 전 남은 시간 </span> <span class="time">3일
						14시간 51분 17초</span>
				</div>
			</div>
		</div>
		<div class="info-box">
			<div>
				<p class="bid-price">
					입찰 가격
					<textarea class="amount" id="ipchal_price_span"
						placeholder="현재 최고 입찰가 31,000원">
							</textarea>
				</p>
			</div>
		</div>
	</div>
	<div class="confirm">
		<a class="btn-bid" onclick="ipchal_submit();" href="#">지금 입찰</a> <a
			class="btn-bid" onclick="ipchal_submit();" href="#">취소</a>
	</div>
</div>


