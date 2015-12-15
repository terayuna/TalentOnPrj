<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link href="../content/css/reset.css" type= "text/css" rel="stylesheet">
	<link href="../home/css/home_notice.css" type= "text/css" rel="stylesheet">
</head>
<body>
	<header id ="header">
		<div class = "content-container">
			<h1 id = "logo"><a href="home_main.jsp" >
				<img src="../images/logo6.PNG" alt ="TalentOn"/>
				</a>
			</h1>
			
			<h2 class = "hidden">회원메뉴</h2>
			<ul id ="join-menu" class="block_hlist">
				<li><a href = "../home/home_main.jsp">JOIN</a></li>
				<li><a href = "home_uploadProduct.jsp">UPLOAD</a></li>
				<li><a href = "home_login.jsp">LOGIN</a></li>
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
		</div>
		
	</header>
	
	 <div id ="body">
		<div id = "content" class="page-content">
			<div class="wrapper">
				<header class="page-header">
					<h2 class="primary-title">공지사항</h2>
					<h3 class="secondary-title" >공지사항을  확인하세요</h3>
				</header>
				<div class="board-write">
					<div class="align-container">
					    <h3 class = "hidden">공지사항 검색</h3>   
					         
					    <form id="notice-search">
					    	<fieldset>
					    		<legend class = "hidden">공지사항 검색 필드</legend>
					    		<label class = "hidden">분류</label>
					    		<select>
					    			<option>분류선택</option>
					    			<option>제목</option>
					    			<option>작성자</option>
					    		</select>
					    		<label class = "hidden">검색어</label>
					    		<input type = "text"/>
					    		<input type = "submit" value = "검색"/>
					    	</fieldset>
					  	</form>
				  	</div>
				  	
				  	<h3 class = "hidden">공지사항 목록</h3>   
				  	<table id="notices">
				  		<thead>
				  			<tr>
				    			<th>번호</th>
				    			<th>제목</th>
				    			<th>작성자</th>
				    			<th>작성일</th>
				    			<th>조회수</th>
				    		</tr>
				       </thead>
				    	<tbody>
				    		<tr>
				    			<td>1</td>
				    			<td>공지사항</td>			
				    			<td>관리자</td>		 
				    			<td>2010-10-30</td>   
				    			<td>2</td>
				    		</tr>
				    		<tr>
				    			<td>1</td>
				    			<td>공지사항</td>			
				    			<td>관리자</td>		 
				    			<td>2010-10-30</td>   
				    			<td>2</td>
				    		</tr>
				    		
				    		<tr>
				    			<td>1</td>
				    			<td>공지사항</td>			
				    			<td>관리자</td>		 
				    			<td>2010-10-30</td>   
				    			<td>2</td>
				    		</tr>
				    		<tr>
				    			<td>1</td>
				    			<td>공지사항</td>			
				    			<td>관리자</td>		 
				    			<td>2010-10-30</td>   
				    			<td>2</td>
				    		</tr>
				    		<tr>
				    			<td>1</td>
				    			<td>공지사항</td>			
				    			<td>관리자</td>		 
				    			<td>2010-10-30</td>   
				    			<td>2</td>
				    		</tr>
				    		<tr>
				    			<td>1</td>
				    			<td>공지사항</td>			
				    			<td>관리자</td>		 
				    			<td>2010-10-30</td>   
				    			<td>2</td>
				    		</tr>
				    		<tr>
				    			<td>1</td>
				    			<td>공지사항</td>			
				    			<td>관리자</td>		 
				    			<td>2010-10-30</td>   
				    			<td>2</td>
				    		</tr>
				    		
				       </tbody>
				    </table>
				    
				    <div class="align-container" >
					    <h3 class = "hidden">목록의 현재 페이지</h3>
					    <p>1/1PAGE</p>
				    </div>
				    
				    <div class="align-container1">
				    <h3 class = "hidden">페이지</h3>
				    <p>1</p> 
				    </div>	
			   </div>	
			</div>
		</div>
	</div>

 	
 	<footer id ="footer">
 		<div class = "content-container">
    	<section>
	    	<h1 class="hidden">회사정보</h1>
	    	<nav id ="company-menu">
				<h1 class = "hidden">회사메뉴</h1>
				<ul class="clearfix">
					<li><a href = "../company/company_main.jsp">회사소개</a></li>
				   	<li><a href = "">웹사이트 이용안내</a></li>
				    <li><a href = "">웹사이트 공유</a></li>
				    <li><a href = "../company/company_inquiry.jsp">문의사항</a></li>
				    <li><a href = "">관련법규</a></li>
				    <li><a href = "">연락처</a></li> 
				</ul>
			</nav>
		</section> 
		</div>
 	</footer>

</body>
</html>