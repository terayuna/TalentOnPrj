<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    		<header class="page-header">
					<h2 class="primary-title">LOGIN</h2>
					<h3 class="secondary-title" >로그인하시면 TALENT ON의 각종 서비스를 
					이용하실 수 있습니다.</h3>
				</header>
				<div class="board-write">
					<form>
						<input type="hidden" name="returnUrl" value>
						<input type="hidden" name="save_id" value>
						<section class="board-write-field">
							<table class="board-table">
								<tbody>
									<tr>
										<td class="loginlabel">
											<p>아이디</p>
										</td>
										<td>
											<input type="text" name="member_id" value tabindex="1">
										</td>
										<td rowspan="2">
											<div>
												<input type="submit" style="cursor:hand" class="btn btn-large btn-color" value="LOGIN" tabindex="3">
											</div>
										</td>
									</tr>
									<tr>
										<td class="loginlabel">
											<p>비밀번호</p>
										</td>
										<td>
											<input type="password" name="member_pass" value id="pass"  tabindex="1">
										</td>
									</tr>	
								</tbody>
							</table>
						</section>
					</form>
				</div>
				<div class="board-btns">
					<a href="" class = "btn btn-color">회원가입</a>
					<a href="home_searchId.jsp" class = "btn btn-gray">아이디찾기</a>
					<a href="home_searchPwd.jsp" class = "btn btn-gray">비밀번호찾기</a>
				</div>
	
	
	
	
	