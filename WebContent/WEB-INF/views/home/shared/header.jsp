<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
				<h1 id = "logo">
					<a href="${ctx}/home/index">
						<img src="${ctx}/content/images/logo2.png" alt ="TalentOn"/> 
					</a>
				</h1>
				
				<h2 class = "hidden">회원메뉴</h2>
					<ul id ="join-menu" class="clearfix">
						<c:if test="${pageContext.request.userPrincipal==null }">
					    	<li><a href = "${ctx}/joinus/join">JOIN</a></li>
					    	<li><a href = "${ctx}/joinus/login">LOGIN</a></li>
				    	</c:if>
						<c:if test="${pageContext.request.userPrincipal!=null }">
							<li><a href = "${ctx}/myPage/myInformation/modifyInformation">MYPAGE</a></li>
							<li><a href = "${ctx}/upload/uploadProduct">UPLOAD</a></li>
							<li>
								<c:url var="logout" value="/j_spring_security_logout"/>
								<a href="${logout}">
								<security:authentication property ="name"/>LOGOUT</a>
							</li>
							
						</c:if>
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
							<li><a href = "${ctx}/company/brand">브랜드</a></li>
						   	<li><a href = "">작품보기</a></li>
						    <li><a href = "${ctx}/upload/uploadProduct">작품등록</a></li>
						    <li><a href = "${ctx}/customer/notice">공지사항</a></li>
						</ul>
		
