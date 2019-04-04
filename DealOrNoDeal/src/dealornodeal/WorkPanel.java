/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealornodeal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class WorkPanel extends JPanel{
    JButton[]MatrizBotones;
    private JButton btnNuevo;
    public WorkPanel(){
    this.setSize(new Dimension(1200, 600));
   String[] ordenadas = {"1,000","1,000","1,000","1,000","1,000","5,000","5,000","5,000","5,000","10,000","10,000",
       "10,000","25,000","25,000","50,000","50,000","75,000","75,000","100,000","100,000","200,000","300,000","400,000"
       ,"500,000","750,000","1,000,000"};

        boolean[] impresas = new boolean[ordenadas.length];
        for(int i = 0; i < ordenadas.length;){
            int posicion = (int)(Math.random() * ordenadas.length);
            if(!impresas[posicion]){
                impresas[posicion] = true;
                System.out.println(ordenadas[posicion]);
                //Se settea el tamaño de la matriz de botones
                MatrizBotones = new JButton[26];
                //Se settea el tamaño de gridLayout de nuestro panel del tablero
                this.setLayout(new GridLayout(2,13));
                //Se crea un nuevo objeto de tipo JButton
                btnNuevo = new JButton(ordenadas[posicion]);
                //Se le asignan sus dimensiones (ancho, alto)
                 btnNuevo.setSize(200, 100);  
                 btnNuevo.setText(String.valueOf(i+1));
                 btnNuevo.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                    btnNuevo.setText(ordenadas[posicion]);
                    
                    }
                });
                 i++;
                 super.add(btnNuevo);
                
                
            }
        }
    }
}
