package it.cosenonjaviste.decorator.old;

public class CaffeOrzo extends Bevanda {

    public CaffeOrzo() {
        nome = "Caffè d'orzo";
    }

    @Override
    public double getPrezzo() {
        return 1.50;
    }

}