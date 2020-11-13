
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    
    
    private static Connection conexion = null;
    
    public static Connection getConnection(){
     try{
        if(conexion == null){
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/proventa","root","");
        }
     }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex); 
     }
    return conexion;
}
    
    public static synchronized void cerrarPrep(PreparedStatement st){
        try{st.close();}catch(SQLException e){e.printStackTrace();}
    }
    
    public static synchronized void cerrarConexion(ResultSet rs){
        try{rs.close();}catch(SQLException e){e.printStackTrace();}
    }
    
    public static synchronized void cerrarConexion(Connection c){
        try{c.close();}catch(SQLException e){e.printStackTrace();}
    }
    
    public static synchronized void rollback(Connection c){
        try{c.rollback();}catch(SQLException e){e.printStackTrace();}
    }
    
}
