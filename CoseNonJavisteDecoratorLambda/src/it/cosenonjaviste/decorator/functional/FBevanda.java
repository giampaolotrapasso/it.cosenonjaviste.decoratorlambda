package it.cosenonjaviste.decorator.functional;

import java.util.function.Function;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public abstract class FBevanda {

    private Function<Double, Double> aggiunta;

    public FBevanda() {
        aggiunta = Function.identity();
    }

    public void aggiungi(final Function<Double, Double>... aggiunte) {
        this.aggiunta = Stream.of(aggiunte).reduce((aggiunta, altraAggiunta) -> aggiunta.compose(altraAggiunta)).orElse(i -> i);
    }

    /*
     * public void aggiungi(final Function<Double, Double> aggiunta) {
     * this.aggiunta = aggiunta; }
     */

    public abstract double getPrezzoIniziale();

    public double getPrezzo() {
        return aggiunta.apply(getPrezzoIniziale());
    }

}
