/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejem.CRUD.web.Modelo;

/**
 *
 * @author kuzni
 */
public class Producto {
    // poner los atibutos en minuscula!!!!!!!!!!!!!!
    private int ID;
    private String Nombre;
    private String Tipo;
    private int Precio;
    private String foto;
    
    public Producto(){}
    
    public Producto(String nombre,  String tipo , int precio , String foto ){
        this(0, nombre, tipo, precio, foto);
    }
    
    public Producto(int id, String nom, String tip, int p, String f){
        setID(id);
        setNombre(nom);
        setTipo(tip);
        setPrecio(p);
        setFoto(f);
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if(ID<0){
            throw new RuntimeException("No se introdujo un id valido");
        }
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre){
        if(Nombre == null && Nombre.trim().isEmpty()){
            throw new RuntimeException("No se ah provisto un nombre");
        }
        this.Nombre = Nombre;
    }

    public String getTipo(){
        return Tipo;
    }

    public void setTipo(String Tipo) {
        if( Tipo== null && Tipo.trim().isEmpty()){
            throw new RuntimeException("No se ah provisto un nombre");
        }
        this.Tipo = Tipo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        if(Precio < 0){
            throw new RuntimeException("No se ah provisto un precio adecuado");
        }
        this.Precio = Precio;
    }
    
    public void setFoto(String foto) {
        if (foto == null || foto.trim().isEmpty() || foto.equals("#")) {
            foto = "img/no-face.jpg";
        }
        if (!foto.contains("no-face") || this.foto == null || this.foto.contains("no-face")) {
            this.foto = foto.trim();
        }
    }

    public String getFoto() {
        return foto;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", Nombre=" + Nombre + ", Tipo=" + Tipo + ", Precio=" + Precio + ", foto=" + foto + '}';
    }
    
    
    
}
