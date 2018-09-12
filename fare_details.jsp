<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fare details</title>
</head>
<body>
<h3>Details of your fare:</h3>
<p>The fare for <%=request.getAttribute("nop") %> passengers for a flight from  <%=request.getAttribute("source") %> to <%=request.getAttribute("destination") %> is <%=request.getAttribute("fare") %></p> 

</body>
</html>