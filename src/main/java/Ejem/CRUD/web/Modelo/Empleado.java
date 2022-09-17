package Ejem.CRUD.web.Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kuzni
 */
public class Empleado {
    private String usuario;
    private String contrasenia;

    public Empleado(String u , String c){
        setUsuario(u);
        setContrasenia(c);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario){
        if(!usuario.isEmpty()){
            this.usuario = usuario;
        }else{
            throw new RuntimeException("Inserte un Usuario valido por favor");
        }
        
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        if(!contrasenia.isEmpty()){
            this.contrasenia=contrasenia;
        }else{
            throw new RuntimeException("Inserte una Contraseña valido por favor");
        }
    }
    
    public boolean validacion(String usuarioIngresado, String contraIngresado){
        boolean resultado = false;
        if(this.usuario.equals(usuarioIngresado) && this.contrasenia.equals(contraIngresado)){
            resultado = true;
        }
        return resultado;
    }
   
}
