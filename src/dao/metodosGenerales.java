package dao;

import bd.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class metodosGenerales {

    Connection c = conexion.getConnection();
    ResultSet rs;
    PreparedStatement st;

    public boolean registrar(String tabla, String values, ArrayList<Object> datos, String fields) {

        try {
            c.setAutoCommit(false);
            st = c.prepareStatement("INSERT INTO " + tabla + "(" + values + ")"
                    + "VALUES(" + fields + ")");

            for (int i = 0; i < datos.size(); i++) {

                st.setObject(i + 1, datos.get(i));
            }
            st.execute();
            c.commit();
            st.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

    public boolean editar(String tabla, String values, ArrayList<Object> datos, String condicion) {

        try {
            c.setAutoCommit(false);
            st = c.prepareStatement("UPDATE " + tabla + " SET " + values + condicion);

            for (int i = 0; i < datos.size(); i++) {

                st.setObject(i + 1, datos.get(i));
            }

            st.executeUpdate();
            c.commit();
            st.close();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

    public boolean eliminarId(String tabla, String values, ArrayList<Object> datos, String condicion) {

        try {
            c.setAutoCommit(false);
            st = c.prepareStatement("UPDATE " + tabla + " SET " + values + condicion);

            for (int i = 0; i < datos.size(); i++) {

                st.setObject(i + 1, datos.get(i));
            }

            st.executeUpdate();
            c.commit();
            st.close();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }

}
