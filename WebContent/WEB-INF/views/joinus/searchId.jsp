<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


	
	<div id ="body">
		<div id = "content" class="page-content">
			<div class="wrapper">
				<header class="page-header">
					<h2 class="primary-title">아이디 찾기</h2>
					<h3 class="secondary-title" >회원가입시 등록한 이메일 주소를 입력하시오.</h3>
				</header>
				<div class="board-write">
					<form action="searchId" method="POST">
						<input type="hidden" name="returnUrl" value>
						<input type="hidden" name="save_id" value>
						<section class="board-write-field">
							<table class="board-table">
								<tbody>
									<tr>
										<td class="loginlabel">
											<p>이메일</p>
										</td>
										<td>
											<input type="text" name="member_email" value tabindex="1">
										</td>
									</tr>
								</tbody>
							</table>
						</section>
						<div class="board-btns">
							<input type="submit" value="확인" class = "btn btn-color"/>
							<a href="login" class = "btn btn-gray">취소</a>
						</div>
						<c:if test ="${id!=null}"><span>${email}</span>로 가입된 아이디는 <span>${id }</span>입니다.</c:if>
						<%-- <c:if test ="${id==null}">${email}로 가입된 아이디가 없습니다.</c:if> --%>
					</form>
				</div>
				
			</div>
		</div>
	</div>

