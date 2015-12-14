<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../../content/css/reset.css" type="text/css" rel="stylesheet" />
<link href="../css/message/receivedMessage.css" type="text/css" rel="stylesheet" />
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
				<div class="message-menu">
					<ul>
						<li>
							<a href ="" >받은 쪽지함</a>
							<a href ="" >2건</a>
						</li>
						
						<li>
							<a href ="" >미열람 쪽지함</a>
							<a href ="" >1건</a>
						</li>
						
						<li>
							<a href ="" >보낸 쪽지함</a>
							<a href ="" >1건</a>
						</li>
						
					</ul>
				</div>
				
				<table id="message-table">
					<thead>
						<tr>
							<th>보낸 사람</th>
							<th>내용</th>
							<th>받은 시간</th>
							<th>보관</th>
							<th>삭제</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><a href="">이주성</a></td>
							<td><a href="">프로젝트 짜증나 ㅠㅠㅠ</a></td>
							<td><a href="">대충 그린 그림</a></td>
							<td><a href="">cr2ative</a>
							<td>1,000,000원</a></td>
							<td>01:02:11</a></td>
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