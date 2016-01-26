<%-- <%@page import="com.newlec.webprj.vo.Notice"%>
<%@page import="java.util.List"%>
<%@page import="com.newlec.webprj.dao.mybatis.MyBatisNoticeDao"%>
<%@page import="com.newlec.webprj.dao.NoticeDao"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

		
			<div class="top-wrapper clear">
				<div id="content">
					<!-- content 부분 -->
					<tiles:insertAttribute name="content"/>
				</div>
			</div>
</html>
