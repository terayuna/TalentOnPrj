<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
		
<form action="uploadProduct" method="post">

<div class="content-header">
	<h1 class="primary-title">작품 등록</h1>
	<h2 class="secondary-title" >작품을 등록하세요.</h2>
</div>
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
						<input type="text">
				</tr>
				
				<tr>
					<td class="label">
						<p>판매 가격</p>
					</td>
					<td>
						<input type="text" name="bid_price">
					</td>
				</tr>
				
			</tbody>
		</table>
	</section>
	
	<h4 class="field-title">경매정보 입력하기</h4>
	<table class="board-write-table">
		<tbody>
			<tr>
				<td class="label">
					<p>경매종료 일시</p>
				</td>
				<td>
					<input type="text">
				</td>
			</tr>
			
			<tr>
				<td class="label">
					<p>경매시작 가격</p>
				</td>
				<td>
					<input type="text">
				</td>
			</tr>
		</tbody>
	</table>



	<div class="article-control">
		<input class = "btn btn-color" type="submit" value="등록하기"/>
		<a href="../home/index" class = "btn btn-gray">취소하기</a>
	</div>		
</div>				
</form>
					
				
				

