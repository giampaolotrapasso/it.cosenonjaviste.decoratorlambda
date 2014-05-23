package it.cosenonjaviste.decorator.old;

public class Bar {

    public static void main(String[] args) {

        Bevanda espresso = new Espresso();

        System.out.printf("%s: prezzo %.2f\n", espresso.getNome(), espresso.getPrezzo());

        Bevanda macchiato = new Macchiato(espresso);
        System.out.printf("%s: prezzo: %s\n", macchiato.getNome(), macchiato.getPrezzo());

        // Bevanda corretto = new Corretto(espresso);
        // System.out.println(corretto.getNome() + ": prezzo: " +
        // corretto.getPrezzo());

        Bevanda correttoMacchiato = new Corretto(new Macchiato(new Espresso()));

        System.out.printf("%s : prezzo $.2f\n", correttoMacchiato.getNome(), correttoMacchiato.getPrezzo());

    }

}
