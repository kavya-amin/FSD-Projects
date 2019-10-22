<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>CRM-Customer Relationship Management</h2>
  <div id="container">

		<div id="content">


			<input type="button" style="background-color: blue; color:white; border-color:blue;" value="Add Customer"
				onclick="window.location.href='add-customer.jsp'; return false;"
				class="add-button" />
		</div>
	</div>
	<div>
			<form action="search.do">

				<input name="search" type="text"/><input type="submit"
					value="Search" style="display: inline-block; background-color: #44C1A8; color:white; border-color:none;">
			</form>
		</div>
         <br/>
<table class="table table-striped">
			<thead >
			
			<h3> Sort By: <a  class="btn btn-info" href="sortasc.do">Ascending</a>
   &nbsp  <a  class="btn btn-info" href="sortdesc.do">Descending</a> </h3>
				<tr>
					<th>#</th>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach var="tempCustomer" items="${customers}">
						<c:url var="updateLink" value="update.do">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>
			
					<c:url var="deleteLink" value="delete.do">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>
					<tr>
						<td>${tempCustomer.id}</td>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td>
						<a class="btn btn-primary" href="${updateLink}">Update</a> &nbsp &nbsp
						<a class="btn btn-danger" href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
							
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>