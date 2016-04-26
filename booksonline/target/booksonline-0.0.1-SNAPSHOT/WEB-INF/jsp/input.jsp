<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加图书</title>
<style type="text/css">
	@import url("<c:url value="/css/main.css" />");
</style>
</head>
<body>
	<div id="global">
	<form:form commandName="book" action="book_commit" method="post">
		<fieldset>
			<legend>添加图书</legend>
			<p class="errorLine">
            	<form:errors path="title" cssClass="error"/>
        	</p>
			<p>
				<label for="title">书名：</label>
				<form:input path="title" id="title"/>
			</p>
			<p class="errorLine">
            	<form:errors path="author" cssClass="error"/>
        	</p>
			<p>
				<label for="author">作者：</label>
				<form:input path="author" id="author"/>
			</p>
			<p class="errorLine">
            	<form:errors path="price" cssClass="error"/>
        	</p>
			<p>
				<label for="price">价格：</label>
				<form:input path="price" id="price"/>
			</p>
			<p id="buttons">
				<input id="reset" type="reset" tabindex="4">
				<input id="submit" type="submit" tabindex="5" value="提交">
			</p>
		</fieldset>
	</form:form>
	</div>
</body>
</html>