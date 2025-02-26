<%@page import="com.entities.Note"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<h1>Edit your note!</h1>
		<%
	int noteId = Integer.parseInt(request.getParameter("note_id").trim());	
	%>
		<%
	Session s = FactoryProvider.getFactory().openSession();
	Note note = s.get(Note.class, noteId);
	%>

		<!-- This is form -->
		<form action="UpdateServlet" method="post">
		<input value="<%= note.getId() %>" name="noteId" />
			<div class="mb-3" p-1>
				<label for="title" class="form-label">Note Title</label> 
				<input
					name="title" required type="text" class="form-control" id="title"
					placeholder="Enter Here"
					value="<%=note.getTitle()%>"
					>
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea name="content" placeholder="Enter the content here"
					required="required" id="content" class="form-control"
					style="height: 150px"><%=note.getContent()%>
				</textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-success">Save your note</button>
			</div>
		</form>
	</div>
</body>
</html>