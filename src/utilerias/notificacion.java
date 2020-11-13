package utilerias;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.net.MalformedURLException;

public class notificacion {

    /**
     * Aplicación
     *
     * @param btn
     * @param sistema
     * @param mensaje
     * @param args
     * @throws java.awt.AWTException
     * @throws java.net.MalformedURLException
     */
    public void mostrarNotificacion() {

        notificacion _this = this;

        if (SystemTray.isSupported()) {
            try {
                _this.displayTray("proventa", "Tarea completada");
            } catch (AWTException ex) {

            } catch (MalformedURLException ex) {

            }
        } else {
            System.err.println("Bandeja de entrada no soportada!");
        }
    }

    public void displayTray(String sistema, String mensaje) throws AWTException, MalformedURLException {
        // Obtener solamente una instancia del objeto SystemTray
        SystemTray tray = SystemTray.getSystemTray();

        // Si quieres crear un icono en la bandeja del sistemas como vista previa
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        // Alternativamente (si el icono está en el directorio de la clase):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
        // Deja que el sistema auto escale si es necesario
        trayIcon.setImageAutoSize(true);
        // Definir texto de tooltip (descripción emergente)
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage(sistema, mensaje, MessageType.WARNING);
    }

}
