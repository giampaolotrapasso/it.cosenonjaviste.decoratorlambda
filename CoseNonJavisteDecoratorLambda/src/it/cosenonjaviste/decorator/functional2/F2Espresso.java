package it.cosenonjaviste.decorator.functional2;

public class F2Espresso extends F2Bevanda {

    private final InfoAggiunta info = new InfoAggiunta("Espresso", 1.0);

    @Override
    public InfoAggiunta getInfoIniziali() {
        return info;
    }

}
