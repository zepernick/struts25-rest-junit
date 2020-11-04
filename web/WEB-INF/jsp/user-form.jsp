<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
    <s:form action="my-test" namespace="/test" method="POST">
        <s:textfield name="user.firstName" requiredLabel="true" label="First" />
        <s:textfield name="user.lastName" requiredLabel="true" label="Last" />
        <s:submit label="Save" />
    </s:form>
</body>
</html>
