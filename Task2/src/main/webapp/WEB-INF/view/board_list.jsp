<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/bootstrap.min.js"></script> 
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css" />
<title>Insert title here</title>
<style type="text/css">
	.article{
		width: 100%;
		max-width: 650px;
		padding: 15px;
		margin: auto;
	}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="article">
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="row" class="text-nowrap">글번호</th>
					<th scope="row" class="text-nowrap">작성자</th>
					<th scope="row" class="text-nowrap">제목</th>
					<th scope="row" class="text-nowrap">작성일시</th>
					<th scope="row" class="text-nowrap">상세보기</th>
					<th scope="row" class="text-nowrap">수정</th>
					<th scope="row" class="text-nowrap">삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${boardList }">
					<tr>
						<td class="text-nowrap">${board.seq_counsel }</td>
						<td class="text-nowrap">${board.counsel_writer }</td>
						<td class="text-truncate">${board.counsel_subject }</td>
						<td class="text-nowrap"><fmt:formatDate value="${board.counsel_date }" pattern="yyyy-MM-dd HH:mm"/></td>
						<td><a href="boardDetail.do?seq_counsel=${board.seq_counsel }" class="btn btn-sm btn-outline-dark text-nowrap">상세보기</a></td>
						<td class="text-nowrap"><a class="btn btn-sm btn-outline-dark" href="boardModifyForm.do?seq_counsel=${board.seq_counsel }">수정</a></td>
						<td class="text-nowrap"><a class="btn btn-sm btn-outline-dark" href="boardDelete.do?seq_counsel=${board.seq_counsel }">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>