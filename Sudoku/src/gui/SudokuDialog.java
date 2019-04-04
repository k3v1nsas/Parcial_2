/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author redoaxaca
 */
public class SudokuDialog extends JDialog {
    
    private SudokuDialogListener listener;
    private JTextField edtNumero;
    private JButton boton;
    
    public SudokuDialog(JFrame owner){
        super(owner, true);
        super.setLayout(new BorderLayout());
        super.setSize(250, 200);
        JPanel pnlControles = new JPanel();

        edtNumero = new JTextField(10);
        
        pnlControles.add(new JLabel("Numero: "));
        pnlControles.add(edtNumero); 
        
        JPanel pnlBotoncitos = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                listener.aceptarButtonClick(edtNumero.getText());
                setVisible(false);
            }
        });
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        
        pnlBotoncitos.add(btnAceptar);
        pnlBotoncitos.add(btnCancelar);   
        
             

        super.add(pnlBotoncitos, BorderLayout.SOUTH);
        super.add(pnlControles);
    }

    public void setListener(SudokuDialogListener listener) {
        this.listener = listener;
    }
    
    public void mostrar(){
        setVisible(true);
    }
    

    
}
