<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Engajador</title>
</head>
<body>
<f:view>
 <h:form>
  <h:panelGrid columns="2">
  <h:outputLabel value="Nome: "></h:outputLabel>
  <h:inputText value="#{controllerEngajador.engajador.nome}"></h:inputText>
   <h:outputLabel value="Sobrenome: "></h:outputLabel>
   <h:inputText value="#{controllerEngajador.engajador.sobrenome}"></h:inputText>
   <h:outputLabel value="Email: "></h:outputLabel>
   <h:inputText value="#{controllerEngajador.engajador.email}"></h:inputText>
   <h:outputLabel value="Data de nascimento: "></h:outputLabel>
   <h:inputText value="#{controllerEngajador.engajador.data_nascimento}"></h:inputText>
   <h:outputLabel value="Telefone: "></h:outputLabel>
   <h:inputText value="#{controllerEngajador.engajador.telefone}"></h:inputText>
   <h:outputLabel value="Skype: "></h:outputLabel>
   <h:inputText value="#{controllerEngajador.engajador.profile_skype}"></h:inputText>
   <h:outputLabel value="Link da página do Facebook: "></h:outputLabel>
   <h:inputText value="#{controllerEngajador.engajador.profile_facebook}"></h:inputText>
   <h:outputLabel value="Cidade: "></h:outputLabel>
   <h:inputText value="#{controllerEngajador.engajador.cidade}"></h:inputText>
   <h:outputLabel value="Estado: "></h:outputLabel>
   <h:inputText value="#{controllerEngajador.engajador.estado}"></h:inputText>
   <h:outputLabel value="Pais: "></h:outputLabel>
   <h:inputText value="#{controllerEngajador.engajador.pais}"></h:inputText>
   <h:outputLabel value="Comentários: "></h:outputLabel>
   <h:inputTextarea value="#{controllerEngajador.engajador.comentarios}"></h:inputTextarea>
   <h:commandButton action="#{controllerEngajador.controllerEngajador}" value="Cadastrar"></h:commandButton>
 </h:panelGrid>
 </h:form>
</f:view>
</body>
</html>