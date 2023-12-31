<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/bootstrap.min.js"></script> 
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css" />
<title>글쓰기</title>
<style type="text/css">
	.article {
		width: 100%;
		max-width: 420px;
		padding: 15px;
		margin: auto;
	}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="article">
		<form class="form-signin" action="slangRegistPro.do">
			<div class="text-center mb-4">
				<h1 class="h3 mb-3 font-weight-normal">비속어등록</h1>
			</div>
			<table class="table table-borderless">
				<tbody>
					<tr>
						<th scope="row">작성자</th>
						<td><input type="text" name="slang" class="form-control" placeholder="비속어를 입력해주세요" required="required" autofocus=""></td>
					</tr>
				</tbody>
			</table>
		  <div class="text-center"><button class="btn btn-dark" type="submit">비속어등록</button></div>
		</form>
	</div>
</body>
</html>