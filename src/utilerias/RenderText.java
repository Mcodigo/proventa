package utilerias;

import java.awt.Component;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public final class RenderText extends JLabel implements ListCellRenderer {

    /**
     * Para guardar los iconos por cada item. El item es la clave y el valor es
     * el icono.
     */
    Hashtable<Object, ImageIcon> icono;

    /**
     * Construye el Hashtable con los iconos seleccionados, asociándolos a los
     * items que tendrá el JComboBox "uno", "dos", "tres" y "cuatro"
     */
    public RenderText() {
        icono = new Hashtable<Object, ImageIcon>();
        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/recursos/barcode.png"));
//        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/recursos/shoppaymentorderbuy-09_icon-icons.com_73854.png"));
//        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/recursos/groups_people_people_1715.png"));
//        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/recursos/4202078drinklogopepsisocialsocialmedia-115610_115692.png"));
//        ImageIcon img5 = new ImageIcon(this.getClass().getResource("/recursos/businessman_man_person_people_2842.png"));
//        ImageIcon img6 = new ImageIcon(this.getClass().getResource("/recursos/users-team_icon-icons.com_57998.png"));
        agregarElemento("Almacen", img1);
//        agregarElemento("Categoria", img2);
//        agregarElemento("Cliente", img3);
//        agregarElemento("Producto", img4);
//        agregarElemento("Proveedor", img5);
//        agregarElemento("Usuario", img6);
    }

    public void agregarElemento(Object o, ImageIcon img) {
        icono.put(o, img);
    }

    /**
     * En función del value que se pasa (el item del JComboBox), se pone el
     * icono y se devuelve el JLabel.
     */
    @Override
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        if (icono.get(value) != null) {
            setIcon(icono.get(value));
            setText("" + value);
        } else {
            setIcon(null);
        }
        return this;
    }

}
