<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<script>
	

</script>

	<div id="aside">
				<h1  class = "hidden">카테고리메뉴</h1>
					<h1 id = "menu-title"> 카테고리</h1>
		 	   	
		 	   		<ul id = "category-menu" >
						<li><a href = "${ctx}/product/displayProduct">전체보기</a></li>
						<li><a href = "${ctx}/product/displayProduct">미술</a></li>
					   	<li><a href = "${ctx}/product/displayProduct">공예</a></li>
					    <li><a href = "${ctx}/product/displayProduct">건축</a></li>
					    <li><a href = "${ctx}/product/displayProduct">사진</a></li>
					    <li><a href = "${ctx}/product/displayProduct">컴퓨터아트</a></li>
					    <li><a href = "${ctx}/product/displayProduct">정크아트</a></li>
					    <li><a href = "${ctx}/product/displayProduct">가구</a></li>
					    <li><a href = "${ctx}/product/displayProduct">모형/피규어</a></li>
					    <li><a href = "${ctx}/customer/notice">문학</a></li>
					    <li><a href = "${ctx}/customer/notice">카테고리 외</a></li>
					</ul>
			</div>
			<main id="main">
				<h1>카테고리> 미술</h1>
					<section>
						<h1 id="product_title">상상 속의 풍경화 </h1>
						<section>
							<img src = "${ctx}/content/product/images/big.jpg" alt="작품 확대 이미지"/>
						</section>
						<section>
							<h1 class="hidden">작품 이미지 목록</h1>
							<ul id="product_list">
							<div id = "arrow_img"><img src = "${ctx}/content/product/images/arrow_left.JPG" alt="왼쪽화살표"/></div>
								<li><img src = "${ctx}/content/product/images/test1.png" alt="작품 이미지1"/></li>
								<li><img src = "${ctx}/content/product/images/test2.png" alt="작품 이미지2"/></li>
								<li><img src = "${ctx}/content/product/images/test3.png" alt="작품 이미지3"/></li>
								<li><img src = "${ctx}/content/product/images/test4.png" alt="작품 이미지4"/></li>
								<li><img src = "${ctx}/content/product/images/test5.png" alt="작품 이미지5"/></li>
								<li><img src = "${ctx}/content/product/images/test6.png" alt="작품 이미지6"/></li>
								<li><img src = "${ctx}/content/product/images/test7.png" alt="작품 이미지7"/></li>	
								<div id = "arrow_img"><img src = "${ctx}/content/product/images/arrow_right.JPG" alt="오른쪽화살표"/></div>							
							</ul>
						</section>
						<section id="product_info">
							<h1 class="hidden">작품 정보</h1>
							<ul>
								<li>최저가 50,000원~</li>
								<li>경매종료까지 남은 시간</li>
								<li><a href="">회원 프로필 사진</a></li>
								<li><a href="#" class="whiteButton">추천하기</a></li>
								<li><a href="#" class="redButton">입찰하기</a></li>
								<li><a href="">SNS공유 아이콘</a></li>
								<li><a href="">회원 아이디</a></li>
								<li><a href="#" class="whiteButton">목록으로 돌아가기</a></li>
								<li>최고입찰가 55,000원(현재기준)</li>
								<li><a href="#" class="whiteButton">즐겨찾기</a></li>
								<li><a href="">더보기</a></li>																	
								<li><a href="">관련 작품보기</a></li>								
							</ul>
							<div id="member_text">
								<textarea id="txtContent" class="txtContent" name="content">회원이 업로드한 작품설명
								</textarea>		
							</div>											
						</section>
						<section id="comment_form">								
							<h1 class="hidden">댓글</h1>
							
								<div>
									<textarea rows="10" name="comment" id="comment" placeholder="감상평을 남겨주세요.."></textarea>
								</div>
								<div>
									<input type="submit" name="submit" value="댓글 쓰기">
								</div>
								
						</section>
						<div id="comment_list">
							  <ul>
								    <li>
								      <img src="${ctx}/content/product/images/default1.jpg" alt="회원 이미지1" />
								      <h3>회원아이디</h3>
								      <p>최신 감상평</p>
								    </li>
								      
								    <li>
								      <img src="${ctx}/content/product/images/default2.jpg" alt="회원 이미지2" />
								      <h3>회원아이디</h3>
								      <p>그 다음 감상평</p>
								    </li>
								 
								    <li>
								      <img src="${ctx}/content/product/images/default3.jpg" alt="회원 이미지3" />
								      <h3>회원아이디</h3>
								      <p>그 다음 감상평</p>
								    </li>
								 
								    <li>
								      <img src="${ctx}/content/product/images/default4.jpg" alt="회원 이미지4" />
								      <h3>회원아이디</h3>
								      <p>감상평 계속...</p>
								    </li>
							  </ul>
						</div>

						
					</section>
			</main>








	