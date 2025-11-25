
package com.mycompany.actividad6;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class Confirmacion extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Deseas salir del programa?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
}
