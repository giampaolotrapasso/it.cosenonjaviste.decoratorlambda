package it.cosenonjaviste.decorator.old;

public class Espresso extends Bevanda {

    public Espresso() {
        nome = "Espresso";
    }

    @Override
    public double getPrezzo() {
        return 1.00;
    }

}
