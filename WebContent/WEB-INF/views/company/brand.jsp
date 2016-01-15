<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>




		<div id = "aside">

			<h2  class = "hidden">회사메뉴</h2>

				<h1 id = "menu-title"> 브랜드 소개</h1>

	 	   		<ul   id = "category-menu" >

					<li><a href = "${ctx}/product/displayProduct">회사소개</a></li>

				   	<li><a href = "${ctx}/product/displayProduct">웹사이트 이용안내</a></li>

				    <li><a href = "${ctx}/product/displayProduct">웹사이트 공유</a></li>

				    <li><a href = "${ctx}/product/displayProduct">문의사항</a></li>

				    <li><a href = "${ctx}/product/displayProduct">관련법규</a></li>

				    <li><a href = "${ctx}/product/displayProduct">연락처</a></li>

				    

				</ul>

		</div>

		<main id = "main">

			<div id = "brand">

				<h1 id = "brand-name">

					<p>사이트 명 : </p>

					

					<p>Talent On</p>

				</h1>

				

				

				<h1 id = "brand-img">

					<p>로고 : </p>

					

					<a href="${ctx}/home/index">

						<img src="${ctx}/content/images/logo.png" alt ="TalentOn"/> 

					</a>

				</h1>

				

			</div>

		</main>

		

		

		

		

		

		<%-- <main id = "main">

			 <h1>

				<p>로고 : </p>

			</h1>

			<h1 id = "logo">

				<a href="${ctx}/home/index">

					<img src="${ctx}/content/images/logo.png" alt ="TalentOn"/> 

				</a>

			</h1>

		

		</main> --%>