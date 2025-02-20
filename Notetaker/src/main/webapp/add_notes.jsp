<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container-fluid ">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>Please fill your notes details</h1>

		<!-- This is form -->
		<form action="SaveNoteServlet" method="post">
			<div class="mb-3" p-1>
				<label for="title" class="form-label">Note Title</label> 
				<input 
				name="title"
				required
				type="text" 
				class="form-control"
				id="title" 
				placeholder="Enter Here" 
				aria-describedby="emailHelp">
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea 
				name="content"
				placeholder="Enter the content here" 
				required="required" 
				id="content"
				class="form-control"
				style="height: 150px">
				</textarea>
			</div>
			<div class="container text-center">
			<button type="submit" class="btn btn-primary">Add</button>
			</div>
		</form>
	</div>
</body>
</html>