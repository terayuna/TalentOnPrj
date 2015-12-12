<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
	<link href="../content/css/reset.css" type= "text/css" rel="stylesheet">
	<link href="css/join.css" type= "text/css" rel="stylesheet">

<body>
	<header id ="header">
      <div class = "content-container">
      <h1 id = "logo"><a href="../home/home_main.html" >
         <img src="../images/logo6.PNG" alt ="TalentOn"/>
         </a>
      </h1>
      
      <h2 class = "hidden">회원메뉴</h2>
      <ul id ="join-menu" class="block_hlist">
         <li><a href = "../home/home_main.html">HOME</a></li>
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
			<main id="main">
				<!-- <div id="log-information">
					회원 가입 : 2015-11-04 14:54 최근로그인 : 2015-11-05 21:00
				</div> -->
				
				<h1 id="subtitle">회원 가입</h1>
				<!-- thead:무조건 단일 사용/ tbody:중복가능,게시판의 공지사항부분과 글부분 나눌때 중복이 사용된다 -->
				<form id="content-searchform" class="article-search-form" 
					action="home_main.jsp" method="post">
					<table id="modify">
						<tbody>
							<tr>
								<td>아이디</td>
								<td><input type="text" name="password" maxlength="12"/></td>
							</tr>
							<tr>
								<td>이름</td>
								<td><input type="text" name="password" maxlength="30"/></td>
							</tr>
							<tr>
								<td>비밀번호</td>
								<td><input type="password" name="password" maxlength="12"/></td>
							</tr>
							<tr>
								<td>비밀번호 확인</td>
								<td><input type="password" name="confirm-password" maxlength="12"/></td>
							</tr>
							<tr>
								<td>이메일</td>
								<td><input type="email" name="email"/></td>
							</tr>
							<tr>
								<td>주소</td>
								<td><input type="text" name="address"/></td>
							</tr>
							<tr>
								<td>전화번호</td>
								<td><input type="tel" name="phone"/></td>
							</tr>
							<tr>
								<td>휴대전화</td>
								<td><input type="tel" name="mobile"/></td>
							</tr>
							<tr>
								<td>SNS</td>
								<td><input type="text" name="sns"/></td>
							</tr>
							<tr>
								<td>작가알림</td>
								<td>
									<label class="radio-label"><input type="radio" value="yes" name="agree" checked>YES</label>
									<label class="radio-label"><input type="radio" value="no" name="agree">No</label>
								</td>
							</tr>
							<tr>
								<td>자기소개</td>
								<td><input type="text"/></td>
							</tr>
							<tr align="center" class="last">
								<td colspan="2">
									<input type="submit" value="가입하기" name="modify">
									<input type="submit" value="취소하기" name="cancel">
								</td>
							</tr>
	
						</tbody>
					</table>
				</form>
				
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