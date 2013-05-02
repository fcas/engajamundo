<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:view>
		<h:form>
			<table border="0" cellspacing="0" cellpadding="10">
				<tr><th>Nome</tr><th>Senha</th><th>Sexo</th></tr>
				<c:forEach items="#{controllerEngajador.usuarios}" var="usuario">
					<tr>
					<td><h:inputText value="#{usuario.nome}"></h:inputText></td>
					<td><h:inputText value="#{usuario.sobrenome}"></h:inputText></td>
					<td><h:inputText value="#{usuario.email}"></h:inputText></td>
					</tr>
				</c:forEach>
			</table>
			<h:commandButton action="#{controllerEngajador.atualizar}" value="Atualizar"></h:commandButton>
		</h:form>
</f:view>
</body>
</html>