package it.cosenonjaviste.decorator.old;

public class CaffeOrzo extends Bevanda {

    public CaffeOrzo() {
        nome = "Caff� d'orzo";
    }

    @Override
    public double getPrezzo() {
        return 1.50;
    }

}