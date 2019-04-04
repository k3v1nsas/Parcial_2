/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class PanelEntradaSalida extends JPanel{
    
    private JTextField entrada;
    private JPanel pnlEntrada;
    private String contenido;
    private PanelBotones pnlBotones;
    
    public PanelEntradaSalida(){
        pnlEntrada = new JPanel();
        entrada = new JTextField("");
        entrada.setPreferredSize(new Dimension(200, 20));
        pnlEntrada.add(entrada);
        
        super.add(pnlEntrada);
    }

    public JTextField getEntrada() {
        return entrada;
    }

    public void setEntrada(JTextField entrada) {
        this.entrada = entrada;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}
