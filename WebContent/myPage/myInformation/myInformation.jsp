<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../../content/css/reset.css" type="text/css" rel="stylesheet" />
<link href="../css/myInformation/myInformation.css" type="text/css" rel="stylesheet" />
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
				<!-- <div id="log-information">
					회원 가입 : 2015-11-04 14:54 최근로그인 : 2015-11-05 21:00
				</div> -->
				
				<h1 id="subtitle">내 정보 변경</h1>
				<!-- thead:무조건 단일 사용/ tbody:중복가능,게시판의 공지사항부분과 글부분 나눌때 중복이 사용된다 -->
				<form id="modify-information" class="modify-information"
	action="a.html" method="post">
					<table id="modify">
						<tbody>
							<tr>
								<td>아이디</td>
								<td class="nomodify">cr2ative</td>
							</tr>
							<tr>
								<td>이름</td>
								<td class="nomodify">이주성</td>
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
									<input type="submit" value="수정" name="modify">
									<input type="reset" value="취소" name="cancel">
								</td>
							</tr>
	
						</tbody>
					</table>
				</form>
				
				
				<!-- <form id="information">
					<fieldset>
						<legend class="hidden">필수 정보 입력 란</legend>
						<label>아이디</label> <input type="text" />
						<label>이름</label> <input type="text" />
						<label>비밀번호</label> <input type="password" />
						<label>비밀번호 확인</label> <input type="password" />
						<label>이메일</label> <input type="email" />
						<label>주소</label> <input type="text" />
						<label>전화번호</label> <input type="tel" />
						<label>휴대전화</label> <input type="tel" />
						<label>SNS</label> <input type="text" />
						<label>작가알림</label>
						<label class="radio-label"><input type="radio" value="yes" name="agree" checked>YES</label>
						<label class="radio-label"><input type="radio" value="no" name="agree">No</label>
						<label>자기소개</label> <input type="text" />
						<input type="submit" value="수정" />
						<input type="submit" value="취소" />
				 	</fieldset>
				 </form> -->
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