package br.inatel.cdg.animais;

import br.inatel.cdg.interfaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void nadar() {
        System.out.println("Lontra nadando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de lontra");
    }
}

