package br.inatel.cdg;

import br.inatel.cdg.animais.Boi;
import br.inatel.cdg.animais.Cachorro;
import br.inatel.cdg.animais.Lontra;
import br.inatel.cdg.animais.Mamifero;

public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro("Amora", 10000);
        Mamifero boi = new Boi("Nickao", 100);
        Lontra lontra = new Lontra("Luna", 10000);

        cachorro.emitirSom();
        boi.emitirSom();
        lontra.emitirSom();
        lontra.nadar();

        cachorro.mostraInfo();
        boi.mostraInfo();
        lontra.mostraInfo();
    }
}
