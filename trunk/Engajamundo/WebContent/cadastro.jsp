<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Engajador</title>
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

				<h:outputLabel value="Sobrenome: " for="sobrenome" />
				<h:inputText label="Sobrenome" id="sobrenome" required="true"
					value="#{controllerEngajador.engajador.sobrenome}">
					<f:validator validatorId="nomeValidator" />
				</h:inputText>
				<h:message for="sobrenome" errorStyle="color:red; display:block" />


				<h:outputLabel value="Email: " for="email" />
				<h:inputText label="Email" id="email" required="true"
					value="#{controllerEngajador.engajador.email}">
					<f:validator validatorId="emailValidator" />
				</h:inputText>
				<h:message for="email" errorStyle="color:red; display:block" />

				<h:outputLabel value="Data de nascimento: " for="data" />
				<h:inputText label="Data" id="data" required="true"
					value="#{controllerEngajador.engajador.data_nascimento}">
					<f:validator validatorId="dataValidator" />
				</h:inputText>
				<h:message for="data" errorStyle="color:red; display:block" />

				<h:outputLabel value="Telefone: " for="telefone" />
				<h:inputText label="Telefone" id="telefone" required="true"
					value="#{controllerEngajador.engajador.telefone}">
					<f:validator validatorId="telefoneValidator" />
				</h:inputText>
				<h:message for="telefone" errorStyle="color:red; display:block" />

				<h:outputLabel value="Skype: "></h:outputLabel>
				<h:inputText id="skype"
					value="#{controllerEngajador.engajador.profile_skype}"></h:inputText>
				<h:message for="skype" errorStyle="color:red; display:block" />

				<h:outputLabel value="Link da página do Facebook: "></h:outputLabel>
				<h:inputText id="facebook"
					value="#{controllerEngajador.engajador.profile_facebook}"></h:inputText>
				<h:message for="facebook" errorStyle="color:red; display:block" />

				<h:outputLabel value="Cidade: "></h:outputLabel>
				<h:inputText id="cidade"
					value="#{controllerEngajador.engajador.cidade}"></h:inputText>
				<h:message for="cidade" errorStyle="color:red; display:block" />

				<h:outputLabel value="Estado: "></h:outputLabel>
				<h:inputText id="estado"
					value="#{controllerEngajador.engajador.estado}"></h:inputText>
				<h:message for="estado" errorStyle="color:red; display:block" />

				<h:outputLabel value="Pais: "></h:outputLabel>
				<h:inputText id="pais" value="#{controllerEngajador.engajador.pais}"></h:inputText>
				<h:message for="pais]" errorStyle="color:red; display:block" />

				<h:outputLabel value="Comentários: "></h:outputLabel>
				<h:inputTextarea
					value="#{controllerEngajador.engajador.comentarios}"></h:inputTextarea>


				<h:commandButton action="#{controllerEngajador.controllerEngajador}"
					value="Cadastrar"></h:commandButton>
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>