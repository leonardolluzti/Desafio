<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:useBean id="dao" class="dao.UserDao"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Desafio SEFAZ</title>
<link rel="favicon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
<!--Script para autoredimensionar pána de acordo com a resolução-->    
<script type="text/javascript">  
      if (screen.width >= "1024") {  
        window.resizeTo(1024, 768);  
      }  
      if (screen.width == "800") {  
        window.resizeTo(800, 600);  
      }  
      if (screen.width <= "800") {  
        window.resizeTo(640, 420);  
      }  
</script>
</head>
<body>
    
	<h1><img src="imagens/novousuario.png" /> Usuários</h1>
	<form method="POST" action='UserController' name="frmAddUser">
		ID :   <input type="text" readonly="readonly" name="id" value="<c:out value="${user.id}" />" /> <br /> 
		Nome:  <input type="text" maxlength="50" name="nome" value="<c:out value="${user.nome}" />" /> <br /> 
		Senha: <input type="password"  maxlength="20" name="senha" value="<c:out value="${user.senha}" />" /> <br /> 
		Email: <input type="email" maxlength="50" name="email" value="<c:out value="${user.email}" />" /> <br />
		DDD:   <select name="ddd">
				<option value="81">81</option>
				<option value="83">83</option>
				<option value="11">11</option>
			   </select>
				<br />
		Fone:  <input type="tel" maxlength="10" name="fone" value="<c:out value="${user.fone}" />" /> <br /> 
		Tipo:  <select name="tipo">
				<option value="Casa">Casa</option>
				<option value="Comercial">Comercial</option>
				<option value="Celular">Celular</option>
			   </select>
		 
		<input type="submit" class="Botao" value="Gravar">
	</form>
</body>
</html>
