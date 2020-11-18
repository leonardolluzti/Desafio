<%@ page language="java" contentType="text/html; charset=utf-8 
pageEncoding=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Desafio SEFAZ</title>
<link rel="favicon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
    <img src="imagens/favicon.png">
	<h1>Usuários</h1>
	<form method="POST" action='UserController' name="frmAddUser">
		ID :   <input type="text" readonly="readonly" name="id" value="<c:out value="${user.userid}" />" /> <br /> 
		Nome:  <input type="text" name="nome" value="<c:out value="${user.nome}" />" /> <br /> 
		Senha: <input type="text" name="senha" value="<c:out value="${user.senha}" />" /> <br /> 
		Email: <input type="text" name="email" value="<c:out value="${user.email}" />" /> <br />
		DDD:   <input type="text" name="ddd" value="<c:out value="${user.ddd}" />" /> <br />
		Fone:  <input type="text" name="fone" value="<c:out value="${user.fone}" />" /> <br /> 
		Tipo:  <input type="text" name="tipo" value="<c:out value="${user.tipo}" />" /> <br />   
		<input type="submit" value="Gravar" />
	</form>
</body>
</html>