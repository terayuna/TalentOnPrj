<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

    	<h1 class="hidden">회사정보</h1>
		    	<nav id ="company-menu">
					<h1 class = "hidden">회사메뉴</h1>
					<ul class="clearfix">
						<li><a href = "${ctx}/company/brand">회사소개</a></li>
					   	<li><a href = "">웹사이트 이용안내</a></li>
					    <li><a href = "">웹사이트 공유</a></li>
					    <li><a href = "${ctx}/company/brand">문의사항</a></li>
					    <li><a href = "">관련법규</a></li>
					    <li><a href = "">연락처</a></li> 
					</ul>
				</nav>
