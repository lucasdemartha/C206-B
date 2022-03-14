package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        //criando naves

        Nave nave1 = new Nave("Nave Branca", 500, "Explosivo");
        Nave nave2 = new Nave("Nave Preta", 500, "Normal");

        //criando asteroides

        Asteroide ast1 = new Asteroide("Asteroide Grande", "Grande");
        Asteroide ast2 = new Asteroide("Asteroide Pequeno", "Pequeno");

        //nave 1 atirando

        nave1.atirar(ast1);
        nave1.atirar(ast2);

        //nave 2 atirando

        nave2.atirar(ast1);
        nave2.atirar(ast2);


    }
}
