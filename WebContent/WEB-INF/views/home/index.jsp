<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
				<h1 class = "hidden">카테고리메뉴</h1>
				<ul id = "category-menu" class = "clearfix">
					<li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/candle.png" alt ="공예"></a></li>
				   	<li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/furniture.png" alt ="가구"></a></li>
				    <li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/jungkart.png" alt ="정크아트"></a></li>
				    <li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/art.png" alt ="미술"></a></li>
				    <li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/photo.png" alt ="사진"></a></li>
				    <li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/art1.png" alt ="미술2"></a></li>
				    <li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/cup.png" alt ="컵"></a></li>
				    <li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/art2.png" alt ="공예"></a></li>
				    <li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/case.png" alt ="케이스"></a></li>
				    <li><a href = "${ctx}/product/displayProduct"><img src ="${ctx}/content/home/images/art3.png" alt ="공예"></a></li>
				</ul>
				<div id = "rank-visual">
                	<div class = "content-container">  
                		<h3 id ="rank-title">
                			☆이달의 랭킹☆
                		</h3>	
                		
                		<ul class="rank-list">
                			<li class="box-wrap">
                				<div class="box">
                					<div class="img-wrap">
                						<a href="">
                							<img alt="" src="${ctx}/content/home/images/art.png">
                						</a>
                					</div>
                					<div class="text-wrap">
                						<a href="">
                							<p>"1위 상품"</p>
                						</a>
                					</div>
                					<ul class="info-list">
                						<li class="info-01">핸드메이드 목도리</li>
                						<li class="info-02">10,000원</li>
                						<li class="info-03">쌍용작가</li>
                					</ul>
                				</div>     
                			</li>
                			<li class="box-wrap">
                				<div class="box">
                					<div class="img-wrap">
                						<a href="">
                							<img alt="" src="${ctx}/content/home/images/candle.png">
                						</a>
                					</div>
                					<div class="text-wrap">
                						<a href="">
                							<p>"2위 상품"</p>
                						</a>
                					</div>
                					<ul class="info-list">
                						<li class="info-01">핸드메이드 모자</li>
                						<li class="info-02">10,000원</li>
                						<li class="info-03">쌍용작가</li>
                					</ul>
                				</div>     
                			</li>
                			
                			<li class="box-wrap">
                				<div class="box">
                					<div class="img-wrap">
                						<a href="">
                							<img alt="" src="${ctx}/content/home/images/art1.png">
                						</a>
                					</div>
                					<div class="text-wrap">
                						<a href="">
                							<p>"3위 상품"</p>
                						</a>
                					</div>
                					<ul class="info-list">
                						<li class="info-01">핸드메이드 귀마개</li>
                						<li class="info-02">10,000원</li>
                						<li class="info-03">쌍용작가</li>
                					</ul>
                				</div>     
                			</li>
                		
                		</ul>
                	</div>
             	</div>
             	
             	<div id = "visual">
                	<div class = "content-container">  
                	</div>
             	</div>
             	
             	<a href="#header" class="btnTop">TOP</a>
 	   	