<%@page import="br.com.turma.jdbc.Aluno"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Lista de Alunos</h2>
	
	<% ArrayList<Aluno> alunos = (ArrayList<Aluno>)request.getAttribute("alunos"); %>
	<table border="1">
		<thead>
		<tr>
			<th>Código</th>
			<th>Nome</th>
			<th>1° Bimestre</th>
			<th>2° Bimestre</th>
			<th>3° Bimestre</th>
			<th>4° Bimestre</th>
			<th>Média</th>
			<th>Status</th>		
		</tr>
		</thead>
		<tbody>
			<% for(Aluno aluno:alunos){ %>
			<tr>
				<td><%=aluno.getCodigo() %></td>
				<td><%=aluno.getNome() %></td>
				<td><%=aluno.getPrim() %></td>
				<td><%=aluno.getSeg() %></td>
				<td><%=aluno.getTer() %></td>
				<td><%=aluno.getQua() %></td>
				<td><%=aluno.getMedia() %></td>
				<td><%=aluno.getStatus_final() %></td>
			</tr>
			<%} %>	
			
		</tbody>
	</table>

</body>
</html>