package it.cosenonjaviste.decorator.old;

public class Macchiato extends Aggiunta {

    private Bevanda bevanda;

    public Macchiato(Bevanda bevanda) {
        this.bevanda = bevanda;
    }

    @Override
    public String getNome() {
        return bevanda.getNome() + ", macchiato";
    }

    @Override
    public double getPrezzo() {
        return bevanda.getPrezzo() + 0.05;
    }

}
