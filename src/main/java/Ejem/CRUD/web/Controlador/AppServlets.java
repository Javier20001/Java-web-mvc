/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Ejem.CRUD.web.Controlador;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import Ejem.CRUD.web.Modelo.Empleado;
import Ejem.CRUD.web.Modelo.Modelo;
import Ejem.CRUD.web.Modelo.ModeloFactory;
import Ejem.CRUD.web.Modelo.Producto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author kuzni
 */
@WebServlet(name = "AppControlador", urlPatterns = {"/App"})
public class AppServlets extends HttpServlet {
    
    //Es necesario primero instancia un Modelo 
    private Modelo model;
    private Empleado moderador;
    private final String URI_LIST = "ListadoDeProductos.jsp";
    
    
    /* (non-Javadoc)
     * @see jakarta.servlet.GenericServlet#init()
     */
    @Override
    public void init() throws ServletException {
        this.model = getModelo();
        this.moderador = new Empleado("User@gmail.com","1234");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        accion = accion == null ? "" : accion;
        switch(accion){
            case "singIN":
                request.setAttribute("validacion",moderador.validacion(request.getParameter("email"), request.getParameter("pass")));
                break;
            case "singOUT":
                request.setAttribute("validacion",false);
                break;
        }
        request.setAttribute("listProductos", model.getProductos());
        request.getRequestDispatcher(URI_LIST).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Producto p;
        String accion = request.getParameter("accion");
        //condicional ternario
        accion = accion == null ? "" : accion;
        switch(accion){
            case "add":
                p = new Producto();
                cargarProductoSegunParam(p , request);
                model.addProducto(p);
                break;
            case "delete":
                model.removeProducto(Integer.parseInt(request.getParameter("ID")));
                break;
                
        }
        doGet(request, response);
    }
    
    public void cargarProductoSegunParam(Producto p , HttpServletRequest request){
        p.setNombre(request.getParameter("nombre"));
        p.setTipo(request.getParameter("tipo"));
        p.setPrecio(Integer.parseInt(request.getParameter("precio")));
        p.setFoto(request.getParameter("fotoBase64"));
    }

    private Modelo getModelo() throws ServletException {
        Modelo m = null;
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties")) {
            Properties props = new Properties();
            props.load(is);
            String tipoModelo = props.getProperty("tipoModelo");
            m = ModeloFactory.getInstance().crearModelo(tipoModelo);
        } catch (IOException ex) {
            throw new ServletException("Error de E/S al al leer 'config' para iniciar el Servlet", ex);
        }
        return m;
    }
}
