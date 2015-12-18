<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
			<link href="${ctx}/content/joinus/css/login.css" type="text/css" rel="stylesheet" /> 
			<link href="${ctx}/content/joinus/css/<tiles:getAsString name="css"/>" type="text/css" rel="stylesheet" />  	
	</head>
<body>
	<header id ="header">
		<div class = "content-container">
				<tiles:insertAttribute name="header"/>
		</div>
	</header>
	
    <div id ="body">
		<div id = "content" class="page-content">
			<div class="wrapper">
				<tiles:insertAttribute name="content"/>
			</div>
		</div>
	</div>
 	
 	<footer id ="footer">
 		<div class = "content-container">
    	<section>
	    	<tiles:insertAttribute name="footer"/>
		</section> 
		</div>
 	</footer>

</body>
</html>