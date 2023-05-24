package Controlador;

import Entidad.Docente;
import Modelo.ModeloDocente;
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
@WebServlet(name = "ServletDocente", urlPatterns = {"/ServletDocente"})
public class ServletDocente extends HttpServlet {
    
    String listarD = "vistas/listaDocente.jsp";
    String agregar = "vistas/agregaDocente.jsp";
    String editar = "vistas/actualizaDocente.jsp";
    String buscarD = "vistas/buscarDocente.jsp";
    int id;
    Docente d = new Docente();
    ModeloDocente modelo = new ModeloDocente();
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
            out.println("<title>Servlet ServletDocente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletDocente at " + request.getContextPath() + "</h1>");
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
            acceso = listarD;
        }else if (action.equalsIgnoreCase("agregar")) {
            acceso = agregar;
        } else if (action.equalsIgnoreCase("Enviar")) {
            String nombres = request.getParameter("txtNombre");
            String apellidos = request.getParameter("txtApellido");
            String especialidad = request.getParameter("txtEspecialidad");
            String fechaIngreso = request.getParameter("txtFechaIngreso");
            d.setNombres(nombres);
            d.setApellidos(apellidos);
            d.setEspecialidad(especialidad);
            d.setFechaIngreso(fechaIngreso);
            modelo.agregar(d);
            acceso = listarD;
        } else if (action.equalsIgnoreCase("editar")) {
                request.setAttribute("iddoc",request.getParameter("id"));
                acceso = editar;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            String nombres = request.getParameter("txtNombre");
            String apellidos = request.getParameter("txtApellido");
            String especialidad = request.getParameter("txtEspecialidad");
            String fechaIngreso = request.getParameter("txtFechaIngreso");
            d.setIdDocente(id);
            d.setNombres(nombres);
            d.setApellidos(apellidos);
            d.setEspecialidad(especialidad);
            d.setFechaIngreso(fechaIngreso);
            modelo.actualizar(d);
            acceso = listarD;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            id = Integer.parseInt(request.getParameter("id"));
            d.setIdDocente(id);
            modelo.eliminar(id);
            acceso = listarD;
        } else if(action.equalsIgnoreCase("BuscDocen")){
            acceso = buscarD;
        }
        else if(action.equals("Buscar")){
            String dato = request.getParameter("txtBuscar");
            List<Docente> lista = modelo.buscar(dato);
            request.setAttribute("resultados", lista);
            acceso = buscarD;
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
