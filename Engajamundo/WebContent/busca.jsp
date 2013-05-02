<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Busca por nome</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:panelGrid columns="3">
				<h:outputLabel value="Nome: " for="nome" />
				<h:inputText label="Nome" id="nome" required="true"
					value="#{controllerEngajador.engajador.nome}">
					<f:validator validatorId="nomeValidator" />
				</h:inputText>
				<h:message for="nome" errorStyle="color:red; display:block" />
				<h:commandButton action="#{controllerEngajador.buscarEngajador}"
					value="Buscar"></h:commandButton>
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>