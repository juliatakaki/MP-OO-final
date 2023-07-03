package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.Passagem;
import model.PassagemAviao;
import model.PassagemOnibus;

/**
 * A classe TelaFinalView representa a tela de confirmacao de cadastro de uma passagem.
 * Nessa tela, sao exibidos os dados da passagem cadastrada, e o usuario tem a opção
 * de confirmar ou cancelar o cadastro.
 */
public class TelaFinalView implements ActionListener {
    private JFrame frame;
    private JLabel mensagemFinal, verifica, nome, telefone, laClasse, laItinerario, laTipoPassagem;
    private JButton confirmarCadastro, cancelarCadastro;

    /**
     * Construtor da classe TelaFinalView.
     * Cria a janela de confirmação de cadastro e exibe os dados da passagem.
     * @param dadosNovaPassagem Objeto da classe Passagem que representa a passagem cadastrada.
     */
    public TelaFinalView(Passagem dadosNovaPassagem) {
        // Configuracao da tela
        frame = new JFrame("Confirmar Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Definicao do gerenciador de layout como FlowLayout
        frame.setLayout(new FlowLayout());

        // Criacao dos componentes
        mensagemFinal = new JLabel("Viagem cadastrada com sucesso!");
        verifica = new JLabel("Verifique abaixo os dados cadastrados:");
        nome = new JLabel("Nome: " + dadosNovaPassagem.getNomePassageiro());
        telefone = new JLabel("Telefone: " + dadosNovaPassagem.getTelefone());
        
        // Verifica o tipo de passagem (Aviao ou Onibus) e exibe informacoes especificas
        if (dadosNovaPassagem instanceof PassagemAviao) {
            laClasse = new JLabel("Classe: " + ((PassagemAviao) dadosNovaPassagem).getClasse().toString());
            laTipoPassagem = new JLabel("Tipo de Passagem: Avião");
        } else if (dadosNovaPassagem instanceof PassagemOnibus) {
            laClasse = new JLabel("Tipo de Assento: " + ((PassagemOnibus) dadosNovaPassagem).getTipoPoltrona().toString());
            laTipoPassagem = new JLabel("Tipo de Passagem: Ônibus");
        }
        laItinerario = new JLabel("Itinerário: " + dadosNovaPassagem.getItinerario().toString());

        // Criacao dos botoes de confirmacao e cancelamento
        confirmarCadastro = new JButton("Confirmar");
        cancelarCadastro = new JButton("Cancelar");

        // Adicao dos componentes ao frame
        frame.setLayout(null);
        frame.add(mensagemFinal);
        frame.add(verifica);
        frame.add(nome);
        frame.add(telefone);
        frame.add(laClasse);
        frame.add(laTipoPassagem);
        frame.add(laItinerario);
        frame.add(confirmarCadastro);
        frame.add(cancelarCadastro);

        // Configuracao dos botoes para escutarem o evento de clique
        confirmarCadastro.addActionListener(this);
        cancelarCadastro.addActionListener(this);

        // Exibicao da janela
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Metodo actionPerformed da interface ActionListener.
     * Executado quando um dos botoes e clicado.
     * Exibe uma mensagem de confirmacao ou cancelamento do cadastro.
     * Fecha a janela apos a acao ser executada.
     * @param e Evento gerado pelo botao clicado.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmarCadastro) {
            JOptionPane.showMessageDialog(null, "Passagem cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == cancelarCadastro) {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado!", "Cancelamento", JOptionPane.WARNING_MESSAGE);
        }
        frame.dispose(); // Fecha a janela apos a acao ser executada.
    }

}
