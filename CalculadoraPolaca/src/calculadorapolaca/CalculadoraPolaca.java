/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapolaca;

import gui.FrameCalculadora;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sergio
 */
public class CalculadoraPolaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrameCalculadora();
            }
        });
    }
    
}
