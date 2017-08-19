<%--
  Created by IntelliJ IDEA.
  User: jingshanyin
  Date: 8/17/17
  Time: 10:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Attendee Page</title>
    <style type="text/css">
        .error{
            color: #ff0000;
        }
        .errorblock{
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>

    <a href="?language=en">
        English
    </a>
    <a href="?language=es">
        Spanish
    </a>

    <form:form commandName="attendee">
        <form:errors path="*" cssClass="errorblock" element="div"></form:errors>
        <label for="textinput1"><spring:message code="attendee.name"/>:</label>
        <form:input path="name" cssErrorClass="error"/>
        <form:errors path="name" cssClass="error"></form:errors>
        <br>
        <label for="textinput2"><spring:message code="attendee.email.address"/>:</label>
        <form:input path="emailAddress" cssErrorClass="error"/>
        <form:errors path="emailAddress" cssClass="error"></form:errors>
        <br>
        <label for="textinput3"><spring:message code="attendee.phone"/>:</label>
        <form:input path="phone" cssErrorClass="error"/>
        <form:errors path="phone" cssClass="error"></form:errors>
        <br>
        <input type="submit" class="btn" value="Enter Attendee"/>

    </form:form>
</body>
</html>
