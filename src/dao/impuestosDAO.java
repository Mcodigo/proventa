
package dao;

import bd.conexion;
import entidad.impuestos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class impuestosDAO {
    
    Connection c = conexion.getConnection();
    ResultSet rs;
    PreparedStatement st;
    
    public ArrayList<impuestos> listar() {
        ArrayList<impuestos> lista = new ArrayList<>();
        try {
            st = c.prepareStatement("SELECT * FROM impuestos WHERE mostrar = 1 order by nombre");
            rs = st.executeQuery();

            while (rs.next()) {
                impuestos obj = new impuestos();
                
                obj.setClave(rs.getInt("clave"));
                obj.setIncluir(rs.getBoolean("incluir"));
                obj.setNombre(rs.getString("nombre"));
                obj.setPorcentaje(rs.getDouble("porcentaje"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            conexion.cerrarPrep(st);
        }
        return lista;
    }
    
    
}
