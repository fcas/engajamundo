<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Engajador</title>
</head>
<body>
<f:view>
	<h:form>
		<p>Login: </p><h:inputText required="true" id = "login" value="#{controllerSession.login}">
		<f:validator validatorId="loginValidator"/>
		</h:inputText>
		
		<p>Senha: </p><h:inputSecret required="true" value="#{controllerSession.senha}"></h:inputSecret><br><br>
		<h:commandButton action="#{controllerSession.autenticar}" value="Entrar!"></h:commandButton>
		<h:message for="login" errorStyle="color:red; display:block" />
	</h:form>
</f:view>
</body>
</html>