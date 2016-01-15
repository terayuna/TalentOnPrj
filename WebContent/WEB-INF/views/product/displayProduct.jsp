<%@ page language="java" contentType="text/html; charset=UTF-8" 

    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

		<div id = "aside">
			<h1  class = "hidden">카테고리메뉴</h1>
				<h1 id = "menu-title"> 카테고리</h1>
	 	   		<ul id = "category-menu" >
					
					<li><a href = "${ctx}/product/displayProduct">전체보기</a></li>
					<li><a href = "${ctx}/product/displayProduct">미술</a></li>
				   	<li><a href = "${ctx}/product/displayProduct">공예</a></li>
				    <li><a href = "${ctx}/product/displayProduct">건축</a></li>
				    <li><a href = "${ctx}/product/displayProduct">사진</a></li>
				    <li><a href = "${ctx}/product/displayProduct">컴퓨터아트</a></li>
				    <li><a href = "${ctx}/product/displayProduct">정크아트</a></li>
				    <li><a href = "${ctx}/product/displayProduct">가구</a></li>
				    <li><a href = "${ctx}/product/displayProduct">모형/피규어</a></li>
				    <li><a href = "${ctx}/customer/notice">문학</a></li>
				    <li><a href = "${ctx}/customer/notice">카테고리 외</a></li>
				</ul>
		</div>
		<main id = "main">
			<fieldset id ="tab">
				<legend class="hidden">
					목록 검색 폼
				</legend>
				<input type="hidden" name="pg" value="" />
				<label for="f"
				class="hidden">검색필드</label>
				<select name="f">
					<option value="RECOMMEND" >추천순</option>
					<option value="NEW" >최신순</option>
					<option value="COMMENT" >댓글순</option>
					<option value="AUCTION" >경매중</option>
					<option value="SELL" >판매중</option>
					<option value="DISPLAY" >전시중</option>
				</select>
				<label class="hidden" for="q">검색어</label>
				<input type="text" name="q" value='${param.q}' />
				<input type="submit" value="검색" />
			</fieldset>
			
			<ul id ="product-list">

				<c:forEach var="i" begin="1" end="9">
				<li>
					<a href = "${ctx}/product/productDetail">
						<img alt="" src="${ctx}/content/home/images/art1.png">
						<p class = "itemNo"> item No.</p>		
						<p>Title :</p>
						<p class = "price">price : </p>	
					</a>
				</li>
				</c:forEach> 
			</ul>
		</main>
