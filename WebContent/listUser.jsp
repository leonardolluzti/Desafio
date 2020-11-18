<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<jsp:useBean id="dao" class="dao.UserDao"	/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Desafio SEFAZ</title>
<link rel="favicon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
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
			<%  UserDao dao = new UserDao();
				List<User> usuarios = dao.UserDao().getLista();
 				for (User user : usuarios ) {
  			%>
				<tr>
					<td><%=user.getId()%></td>
					<td><%=user.getNome()%></td>
					<td><%=user.getEmail()%></td>
					<td><%=user.getSenha()%></td>
					<td><%=user.getDdd()%></td>
					<td><%=user.getFone()%></td>
					<td><%=user.getTipo()%></td>
					<td><a href="UserController?action=edit&id=<%=user.getId()%>">Update</a></td>
					<td><a href="UserController?action=delete&id=<%=user.getId()%>">Delete</a></td>
				</tr>
			 <%  }  %>
		</tbody>
	</table>
	<p><a href="UserController?action=insert">Adicionar Usuário</a></p>
</body>
</html>