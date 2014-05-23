package it.cosenonjaviste.decorator.functional2;

public class InfoAggiunta {
    private final double prezzo;
    private final String nome;

    public InfoAggiunta(String nome, double prezzo) {
        this.prezzo = prezzo;
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getNome() {
        return nome;
    }

}
