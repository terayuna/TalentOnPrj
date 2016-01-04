<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link href="${ctx}/content/myPage/myInformation/css/modifyInformation.css" type="text/css" rel="stylesheet" /> 
	<link href="${ctx}/content/myPage/myInformation/css/<tiles:getAsString name="css"/>" type="text/css" rel="stylesheet" />
	</head>
<body>
	<header id ="header">
		<div class = "content-container">
			<tiles:insertAttribute name="header"/>
		</div>
	</header>
	
	<div id="body">
		<div class="content-container clearfix">
			<aside id="aside">
				<nav>
					<tiles:insertAttribute name="aside"/>
				</nav>
			</aside>
			
			<main id="main">
				<tiles:insertAttribute name="content"/>
			</main>
		</div>
		
	</div>
	<footer id = "footer">
		<div class = "content-container">
    	<section>
	    	<tiles:insertAttribute name="footer"/>
		</section> 
		</div>
	</footer>
</body>
</html>