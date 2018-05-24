<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Spring Security</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/pages/css/bootstrap.css" />" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/pages/css/signin.css" />" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container" style="width: 300px;">
    <form:form modelAttribute="userForm" class="form-signin" method="post">
        <h2 class="form-signin-heading">Регистрация</h2>
        <spring:bind path="login">
            <form:input path="login" type="text" class="form-control" name="login" placeholder="Login"/>
        </spring:bind>
        <spring:bind path="password">
            <form:input path="password" type="password" class="form-control" name="password" placeholder="Password"/>
        </spring:bind>
        <spring:bind path="passwordConfirm">
            <form:input path="passwordConfirm" type="password" class="form-control" name="passwordConfirm" placeholder="Repeat Password"/>
        </spring:bind>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
    </form:form>
</div>

</body>
</html>