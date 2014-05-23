package it.cosenonjaviste.decorator.functional2;

import java.util.function.Function;

public class F2Bar {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        F2Bevanda espresso = new F2Espresso();

        System.out.printf("%s: prezzo %.2f\n", "Espresso", espresso.getPrezzo());

        Function<InfoAggiunta, InfoAggiunta> macchiato = x -> new InfoAggiunta(x.getNome() + ", macchiato", x.getPrezzo() + 0.05);

        Function<InfoAggiunta, InfoAggiunta> corretto = x -> new InfoAggiunta(x.getNome() + ", corretto", x.getPrezzo() + 0.60);

        espresso.setAggiunte(macchiato, corretto);

        System.out.printf("%s: prezzo %.2f\n", espresso.getDescrizione(), espresso.getPrezzo());

    }
}
