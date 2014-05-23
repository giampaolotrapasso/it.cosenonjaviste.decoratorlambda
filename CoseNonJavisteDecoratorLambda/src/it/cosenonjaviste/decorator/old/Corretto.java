package it.cosenonjaviste.decorator.old;

public class Corretto extends Aggiunta {

    private Bevanda bevanda;

    public Corretto(Bevanda bevanda) {
        this.bevanda = bevanda;
    }

    @Override
    public String getNome() {
        return bevanda.getNome() + ", corretto";
    }

    @Override
    public double getPrezzo() {
        return bevanda.getPrezzo() + 0.60;
    }

}
