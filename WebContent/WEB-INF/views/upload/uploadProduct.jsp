<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<script>



window.onload = function(){
	
	var display= document.querySelector("#radio-display");
	var purchase= document.querySelector("#radio-purchase");
	var bid= document.querySelector("#radio-bid");
	
	var purchaseForm = document.querySelector(".purchase-form-row");
	var bidForm = document.querySelector(".bid-form-row");
	
	display.onclick = function(){
		purchaseForm.style.display="none";
		bidForm.style.display="none";
	};
	
	purchase.onclick = function(){
		purchaseForm.style.display="block";
		bidForm.style.display="none";
	};
	
	bid.onclick = function(){
		purchaseForm.style.display="none";
		bidForm.style.display="block";
	};
	
	/* var type = document.querySelectorAll("input[type=radio]");
	var vis;
	
	for(var i=0; i<3 ; i++){
		vis = (type[i].checked) ? "block" : "none";
		type[i].style.display=vis;
	} */
	
	
	/* for(var i=0;i<3;i++){
		type[i].onclick = function(){
			type[i].sytle.display = "block";
		}
	} */
	
	
}

   
</script>
		
<div class="content-header">
	<h1 class="primary-title">작품 등록</h1>
	<h2 class="secondary-title" >작품을 등록하세요.</h2>
</div>

<form action="uploadProduct" class="article-upload" method="post">

		<fieldset class="board-write-table">
			<legend class="field-title">작품정보 입력하기</legend>
			
			<dl class="upload-form-row">
				<dt class="upload-form-title">작품명</dt>
				<dd class="upload-form-data">
					<input type="text" name="title" autofocus required/>
					<input id="checkUidButton" class="button" type="button" value="중복확인"/>
				</dd>
			</dl>
			
			<dl class="upload-form-row">
				<dt class="upload-form-title">등록방법</dt>
				<dd class="upload-form-data">
					<input type="radio" name="upload_type" id="radio-display" value="전시" checked/>
					<label for="type1">전시</label>
					<input type="radio" name="upload_type" id="radio-purchase" value="판매"/>
					<label for="type2">판매</label>
					<input type="radio" name="upload_type" id="radio-bid" value="경매"/>
					<label for="type3">경매</label>
				</dd>
			</dl>
			
			<dl class ="purchase-form-row">
				<dt class = "upload-form-title">판매 가격</dt>
				<dd class = "upload-form-data">
					<input type="text" name="upload_price" value="0"/>
				</dd>
			</dl>
			
			<dl class ="bid-form-row">
				<dt class = "upload-form-title">경매 시작가</dt>
				<dd class = "upload-form-data">
					<input type="text" name="pay_amount" value="0"/>
				</dd>
			</dl>
			
			
			
			<dl class="upload-form-row">
				<dt class="upload-form-title">카테고리</dt>
				<dd class="upload-form-data">
					<select name="category">
						<option value="가구">가구</option>
						<option value="건축">건축</option>
						<option value="공예">공예</option>
						<option value="모형/피규어">모형</option>
						<option value="문학">문학</option>
						<option value="미술">미술</option>
						<option value="사진">사진</option>
						<option value="정크아트">정크아트</option>
						<option value="컴퓨터아트">컴퓨터아트</option>
						<option value="기타">기타</option>
					</select>
				</dd>
			</dl>
			
			<dl class="upload-form-row">
				<dt class="upload-form-title">
					이미지 첨부파일
				</dt>
				<dd class="upload-form-data">
					&nbsp;<input type="file" id="txtFile" name="file" />
				</dd>
				
			</dl>
			
			<dl class="upload-form-row">
				<dt class="upload-form-title">
					작품 설명
				</dt>
				
				<dd class="upload-form-data">
					<textarea id="txtContent" class="txtContent" name="introduction"></textarea>
				</dd>
			</dl>		
			
		</fieldset>
		
		
		
		
		
		<!-- <section>
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
		</table> -->
	
	
	
		<p class="article-control">
			<input class = "btn btn-color" type="submit" value="등록하기"/>
			<a href="../home/index" class = "btn btn-gray">취소하기</a>
		</p>
</form>
					
				
				

