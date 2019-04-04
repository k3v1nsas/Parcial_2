/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


/**
 *
 * @author redoaxaca
 */
public class PrincipalForm extends JFrame {
    
    private JPanel pnlBotones;
    
    
    private SudokuDialog dlgAlumnos;
    
    private JButton btnNuevo;
    JButton[][] MatrizBotones;
    
    private Integer contadorX,contadorY;
 private Integer posicionx,posiciony;
    public PrincipalForm(){
        super("JTable Example - Alumnos");
        super.setSize(750,750 );
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        setLocationRelativeTo(null);
            
            //Se settea el tamaño de la matriz de botones
            MatrizBotones = new JButton[9][9];
            //Se settea el tamaño de gridLayout de nuestro panel del tablero
            this.setLayout(new GridLayout(9,9));
            //Se declaran los contadores a utilizar
            //Se recorre la dimension X desde 0 hasta DimensionX
            for (contadorX = 0; contadorX < 9; contadorX++)
            {
                //Se recorre la dimension Y desde 0 hasta DimensionY
                for (contadorY = 0; contadorY < 9; contadorY++)
                {
                    //Se crea un nuevo objeto de tipo JButton
                    btnNuevo = new JButton("");
                    //Se le asignan sus dimensiones (ancho, alto)
                    btnNuevo.setSize(100, 500);
                    //Se asigna un texto con la posición del botón en la matriz al botón, al tooltip del botón
                    btnNuevo.setToolTipText(Integer.toString(contadorX) + "," + Integer.toString(contadorY));
                    
                    //Se agrega a la matriz el botón recien creado
                    MatrizBotones[contadorX][contadorY] = btnNuevo;
                    //Se agrega un nuevo evento que maneje la acción clic sobre el botón creado
                    btnNuevo.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlgAlumnos.mostrar();

                        }
                    });
                    
                    //Se agrega al panel 
                    super.add(MatrizBotones[contadorX][contadorY]);
                   
                }//Fin For - Y
                
            }//Fin For - X
            
        dlgAlumnos = new SudokuDialog(this);
        dlgAlumnos.setListener(new SudokuDialogListener() {
            @Override
            public void aceptarButtonClick(String numero) {
                System.out.println(btnNuevo.getToolTipText());
                btnNuevo = MatrizBotones[1][0];
                btnNuevo.setText(numero);
                System.out.println("");
            }
        });
        super.setVisible(true);
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public void setBtnNuevo(JButton btnNuevo) {
        this.btnNuevo = btnNuevo;
    }

    public Integer getContadorX() {
        return contadorX;
    }

    public void setContadorX(Integer contadorX) {
        this.contadorX = contadorX;
    }

    public Integer getContadorY() {
        return contadorY;
    }

    public void setContadorY(Integer contadorY) {
        this.contadorY = contadorY;
    }

    public JButton[][] getMatrizBotones() {
        return MatrizBotones;
    }

    public void setMatrizBotones(JButton[][] MatrizBotones) {
        this.MatrizBotones = MatrizBotones;
    }
    
    
}
