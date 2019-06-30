<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="processform" modelAttribute="student" >

First Name : <form:input path="firstName"/>
<br><br>
Last Name : <form:input path="lastName"/>
<br><br>

<form:select path="country">
	<form:options items="${student.countryOptions }"/>

</form:select>

<br><br>
<input type = "submit" value = "submit"/>
</form:form>
</body>
</html>