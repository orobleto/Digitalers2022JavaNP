<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Inicio</title>
</head>
<body>
	<h1>Titulo</h1>
	<a href="#">Ir al indice</a>
<%!
// declaraciones
private String nombre;


private int numero(int num){
	return num+2;
}


%>

	<%

	// Scriptles
	for (int i = 0; i < 5; i++) {
		out.print("<h6>Linea " + (i + 1)+"</h6>");
	}
	%>
	
	
	<ul type="circle">
	
	<%
		for (int i = 0;i<5;i++){	

	%>
		<li>Lista <!-- Expresiones --> <%=numero(i)%></li>
	<%
		}
	%>	
	</ul>
	


</body>
</html>