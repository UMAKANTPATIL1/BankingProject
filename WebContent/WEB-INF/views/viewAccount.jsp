<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.umakant.view.*" %>
    <%@ page import="com.umakant.springbanking.*" %>
    <%@ page import="com.umakant.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Account Details</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<form action="viewPage" method="post">
<table class="table">
<h1 align="center">View Account Details</h1>
  <thead>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Account Number</th>
     <th>Account Balance</th>
  </tr>
  </thead>
<tbody>
    <%
    List<Banking> bank =(List)request.getAttribute("user");
    for(Banking b: bank)
    {
    %>
     <tr>
	    <td><%=b.getUserId()%></td>
     	<td><%=b.getUserName() %></td>
		<td><%=b.getUserAccount()%></td>
	 	<td><%=b.getUserBalance()%></td>
  	
    </tr>
    <% 
    }
    %>
  </tbody>
 
</table>
<div class="container signin">
	<p>Go To Create Account <a href="createAccount">Create Account</a>.</p>
   <p>Go To View Account <a href="viewPage">View Account</a>.</p>
    <p>Go To Deposite Money <a href="depositAmount">Deposite Money</a>.</p>
    <p>Go To Withdraw Money <a href="withdrawAmount">Withdraw Money</a>.</p>
  </div>
</form>

</body>
</html>
