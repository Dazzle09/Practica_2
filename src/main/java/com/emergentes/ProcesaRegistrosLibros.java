package com.emergentes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaRegistrosLibros", urlPatterns = {"/ProcesaRegistrosLibros"})
public class ProcesaRegistrosLibros extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String resumen = request.getParameter("resumen");
        String medio = request.getParameter("medio");
        RegistrosLibros lib= new RegistrosLibros();
        lib.setAutor(autor);
        lib.setTitulo(titulo);
        lib.setResumen(resumen);
        lib.setMedio(medio);    
        request.setAttribute("lib", lib);             
        request.getRequestDispatcher("SalidaRegistrosLibros.jsp").forward(request, response);
    }
}
