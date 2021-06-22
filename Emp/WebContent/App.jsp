<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application</title>
</head>
<body>
<div align="center">
<h2><font color="blue" face="impact">Application ID:<input type="text" 
name="ApplicationID"></font></h2>
<input type="button" value="search"><hr><hr>
<form action="AppServlet" method="post">
<table>
 <tr><td>Name of entrepreneur: </td><td><input type="text" name="Nameofentrepreneur"></td></tr>

<tr><td>ipName: </td><td><input type="text" name="ipname" ></td></tr>

<tr><td>Zone:</td><td><input type="text" name="Zone" ></td></tr>

<tr><td>Status of Allotment: </td><td><input type="text" name="Statusofallotment" ></td></tr>

<tr><td><input type="radio" name="button"></td></tr>
<tr><td>Extension of time for 30 days</td><td><button type="submit">Update</button></td></tr>
</table>
</form>
</div>
</body>
</html>