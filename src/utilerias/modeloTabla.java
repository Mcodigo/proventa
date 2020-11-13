package utilerias;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class modeloTabla {

    public void mostrarColumas(JTable tabla, DefaultTableModel modelo, ArrayList<String> columnas) {

        for (int i = 0; i < columnas.size(); i++) {
            modelo.addColumn(columnas.get(i));
        }

        tabla.setModel(modelo);
        Font fuente = new Font("Consolas", Font.BOLD, 12);
        Font header = new Font("Consolas", Font.BOLD, 14);
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getTableHeader().setFont(header);
        tabla.setFont(fuente);
    }

}
