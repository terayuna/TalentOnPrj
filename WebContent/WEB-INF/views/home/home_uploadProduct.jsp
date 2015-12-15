<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link href="../content/css/reset.css" type= "text/css" rel="stylesheet">
	<link href="../home/css/home_uploadProduct.css" type= "text/css" rel="stylesheet">
</head>
<body>
		<header id ="header">
		<div class = "content-container">
		<h1 id = "logo"><a href="home_main.jsp" >
			<img src="../images/logo6.PNG" alt ="TalentOn"/>
			</a>
		</h1>

			<h2 class = "hidden">회원메뉴</h2>
				<ul id ="join-menu" class="clearfix">
					<li><a href = "home_main.jsp">JOIN</a></li>
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

	</header>
	
	<div id = "body">
			<div id = "content" class="page-content">
			<div class="wrapper">
				<header class="page-header">
					<h2 class="primary-title">작품 등록</h2>
					<h3 class="secondary-title" >작품을 등록하세요.</h3>
				</header>
				<div class="board-write">
					<section class="board-write-table">
						<h4 class="field-title">작품정보 입력하기</h4>
						<table class="board-write-table">
							<tbody>
								<tr>
									<td class="label">
										<p>작품명</p>
									</td>
									<td>
										<input type="text" name="product_name" value class="full">
									</td>
								</tr>
								<tr>
									<td class="label">
										<p>작가명</p>
									</td>
									<td>
										<input type="text" class="long"  name="author" value>
									</td>
								</tr>
								<tr>
									<td class="label">
										<p>등록방법</p>
									</td>
									<td>
										<p>
											<input type="radio" name="upload" value="0" id="origin1" checked>
											<label for="origin1">전시</label>
											<input type="radio" name="upload" value="1" id="origin2" checked>
											<label for="origin2">판매</label>
											<input type="radio" name="upload" value="2" id="origin3" checked>
											<label for="origin3">경매</label>
										</p>
									</td>
								</tr>
								<tr>
									<td class="label">
										<p>카테고리</p>
									</td>
									<td>
										<input type="text" name="product_category" value class="full">
									</td>
								</tr>
							</tbody>
						</table>
					</section>
					
					
					<div id="notice-article-detail" class="article-detail margin-large" >							
						<dl class="article-detail-row">
							<dt class="article-detail-title">
								이미지 첨부파일
							</dt>
							<dd class="article-detail-data">
								&nbsp;<input type="file" id="txtFile" name="file" />
							</dd>
						</dl>

						<div class="article-content" >
							<textarea id="txtContent" class="txtContent" name="content"></textarea>
						</div>
					</div>
					
					<p class="article-comment margin-small">						
						<input class="btn-save button" type="submit" value="저장" />
						<a class="btn-cancel button" href="notice.jsp">취소</a>						
					</p>							
					
					<section>
						<h4 class="field-title">판매정보 입력하기</h4>
						<table class="board-write-table">
							<tbody>
								<tr>
									<td class="label">
										<p>판매종료 일시</p>
									</td>
									<td>
										<label for="datetimepicker" class="datetimepicker">Click Here!</label>
										<input type="text" id="datetimepicker" name="end_date" value class="middle hasDatepicker" readonly>
									</td>
								</tr>
								
								<tr>
									<td class="label">
										<p>판매 가격</p>
									</td>
									<td>
										<input type="text" id="datetimepicker" name="bid_price" value class="middle hasDatepicker" readonly>
									</td>
								</tr>
								
							</tbody>
						</table>
					</section>
					
					<section>
						<h4 class="field-title">경매정보 입력하기</h4>
						<table class="board-write-table">
							<tbody>
								<tr>
									<td class="label">
										<p>경매종료 일시</p>
									</td>
									<td>
										<label for="datetimepicker" class="datetimepicker">Click Here!</label>
										<input type="text" id="datetimepicker" name="end_date" value class="middle hasDatepicker" readonly>
									</td>
								</tr>
								
								<tr>
									<td class="label">
										<p>경매시작 가격</p>
									</td>
									<td>
										<input type="text" id="datetimepicker" name="bid_price" value class="middle hasDatepicker" readonly>
									</td>
								</tr>
							</tbody>
						</table>
					</section>
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