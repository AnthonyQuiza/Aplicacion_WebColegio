package Controlador;

import Entidad.Alumno;
import Modelo.ModeloAlumno;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Smuk
 */
public class ServletAlumno extends HttpServlet {

    String listarA = "vistas/listaAlumno.jsp";
    String agregar = "vistas/agregaAlumno.jsp";
    String editar = "vistas/actualizaAlumno.jsp";
    String buscarA = "vistas/buscarAlumno.jsp";
    int id;
    //String dato;
    Alumno a = new Alumno();
    ModeloAlumno modelo = new ModeloAlumno();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletAlumno</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAlumno at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            //request.setAttribute("datos", listar);
            acceso = listarA;
        } else if (action.equalsIgnoreCase("agregar")) {
            acceso = agregar;
        } else if (action.equalsIgnoreCase("Enviar")) {
            String nombres = request.getParameter("txtNombre");
            String apellidos = request.getParameter("txtApellido");
            int edad = Integer.parseInt(request.getParameter("txtEdad"));
            a.setNombres(nombres);
            a.setApellidos(apellidos);
            a.setEdad(edad);
            modelo.agregar(a);
            acceso = listarA;
        } else if (action.equalsIgnoreCase("editar")) {
                request.setAttribute("idal",request.getParameter("id"));
                acceso = editar;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            String nombres = request.getParameter("txtNombre");
            String apellidos = request.getParameter("txtApellido");
            int edad = Integer.parseInt(request.getParameter("txtEdad"));
            a.setIdAlumno(id);
            a.setNombres(nombres);
            a.setApellidos(apellidos);
            a.setEdad(edad);
            modelo.actualizar(a);
            acceso = listarA;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            id = Integer.parseInt(request.getParameter("id"));
            a.setIdAlumno(id);
            modelo.eliminar(id);
            acceso = listarA;
        }else if(action.equalsIgnoreCase("BuscAlum")){
            acceso = buscarA;
        }
        else if(action.equals("Buscar")){
            String dato = request.getParameter("txtBuscar");
            List<Alumno> lista = modelo.buscar(dato);
            request.setAttribute("resultados", lista);
            acceso = buscarA;
            /*String dato = request.getParameter("txtBuscar");
            List<Alumno> lista = modelo.buscar(dato);
            request.setAttribute("listar",lista);
            acceso = listarA;*/
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
