package it.cosenonjaviste.decorator.functional;

import java.util.function.Function;

public class FBar {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Function<Double, Double> macchiato = x -> x + .05;

        System.out.printf("La funzione macchiato in azione %.2f\n", macchiato.apply(1.0));

        FBevanda espresso = new FEspresso();

        System.out.printf("%s: prezzo %.2f\n", "Espresso", espresso.getPrezzo());

        Function<Double, Double> corretto = x -> x + .60;

        espresso.aggiungi(macchiato);

        System.out.printf("%s: prezzo %.2f\n", "Macchiato", espresso.getPrezzo());

        espresso.aggiungi(corretto);
        System.out.printf("%s: prezzo %.2f", "Corretto", espresso.getPrezzo());

        Function<Double, Double> macchiatoCorretto = macchiato.compose(corretto);

        espresso.aggiungi(macchiato, macchiato, corretto);

        System.out.printf("%s: prezzo %.2f", "Macchiatone corretto", espresso.getPrezzo());

    }

}
