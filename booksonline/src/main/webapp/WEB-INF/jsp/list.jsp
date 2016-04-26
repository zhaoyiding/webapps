<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书列表</title>
<style type="text/css">
	@import url("<c:url value="/css/main.css" />");
</style>
</head>
<body>
	<div id="global">
	<h1>图书列表</h1>
	<a href="<c:url value="/book_input"/>">添加图书</a>
	<table>
		<tr>
			<th>书名</th>
			<th>作者</th>
			<th>价格</th>
		</tr>
		<c:forEach items="${list }" var="book">
			<tr>
				<td>${book.title }</td>
				<td>${book.author }</td>
				<td>${book.price}</td>
				<td>
					<a href="<c:url value="/book_detail?id=${book.id}"/>">查看</a>
				</td>
				<td>
					<a href="<c:url value="/book_delete?id=${book.id }"/>">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div align="center">
		<c:choose>
			<c:when test="${page.hasPrePage }">
				<a href="<c:url value="/book_list?currentPage=1"/>">首页</a>|
				<a href="<c:url value="/book_list?currentPage=${page.currentPage-1 }"/>">上一页</a>
			</c:when>
			<c:otherwise>首页|上一页</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${page.hasNextPage }">
				<a href="<c:url value="/book_list?currentPage=${page.currentPage+1 }"/>">下一页</a>
				<a href="<c:url value="/book_list?currentPage=${page.totalPage }"/>">尾页</a>
			</c:when>
			<c:otherwise>
				下一页|尾页
			</c:otherwise>
		</c:choose>
		<br>
		<div align="center">
			当前为第${page.currentPage }页，共${page.totalPage }页
		</div>
	</div>
	</div>
</body>
</html>