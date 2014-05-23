package it.cosenonjaviste.decorator.old;

public abstract class Bevanda {

    String nome = "<>";

    public String getNome() {
        return nome;
    }

    public abstract double getPrezzo();

}
