/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejem.CRUD.web.Modelo;


import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;


/**
 *
 * @author kuzni
 */
public class Coneccion {
    private static Connection con;
    private static BasicDataSource dataSource = new BasicDataSource();
    
    public static DataSource getDataSource(){try {
                
                String URL = "jdbc:mysql://localhost:3306/crud_bdd_backend";
                //dataSource.setDriverClassName("com.mysql.jdbc.Driver"); //loads the jdbc driver            
                dataSource.setUrl(URL);
                dataSource.setUsername("root");                                  
                dataSource.setPassword("root"); 
                dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
                // Parameters for connection pooling
                dataSource.setInitialSize(10);
                dataSource.setMaxTotal(10);/*
                String URL = "jdbc:mysql://root:root@localhost:3306/crud_bdd_backend?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
                dataSource = new BasicDataSource();
                dataSource.setUrl(URL);
                dataSource.setInitialSize(50);*/
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
                throw new RuntimeException("Error no se pudo conectar con la BASE DE DATOS", ex);
            }
        
        return dataSource;
    }
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
}
