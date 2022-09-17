/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Ejem.CRUD.web.Controlador;

import java.io.IOException;

import Ejem.CRUD.web.Modelo.Modelo;
import Ejem.CRUD.web.Modelo.ModeloHC;
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
@WebServlet(name = "CarritoServlet", urlPatterns = {"/Carrito"})
public class CarritoServlet extends HttpServlet {
    
    private Modelo model;
    private final String URI_LIST = "CarritoListado.jsp"; 
    
    
    @Override
    public void init() throws ServletException {
        this.model = new ModeloHC();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("listProductosEnCarrito", model.getProductosCarrito());
        System.out.println(model.getProductosCarrito().size());
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
            case "addCarrito":
                int ID = Integer.parseInt(request.getParameter("ID"));
                model.addProductoCarrito(ID);
                break;
            case "delete":
                p = model.getProducto(Integer.parseInt(request.getParameter("ID")));
                model.removeProductoCarrito(p);
                break;
        }
        doGet(request, response);
    }
    
}   
