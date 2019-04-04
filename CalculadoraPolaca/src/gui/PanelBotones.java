/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Sergio
 */
public class PanelBotones extends JPanel{
    
    private JButton botonA,botonB,botonC,botonD,botonE,botonF,botonG,botonH,botonI,botonJ;
    private JButton botonsuma,botonresta,botondivision,botonmultplicacion,botonreiniciar,botonborrar,botonigual;
    private JPanel pnluno,pnldos,pnltres,pnlcuatro,pnlcinco;
    private botonesListener listener;
    private String s;
    public PanelBotones() {
        pnluno = new JPanel();
        pnldos = new JPanel();
        pnltres = new JPanel();
        pnlcuatro = new JPanel();
        pnlcinco = new JPanel();
        
        botonA = new JButton(" A ");
        pnluno.add(botonA);
        botonB = new JButton(" B ");
        pnluno.add(botonB);
        botonC = new JButton(" C ");
        pnluno.add(botonC);
        botonresta = new JButton(" --");
        pnluno.add(botonresta);
        botonD = new JButton(" D ");
        pnldos.add(botonD);
        botonE = new JButton(" E ");
        pnldos.add(botonE);
        botonF = new JButton(" F ");
        pnldos.add(botonF);
        botonsuma = new JButton(" + ");
        pnldos.add(botonsuma);
        botonG = new JButton(" G ");
        pnltres.add(botonG);
        botonH = new JButton(" H ");
        pnltres.add(botonH);
        botonI = new JButton(" I ");
        pnltres.add(botonI);
        botonmultplicacion = new JButton(" * ");
        pnltres.add(botonmultplicacion);
        botonborrar = new JButton(" <");
        pnlcuatro.add(botonborrar);
        botonJ = new JButton(" J ");
        pnlcuatro.add(botonJ);
        botonreiniciar = new JButton(" CE");
        pnlcuatro.add(botonreiniciar);
        botondivision = new JButton(" / ");
        pnlcuatro.add(botondivision);
        botonigual = new JButton("=");
        botonigual.setPreferredSize(new Dimension(120, 30));
        pnlcinco.add(botonigual);
        
        botonA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    listener.btnAonClick();
 
            }
        });
        botonB.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnBonClick();
            }
        });
        botonC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnConClick();
            }
        });
        botonD.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnDonClick();
            }
        });botonE.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnEonClick();
            }
        });botonF.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnFonClick();
            }
        });
        botonG.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnGonClick();
            }
        });
        botonH.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnHonClick();
            }
        });
        botonI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnIonClick();
            }
        });
        botonJ.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnJonClick();
            }
        });
        botonsuma.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnSumaronClick();
            }
        });
        botonresta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnRestaronClick();
            }
        });
        botonmultplicacion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnMultiplicaronClick();
            }
        });
        botondivision.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnDividironClick();
            }
        });
        botonreiniciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnReiniciaronClick();
            }
        });
        botonborrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnBorraronClick();
            }
        });
        botonigual.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.btnIgualonClick();
            }
        });

        super.add(pnluno);
        super.add(pnldos);
        super.add(pnltres);
        super.add(pnlcuatro);
        super.add(pnlcinco);
        
    }
     public void setListener(botonesListener listener){
        this.listener = listener;
    }
}
