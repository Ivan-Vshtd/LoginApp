<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Create an account</title>




  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>

<body>

<div class="container">

  <form:form method="POST" modelAttribute="userForm" class="form-signin">
    <h2 class="form-signin-heading">Create your account</h2>
    <spring:bind path="username">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="username" class="form-control" placeholder="Create a username"
                    autofocus="true"></form:input>
        <form:errors path="username"></form:errors>
      </div>
    </spring:bind>

    <spring:bind path="password">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="password" path="password" class="form-control" placeholder="Create a password"></form:input>
        <form:errors path="password"></form:errors>
      </div>
    </spring:bind>

    <spring:bind path="confirmPassword">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="password" path="confirmPassword" class="form-control"
                    placeholder="Confirm your password"></form:input>
        <form:errors path="confirmPassword"></form:errors>
      </div>
    </spring:bind>

    <spring:bind path="firstname">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="firstname" class="form-control"
                    placeholder="Enter your firstname"></form:input>
        <form:errors path="firstname"></form:errors>
      </div>
    </spring:bind>

    <spring:bind path="surename">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="surename" class="form-control"
                    placeholder="Enter your surename"></form:input>
        <form:errors path="surename"></form:errors>
      </div>
    </spring:bind>

    <spring:bind path="phone">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="phone" class="form-control"
                    placeholder="Enter your phone number"></form:input>
        <form:errors path="phone"></form:errors>
      </div>
    </spring:bind>

    <spring:bind path="city">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="city" path="city" class="form-control"
                    placeholder="Enter your city"></form:input>
        <form:errors path="city"></form:errors>
      </div>
    </spring:bind>

    <spring:bind path="street">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="street" class="form-control"
                    placeholder="Enter your street"></form:input>
        <form:errors path="street"></form:errors>
      </div>
    </spring:bind>

    <spring:bind path="home">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="home" class="form-control"
                    placeholder="Enter your home number"></form:input>
        <form:errors path="home"></form:errors>
      </div>
    </spring:bind>

    <spring:bind path="email">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="email" class="form-control"
                    placeholder="Enter your email"></form:input>
        <form:errors path="email"></form:errors>
      </div>
    </spring:bind>

    <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
  </form:form>

</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>