<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HuyNQ
  Date: 6/13/2021
  Time: 5:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/student.css">
</head>
<body>
<form:form action="./student" method="POST">
    <div class="form-group">
        <form:label path="fullName">Name</form:label>
        <form:input path="fullName"/>
        <br/>
    </div>
<%--    <div class="form-group">--%>
<%--        <form:label path="birthday">Birthday</form:label>--%>
<%--        <form:input path="birthday"/>--%>
<%--        <br/>--%>
<%--    </div>--%>
    <div class="form-group">
        <form:label path="hometown">Hometown</form:label>
        <form:input path="hometown"/>
        <br/>
    </div>
    <div class="form-group">
        <form:label path="className">ClassName</form:label>
        <form:input path="className"/>
        <br/>
    </div>
    <div class="form-group">
        <form:label path="gender">Gender</form:label>
        <form:input path="gender"/>
        <br/>
    </div>
    <div class="form-group">
        <button id="save-button" type="submit">Save</button>
    </div>
</form:form>
</body>
</html>
