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
		<div class="text-center mb-4">
			<h1 class="h3 mb-3 font-weight-normal">상세보기</h1>
		</div>
		<div class="card p-3 m-3">
			<table class="table table-striped">
				<tbody>
					<tr>
						<th scope="row">작성자</th>
						<td>${board.counsel_writer }</td>
					</tr>
					<tr>
						<th scope="row">작성일</th>
						<td><fmt:formatDate value="${board.counsel_date }" pattern="yyyy-MM-dd HH:mm"/></td>
					</tr>
					<tr>
						<th scope="row">제목</th>
						<td>${board.counsel_subject }</td>
					</tr>
					<tr>
						<th scope="row">내용</th>
						<td>${board.counsel_content }</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="card p-3 m-3">
			<table class="table table-striped table-sm">
				<thead>
					<tr>
						<th scope="col" class="text-nowrap">NO.</th>
						<th scope="col" class="text-nowrap">작성자</th>
						<th scope="col" class="text-nowrap">내용</th>
						<th scope="col" class="text-nowrap">수정/삭제</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="reply" items="${replyList }">
						<tr>
							<td class="text-nowrap">${reply.seq_reply }</td>
							<td class="text-nowrap">${reply.reply_writer }</td>
							<td>${reply.reply_content }</td>
							<td class="text-nowrap">
								<a class="btn btn-sm btn-outline-dark" id="replyModifyBtn" onclick="replyModify">수정</a>
<%-- 								<a class="btn btn-sm btn-outline-dark" href="replyModifyForm.do?seq_reply=${reply.seq_reply }">수정</a> --%>
								<a class="btn btn-sm btn-outline-dark" href="replyDelete.do?seq_reply=${reply.seq_reply }">삭제</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="card p-3 m-3">
			<form action="replyWritePro.do" method="post">
				<input type="hidden" name="seq_counsel" value="${board.seq_counsel }">
				<div class="form-row mb-2">
					<div class="col text-center">작성자</div>
					<div class="col-8 text-center">내용</div>
					<div class="col text-center">등록</div>
				</div>
				<div class="form-row">
					<div class="col">
						<input type="text" name="reply_writer" class="form-control" placeholder="작성자">
					</div>
					<div class="col-8">
						<input type="text" name="reply_content" class="form-control" placeholder="내용">
					</div>
					<div class="col text-center">
						<button type="submit" class="btn btn-outline-dark">등록</button>
					</div>
				</div>
			</form>
		</div>
		<div class="text-center m-3">
			<a class="btn btn-dark" href="boardDelete.do?seq_counsel=${board.seq_counsel }">삭제</a>
			<a class="btn btn-outline-dark" href="boardList.do">목록</a>
		</div>
	</div>
	
	<script type="text/javascript">
		$(function() {
			
		});
	</script>
</body>
</html>