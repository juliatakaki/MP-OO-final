package view;

import javax.swing.*;
import java.awt.event.*;

public class TelaInicialView implements ActionListener{
    private static JFrame f;
    private static JButton ba, bo;
    private static JLabel l;

    public static void main(String[] args){
        f = new JFrame("Seja bem vindo à Tripper");
        l = new JLabel("Escolha o tipo de transporte: ");
        ba = new JButton("Avião");
        bo = new JButton("Ônibus");

        //definindo os tamanhos
        f.setSize(800,600);
        l.setBounds(318, 20, 168, 30);
        ba.setBounds(315, 50, 80, 30);
        bo.setBounds(405, 50, 80, 30);
        f.setLayout(null);

        //adicionando ao frame
        f.add(ba);
        f.add(bo);
        f.add(l);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //Clicar no botão Avião
    public static void mainA (String args[]){
        TelaInicialView Aviao = new TelaInicialView();
        ba.addActionListener(Aviao);
        // redirecionar para a tela "aviao"
    }
    public void actionPerformed(ActionEvent e){
        
    }

    //Clicar no botão ônibus
    public static void mainB (String args[]){
        TelaInicialView Onibus = new TelaInicialView();
        bo.addActionListener(Onibus);
        // redirecionar para a tela "onibus"
    }
    /*public void actionPerformed(ActionEvent e){
        
    }*/
}