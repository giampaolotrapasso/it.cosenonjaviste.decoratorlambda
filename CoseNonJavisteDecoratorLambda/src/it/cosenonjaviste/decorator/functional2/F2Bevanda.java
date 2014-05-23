package it.cosenonjaviste.decorator.functional2;

import java.util.function.Function;
import java.util.stream.Stream;

public abstract class F2Bevanda {

    private Function<InfoAggiunta, InfoAggiunta> aggiunta = Function.identity();

    public void setAggiunte(final Function<InfoAggiunta, InfoAggiunta>... aggiunte) {
        this.aggiunta = Stream.of(aggiunte).reduce((aggiunta, altraAggiunta) -> aggiunta.compose(altraAggiunta)).orElse(Function.identity());
    }

    public abstract InfoAggiunta getInfoIniziali();

    public double getPrezzo() {
        return aggiunta.apply(getInfoIniziali()).getPrezzo();
    }

    public String getDescrizione() {
        return aggiunta.apply(getInfoIniziali()).getNome();
    }

}
