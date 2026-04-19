package app;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import vistas.Login;

import vistas.Inicio;

/**
 *
 * @author lapar
 */
public class ConchoAdmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        javax.swing.SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

}
