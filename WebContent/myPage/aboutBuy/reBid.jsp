<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../../content/css/reset.css" type="text/css" rel="stylesheet" />
<link href="../css/aboutBuy/reBid.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<header id ="header">
      <div class = "content-container">
      <h1 id = "logo"><a href="../home/home_main.html" >
         <img src="../../images/logo6.PNG" alt ="TalentOn"/>
         </a>
      </h1>
      
      <h2 class = "hidden">회원메뉴</h2>
      <ul id ="join-menu" class="block_hlist">
         <li><a href = "">HOME</a></li>
         <li><a href = "">UPLOAD</a></li>
         <li><a href = "">LOGIN</a></li>
      </ul>
      <form id = "main-search">
         <fieldset>
            <legend class = "hidden">전체검색필드</legend>
            <input type = "text"/>
            <input type = "submit" value = "검색"/>
         </fieldset>
      </form>
      </div>
   </header>
	
	<div id="body">
		<div class="content-container clearfix">
			<aside id="aside">
				<nav>
					<ul>
						<li><a href="">내 정보 변경</a></li>
						<li><a href="">구매 관련</a></li>
						<li><a href="">판매 관련</a></li>
						<li><a href="">작가 즐겨찾기</a></li>
						<li><a href="">쪽지함</a></li>
					</ul>
				</nav>
			
			</aside>
			
			<main id="main">
				<div class="auction-menu">
					<ul>
						<li>
							<a href ="" >입찰진행작품</a>
							<a href ="" >0건</a>
						</li>
						
						<li>
							<a href ="" >재입찰</a>
							<a href ="" >0건</a>
						</li>
						
						<li>
							<a href ="" >낙찰</a>
							<a href ="" >0건</a>
						</li>
						
						<li>
							<a href ="" >배송중인 작품</a>
							<a href ="" >0건</a>
						</li>
						
						<li>
							<a href ="">결제해야 할 작품</a>
							<a href ="">0건</a>
						</li>
					</ul>
				</div>
				
				<h1 id="subtitle">재입찰</h2>
				
				<table id="auction-table">
					<thead>
						<tr>
							<th>작가</th>
							<th>작품 사진</th>
							<th>게시일자</th>
							<th>작품명</th>
							<th>입찰가</th>
							<th>남은시간</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><a href="">cr2ative</a></td>
							<td><a href="">사진</a></td>
							<td>2015-12-13 04:00</td>
							<td><a href="">대충 그린 그림</a></td>
							<td>1,000,000원</td>
							<td>01:02:11</td>
							<td>
								<input type="submit" value="재입찰" name="reBid">
								<input type="submit" value="취소" name="cancel">
							</td>
						</tr>
					</tbody>
				</table>
				
				
		         
			</main>
		</div>
		
	</div>
	
	<footer id = "footer">
		<div class = "content-container">
    	<section>
	    	<h1 class="hidden">회사정보</h1>
	    	
	    	
	    	<nav id ="company-menu">
				<h1 class = "hidden">회사메뉴</h1>
				<ul class="clearfix">
					<li><a href = "">회사소개</a></li>
				   	<li><a href = "">웹사이트 이용안내</a></li>
				    <li><a href = "">웹사이트 공유</a></li>
				    <li><a href = "">문의사항</a></li>
				    <li><a href = "">관련법규</a></li>
				    <li><a href = "">웹사이트 공유</a></li>
				    
				</ul>
			</nav>
		</section> 
		</div>
	</footer>
</body>
</html>