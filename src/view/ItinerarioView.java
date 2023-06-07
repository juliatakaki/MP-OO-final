package view;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;

public class ItinerarioView implements ActionListener{

    private static JFrame f;
    private static JLabel origemLabel;
    private static JLabel destinoLabel;
    private static JList<String> origem;
    private static JList<String> destino;
    private static JButton continuar;
    private static JScrollPane so, sd;

    public static void mainA(String[] args) {
        // Crie um vetor com as possibilidades de classes
        String Cidades[] = {"Aracaju - SE", "Belém - PA", "Belo Horizonte - MG", "Boa Vista - RR", "Brasília - DF", "Campo Grande - MS", "Cuiabá - MT", "Curitiba - PR", "Florianópolis - SC", "Fortaleza - CE", "Goiânia - GO", "João Pessoa - PB", "Macapá - AP", "Maceió - AL", "Manaus - AM", "Natal - RN", "Palmas - TO", "Porto Alegre - RS", "Porto Velho - RO", "Recife - PE", "Rio Branco - AC", "Rio de Janeiro - RJ", "Salvador - BA", "São Luís - MA", "São Paulo - SP", "Teresina - PI", "Vitória - ES"};

        // Mostrar as possibilidades e a tela
        f = new JFrame("Escolha de Origem e Destino");
        origemLabel = new JLabel("Origem: ");
        destinoLabel = new JLabel("Destino: ");
        origem = new JList<String>(Cidades);
        destino = new JList<String>(Cidades);
        continuar = new JButton("Continuar");
        so = new JScrollPane(origem);
        sd = new JScrollPane(destino);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Posicionar na tela
        f.setSize(800, 600);
        origemLabel.setBounds(30, 30, 100, 30);
        destinoLabel.setBounds(30, 200, 100, 30);
        origem.setBounds(120, 30, 150, 100);
        destino.setBounds(120, 200, 150, 100);
        continuar.setBounds(340, 500, 120, 20);
        
        so.setPreferredSize(new Dimension(120,140));
        sd.setPreferredSize(new Dimension(120,140));


        //Adicionar ao Frame
        f.setLayout(null);
        f.add(origem);
        f.add(destino);
        f.add(origemLabel);
        f.add(destinoLabel);
        f.add(continuar);
        f.add(so);
        f.add(sd);
        origem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        destino.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        f.setVisible(true);
    }
    //Clicar no botão Continuar
    public static void mainB(String args[]){
        ItinerarioView c = new ItinerarioView();
        continuar.addActionListener(c);
        // redirecionar para a tela "tela final"
    }
    public void actionPerformed(ActionEvent e){
        
    }
}
