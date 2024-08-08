<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<title>Task Management System</title>
</head>
<body>
	<div class="container">
		<br> <br>

		<h1 class="text-center">Task Management System</h1>
		<br>
		 
		&nbsp;
		<a href="/TaskManagementSystem" class="btn btn-warning btn-sm">
    <span class="glyphicon glyphicon-plus"></span> Back  
</a>
		<br> <br>
		<table class="table    ">
			<thead class="text-center bg-warning">
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Description</th>
					<th>Priority</th>
					<th>Due Date</th>
					<th>Completed</th>
					<th>Created At</th>
					<th>Updated At</th>
 
				</tr>
			</thead>
			<tbody>
    <c:forEach items="${tasks}" var="task">
        <c:choose>
            <c:when test="${task.completed == true}">
                <tr>
                    <td>${task.id}</td>
                    <td>${task.title}</td>
                    <td>${task.description}</td>
                    <td><span class="badge badge-success">${task.priority}</span></td>
                    <td>${task.dueDate}</td>
                    <td>${task.completed}</td>
                    <td>${task.createdAt}</td>
                    <td>${task.updatedAt}</td>
                   
                </tr>
            </c:when>
        </c:choose>
    </c:forEach>
</tbody>


		</table>
	</div>
	<div class="modal fade" id="form_modal" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<form method="POST" action="addTask">
					<div class="modal-header">
						<h3 class="modal-title">Add Tasks</h3>
					</div>
					<div class="modal-body">
						<div class="col-md-2"></div>
						<div class="col-md-8">
							<div class="form-group">
								<label for="title">Title</label> <input type="text"
									class="form-control" id="title" name="title" required>
							</div>
							<div class="form-group">
								<label for="description">Description</label>
								<textarea class="form-control" id="description"
									name="description" rows="3"></textarea>
							</div>
							<div class="form-group">
								<label for="priority">Priority</label> <select
									class="form-control" id="priority" name="priority" required>
									<option value="low">Low</option>
									<option value="medium">Medium</option>
									<option value="high">High</option>
								</select>
							</div>
							<div class="form-group">
								<label for="dueDate">Due Date</label> <input type="dae"
									class="form-control" id="dueDate" name="dueDate" required>
							</div>

						</div>
					</div>
					<div style="clear: both;"></div>
					<div class="modal-footer">
						<button name="save" class="btn btn-primary btn-sm">
							<span class="glyphicon glyphicon-save"></span> Save
						</button>
						<button class="btn btn-danger btn-sm" type="button"
							data-dismiss="modal">
							<span class="glyphicon glyphicon-remove"></span> Close
						</button>
					</div>
				</form>

			</div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>



