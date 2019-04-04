/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class FrameCalculadora extends JFrame{
    
    private PanelEntradaSalida pnlES;
    private PanelBotones pnlBotones;
    private Stack<String> pila;
    public FrameCalculadora(){
        super("Calculadora");
        super.setSize(250, 300);
        super.setLayout(new BorderLayout());
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        pila = new Stack<>();
        
        pnlES = new PanelEntradaSalida();
        super.add(pnlES,BorderLayout.NORTH);
        
        pnlBotones = new PanelBotones();
        pnlBotones.setListener(new botonesListener() {
            
            @Override
            public void btnAonClick() {
               pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"A");
               pila.push("A");
            }

            @Override
            public void btnBonClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"B");
                pila.push("B");
            }

            @Override
            public void btnConClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"C");
                pila.push("C");
            }

            @Override
            public void btnDonClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"D");
                pila.push("D");
            }

            @Override
            public void btnEonClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"E");
                pila.push("E");
            }

            @Override
            public void btnFonClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"F");
                pila.push("F");
            }

            @Override
            public void btnGonClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"G");
                pila.push("G");
            }

            @Override
            public void btnHonClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"H");
                pila.push("H");
            }

            @Override
            public void btnIonClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"I");
                pila.push("I");
            }

            @Override
            public void btnJonClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"J");
                pila.push("J");
            }

            @Override
            public void btnMultiplicaronClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"*");
                pila.push("*");
            }

            @Override
            public void btnDividironClick() {
               pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"/");
               pila.push("/");
            }

            @Override
            public void btnSumaronClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"+");
                pila.push("+");
            }

            @Override
            public void btnRestaronClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText()+"-");
                pila.push("-");
            }

            @Override
            public void btnIgualonClick() {
               while (!pila.empty()){
                     System.out.println(pila.pop());
               }
            }

            @Override
            public void btnReiniciaronClick() {
                pnlES.getEntrada().setText("");
                pila = new Stack<>();
            }

            @Override
            public void btnBorraronClick() {
                pnlES.getEntrada().setText(pnlES.getEntrada().getText().substring(0, pnlES.getEntrada().getText().length()-1));
            }
        });
        super.add(pnlBotones,BorderLayout.CENTER);
        super.setVisible(true);
    }
}
