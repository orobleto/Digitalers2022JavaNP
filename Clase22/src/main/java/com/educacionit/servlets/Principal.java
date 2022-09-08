package com.educacionit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = { "/saludo", "/principal" })
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Principal() {
		super();

	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("https://www.educacionit.com/");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		obtenerParametros(request, response);
	}

	private void obtenerParametros(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String nombre = request.getParameter("nombre");
		String correo = request.getParameter("correo");
		String activo = request.getParameter("activo");

		response.setStatus(201);
		PrintWriter printWriter = response.getWriter();
		printWriter.write("<html>");
		printWriter.write("<title>Digitalers 2022 </title>");
		printWriter.write("<body>");
		printWriter.write("<h1>");
		printWriter.write(nombre + " - " + correo + " - " + activo);
		printWriter.write("</h1>");
		printWriter.write("</body>");
		printWriter.write("</html>");
		printWriter.flush();
		printWriter.close();

	}

}
