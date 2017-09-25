<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <meta name="description" content="">
    <meta name="author" content="">
    <title>Login</title>
	<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}</style>
    <!-- Bootstrap core CSS -->
    <link href="<c:url value='/resources/vendor/bootstrap/css/bootstrap.min.css'/> " rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="<c:url value='/resources/vendor/font-awesome/css/font-awesome.min.css' />" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template -->
    <link href="<c:url value='/resources/css/sb-admin.css' />" rel="stylesheet">

  </head>

  <body class="bg-dark">

    <div class="container">

      <div class="card card-login mx-auto mt-5">
        <div class="card-header">
          Login
        </div>
        <c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
        <div class="card-body">
          <form action="${loginUrl}" method='post'>
            <div class="form-group">
              <label for="exampleInputEmail1">Email address</label>
              <input type="text" class="form-control" id="exampleInputEmail1" name='username' aria-describedby="emailHelp" placeholder="Enter email">
            </div>
            <div class="form-group">
              <label for="exampleInputPassword1">Password</label>
              <input type="password" class="form-control" id="exampleInputPassword1" name='password' placeholder="Password">
            </div>
            <div class="form-group">
              <div class="form-check">
                <label class="form-check-label">
                  <input type="checkbox" class="form-check-input">
                  Remember Password
                </label>
              </div>
            </div>
            <input type="hidden"
                     name="${_csrf.parameterName}" value="${_csrf.token}" />
            <input name="submit" type="submit" value="submit" class="btn btn-primary btn-block" />
            
          </form>
          <div class="text-center">
            <a class="d-block small mt-3" href="register.html">Register an Account</a>
            <a class="d-block small" href="forgot-password.html">Forgot Password?</a>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript -->
    <script src="<c:url value='/resources/vendor/jquery/jquery.min.js'/>"></script>
    <script src="<c:url value='/resources/vendor/popper/popper.min.js'/>"></script>
    <script src="<c:url value='/resources/vendor/bootstrap/js/bootstrap.min.js'/>"></script>

</html>