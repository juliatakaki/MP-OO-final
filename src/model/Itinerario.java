/**
 * Esta classe representa um itinerario contendo informacoes sobre a origem, destino e data de viagem.
 * Alem disso, possui uma lista de objetos do tipo Passagem associados a esse itinerario.
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class Itinerario {
    private String origem;
    private String destino;
    private String data;
    private List<Passagem> passagens = new ArrayList<>();

    /**
     * Construtor da classe Itinerario.
     * 
     * @param origem A cidade de origem do itinerario.
     * @param destino A cidade de destino do itinerario.
     * @param data A data da viagem do itinerario.
     */
    public Itinerario(String origem, String destino, String data) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Passagem> getPassagens() {
        return passagens;
    }

    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }

    /**
     * Retorna uma representacao em formato de string do objeto Itinerario.
     * 
     * @return A representacao em formato de string do objeto Itinerario.
     */
    @Override
    public String toString() {
        return "Itinerario: [destino=" + destino + ", origem=" + origem + ", data=" + data + "]";
    }
}
