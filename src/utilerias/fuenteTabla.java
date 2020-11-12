
package utilerias;

import java.awt.Font;
import javax.swing.JTable;


public class fuenteTabla {
    
     public void cargarFuente(JTable tabla){
        
        
        Font fuente = new Font("Consolas", Font.BOLD, 12);
        Font header = new Font("Consolas", Font.BOLD, 14);
        tabla.setFont(fuente);
        tabla.getTableHeader().setFont(header);
        
    }
    
}
