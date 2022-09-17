/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejem.CRUD.web.Modelo;

/*import java.io.IOException;
import java.io.InputStream;*/
import java.util.ArrayList;
import java.util.List;
//import java.util.Properties;

/**
 *
 * @author kuzni
 */
public class ModeloHC implements Modelo{
    
    private List<Producto> ListadoDeProductos = new ArrayList<>();
    private List<Producto> ListadoProductosEnCarrito = new ArrayList<>();
    
    public ModeloHC(){
        crearProductosFake();
    }
    
    public List<Producto> getProductos() {
        return new ArrayList(this.ListadoDeProductos); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto getProducto(int id) {
        int i = 0;
        Producto encontrado = null;
        while (i < this.ListadoDeProductos.size() && encontrado == null) {
            Producto a = this.ListadoDeProductos.get(i);
            if (a.getID() == id) {
                encontrado = a;
            } else {
                i++;
            }
        }
        if (encontrado == null) {
            throw new RuntimeException("No se encontró alumno con ID " + id);
        }
        return encontrado;
    }

    @Override
    public int addProducto(Producto P) {
        System.out.println(P.toString());
        this.ListadoDeProductos.add(P);
        
        return 0;
    }

    @Override
    public int updateProducto(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int removeProducto(int id) {
        Producto target = getProducto(id);
        this.ListadoDeProductos.remove(target);
        return 0;
    }
    private void crearProductosFake(){
        this.ListadoDeProductos.add(new Producto(1,"Placa de Video Nvidea 3090" , "Computacion" , 170000 , "https://th.bing.com/th/id/R.b73a8655ab796c34603fb9810b64c805?rik=u4vfurrJvPa0aA&pid=ImgRaw&r=0"));
        this.ListadoDeProductos.add(new Producto(2,"Placa de Video Nvidea 3080" , "Computacion" , 160000 , "https://novaplay.com.br/wp-content/uploads/2020/12/placa-de-video-gigabyte-nvidia-geforce-rtx-3080-10gb-gddr6x-gv-n3080eagle-oc-10gd_1600096316_gg-600x600.jpg"));
        this.ListadoDeProductos.add(new Producto(3,"Placa de Video Nvidea 3070" , "Computacion" , 150000 , "img/3_1.png"));
        this.ListadoDeProductos.add(new Producto(4,"Placa de Video Nvidea 3060" , "Computacion" , 100000 , "img/4_1.png"));
        this.ListadoDeProductos.add(new Producto(5,"Placa de Video Nvidea 3060ti" , "Computacion" , 98000 , "img/5_1.png"));
        this.ListadoDeProductos.add(new Producto(6,"Placa de Video Nvidea 2080ti" , "Computacion" , 90000 , "img/6_1.png"));
        this.ListadoDeProductos.add(new Producto(7,"Placa de Video Nvidea 2080" , "Computacion" , 85000 , "img/7_1.png"));
        this.ListadoDeProductos.add(new Producto(8,"Placa de Video Nvidea 2070 super" , "Computacion" , 80000 , "img/8_1.png"));
        this.ListadoDeProductos.add(new Producto(9,"Placa de Video Nvidea 2060" , "Computacion" , 60000 , "img/9_1.png"));
    }

    @Override
    public List<Producto> getProductosCarrito(){
        return this.ListadoProductosEnCarrito; 
    }

    @Override
    public int addProductoCarrito(int id) {
        this.ListadoProductosEnCarrito.add(this.getProducto(id));
        return 0;
    }

    @Override
    public int removeProductoCarrito(Producto p){
        Producto target = getProducto(p.getID());
        this.ListadoProductosEnCarrito.remove(target);
        return 0;
    }
}
