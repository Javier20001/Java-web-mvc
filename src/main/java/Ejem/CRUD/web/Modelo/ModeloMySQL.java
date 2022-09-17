/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejem.CRUD.web.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kuzni
 */
public class ModeloMySQL implements Modelo{
    
    private static final String GET_ALL_QUERRY = "SELECT * FROM producto WHERE eliminado_producto = 0";
    private static final String ADD_QUERRY = "INSERT INTO PRODUCTO(id_producto,nombre_producto,tipo_producto,precio_producto,foto_producto,eliminado_producto) VALUES (NULL,?,?,?,?,?)";
    private static final String DELETE_QUERRY = "UPDATE PRODUCTO SET eliminado_producto = 1 WHERE id_producto = ?";
    @Override
    public List<Producto> getProductos() {
        List<Producto> productos = new ArrayList<>();
        try(
                Connection con = Coneccion.getConnection();
                PreparedStatement ps = con.prepareStatement(GET_ALL_QUERRY)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                productos.add(RScrearProducto(rs));
            }
        } catch (SQLException ex) {
          throw  new RuntimeException("Error de SQL",ex);
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosCarrito() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto getProducto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int addProducto(Producto P){
        int regsAgregados = 0;
        try( Connection con = Coneccion.getConnection(); PreparedStatement ps = con.prepareStatement(ADD_QUERRY)){
            fillPreparedStatement(ps, P);
            regsAgregados = ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Error de SQL",ex);
        } catch(Exception ex){
            throw new RuntimeException("Error al agregar el producto " + P.getNombre());
        }
        return regsAgregados;
    }

    @Override
    public int addProductoCarrito(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int updateProducto(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int removeProducto(int id) {
        int regsAgregados = 0;
        try( Connection con = Coneccion.getConnection(); PreparedStatement ps = con.prepareStatement(DELETE_QUERRY)){
            ps.setInt(1, id);
            regsAgregados = ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage(),ex);
        } catch(Exception ex){
            throw new RuntimeException("Error al eliminar el producto ",ex);
        }
        return regsAgregados;
    }

    @Override
    public int removeProductoCarrito(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private Producto RScrearProducto(ResultSet rs) throws SQLException{
        int id = rs.getInt(1);
        String nombre = rs.getString(2);
        String tipo = rs.getString(3);
        int precio = rs.getInt(4);
        String foto = rs.getString(5);
        return  new Producto(id, nombre, tipo, precio, foto);
    }
    private void fillPreparedStatement(PreparedStatement ps, Producto producto) throws SQLException {
        ps.setString(1, producto.getNombre());
        ps.setString(2, producto.getTipo());
        ps.setString(3, Integer.toString(producto.getPrecio()));
        ps.setString(4, producto.getFoto());
        ps.setString(5, "0");
    }
}   
