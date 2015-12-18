<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
				<h1 id = "logo">
					<img src="../../content/images/logo2.png" alt ="TalentOn"/>
				</h1>
				
				<h2 class = "hidden">회원메뉴</h2>
					<ul id ="join-menu" class="clearfix">
						<li><a href = "/TalentOnProject/joinus/login">JOIN</a></li>
					   	<li><a href = "home_uploadProduct.jsp">UPLOAD</a></li>
					    <li>
					    	<c:if test="${pageContext.request.userPrincipal == null}">
					    	<a href = "/TalentOnProject/joinus/login">LOGIN</a>
					    	</c:if>
					    </li>
					</ul>
					<form id = "main-search">
						<fieldset>
							<legend class = "hidden">전체검색필드</legend>
							<input type = "text"/>
							<input type = "submit" value = "검색"/>
						</fieldset>
					</form>
					
					
					<h2  class = "hidden">메인메뉴</h2>
			 	   		<ul  id = "header-main-menu" >
							<li><a href = "../company/company_main.jsp">브랜드</a></li>
						   	<li><a href = "home_product.jsp">작품보기</a></li>
						    <li><a href = "home_uploadProduct.jsp">작품등록</a></li>
						    <li><a href = "home_notice.jsp">공지사항</a></li>
						</ul>
		
