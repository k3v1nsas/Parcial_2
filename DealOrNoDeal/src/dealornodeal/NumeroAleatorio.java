/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealornodeal;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.stream.IntStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class NumeroAleatorio extends JFrame{
    

private JTextField edtValor;
private WorkPanel panelcentro;
    public NumeroAleatorio(){
        super("DEAR or NO DEAL");
        super.setSize(1200,760 );
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        panelcentro = new WorkPanel();
        super.add(panelcentro,BorderLayout.CENTER);
        JPanel panelabajo = new JPanel();
        JLabel lbl = new JLabel("Valor");
        edtValor = new JTextField(10);
        panelabajo.add(lbl);
        panelabajo.add(edtValor,BorderLayout.SOUTH);
        
        super.add(panelabajo,BorderLayout.SOUTH);
        super.setVisible(true);
    }

    public JTextField getEdtValor() {
        return edtValor;
    }

    public void setEdtValor(JTextField edtValor) {
        this.edtValor = edtValor;
    }
    
}

