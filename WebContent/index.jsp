<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Desafio SEFAZ</title>
<link rel="favicon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<jsp:forward page="/UserController?action=listUser.jsp" />
</body>
</html>