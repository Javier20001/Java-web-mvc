/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejem.CRUD.web.Modelo;

import java.util.List;

/**
 *
 * @author kuzni
 */
public interface Modelo {

    public List<Producto> getProductos();
    
    public List<Producto> getProductosCarrito();

    public Producto getProducto(int id);
   
    public int addProducto(Producto P);
    
    public int addProductoCarrito(int id);
    
    public int updateProducto(Producto p);
    
    public int removeProducto(int id);
    
    public int removeProductoCarrito(Producto p);
}
