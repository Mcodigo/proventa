package dao;

import bd.conexion;
import entidad.departamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class departamentosDAO {

    Connection c = conexion.getConnection();
    ResultSet rs;
    PreparedStatement st;
    
    
    public ArrayList<departamentos> listar() {
        ArrayList<departamentos> lista = new ArrayList<>();
        try {
            st = c.prepareStatement("SELECT * FROM departamentos WHERE estatus = 'A' order by nombre");
            rs = st.executeQuery();

            while (rs.next()) {
                departamentos obj = new departamentos();
                obj.setId(rs.getInt("id"));
                obj.setNombre(rs.getString("nombre"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            conexion.cerrarPrep(st);
        }
        return lista;
    }

}
