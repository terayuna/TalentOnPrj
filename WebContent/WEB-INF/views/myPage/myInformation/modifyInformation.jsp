<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="content-header">
	<h1 class="primary-title">내 정보 변경</h1>
	<h2 class="secondary-title" >정보를 변경하세요</h2>
</div>

<form id ="modify-information" action="" method="post">
	<div id="essential-information">
		<h1 id="subtitle">필수 정보</h1>
		<dl class="modify-form-row">
			<dt class="modify-form-title">아이디</dt>
			<dd class="modify-form-data">
				<input type="text" name="id" value="아이디"/>
			</dd>
		</dl>
		 
		<dl class="modify-form-row">
			<dt class="modify-form-title">이름</dt>
			<dd class="modify-form-data">
				<input type="text" name="name"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">비밀번호</dt>
			<dd class="modify-form-data">
				<input type="password" name="password"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">비밀번호 확인</dt>
			<dd class="modify-form-data">
				<input type="password" name="password-check"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">이메일</dt>
			<dd class="modify-form-data">
				<input type="email" name="email"/>
			</dd>
		</dl>
	</div>
	<div id="additory-information">
		<h1 id="subtitle">부가 정보</h1>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">주소</dt>
			<dd class="modify-form-data">
				<input type="text" name="address" value="주소"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">휴대 전화</dt>
			<dd class="modify-form-data">
				<input type="text" name="phone" pattern="\d{3}\-\d{4}\-\d{4}" required/><span>   	[-를 포함해주세요 ex) 010-1234-5678]</span>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">SNS</dt>
			<dd class="modify-form-data">
				<input type="text" name="id" value="SNS"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">아이디</dt>
			<dd class="modify-form-data">
				<input type="text" name="id" value="아이디"/>
			</dd>
		</dl>
		
		<dl class="modify-form-row">
			<dt class="modify-form-title">아이디</dt>
			<dd class="modify-form-data">
				<input type="text" name="id" value="아이디"/>
			</dd>
		</dl>
	</div>
	
	<p class="btnInTable">
		<input class="btn btn-color" type="submit" value="가입하기" />
		<a class = "btn btn-gray" href="../home/index">취소하기</a> <!-- 나중에 메인확정되면 메인으로! -->
	</p>
</form>

				
				<!-- <form id="modify-information" class="modify-information" action="a.html" method="post">
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
				</form> -->