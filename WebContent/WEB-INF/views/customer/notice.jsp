<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security"  uri="http://www.springframework.org/security/tags" %>
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