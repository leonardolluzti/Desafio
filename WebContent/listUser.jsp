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
<img src="imagens/favicon.png"><h1>Usuários</h1>
<p><a href="UserController?action=insert" class="Botao" >Novo Usuário</a></p>
	<table border=1>
		<thead>
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Email</th>
				<th>Senha</th>
				<th>DDD</th>
				<th>Fone</th>
				<th>Tipo</th>
				<th colspan=2>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${usuarios}" var="user">
				<tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.nome}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.senha}" /></td>
                    <td><c:out value="${user.ddd}" /></td>
                    <td><c:out value="${user.fone}" /></td>
                    <td><c:out value="${user.tipo}" /></td>
                    <td><a href="UserController?action=edit&id=<c:out value="${user.id}"/>" class="Botao" >Atualizar</a></td>
                    <td><a href="UserController?action=delete&id=<c:out value="${user.id}"/>" class="Botao" >Delete</a></td>
                </tr>
            </c:forEach>
		</tbody>
	</table>
</body>
</html>
