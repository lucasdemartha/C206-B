package br.inatel.cdg;

import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.conversor.Conversor;
import br.inatel.cdg.jogador.Jogador;

public class Main {
    public static void main(String[] args) {

        Bloco bloco1 = new Bloco(); //numBlocos = 0 -> numBlocos = 1
        Bloco bloco2 = new Bloco(); //numBlocos = 1 -> numBlocos = 2
        Bloco bloco3 = new Bloco(); //numBlocos = 2 -> numBlocos = 3
        Bloco bloco4 = new Bloco(); //numBlocos = 3 -> numBlocos = 4

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        Jogador jogador = new Jogador();
        jogador.destruirBloco(bloco1);

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador: " + jogador.getPonto());

        jogador.destruirBloco(bloco2);

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador: " + jogador.getPonto());

        jogador.destruirBloco(bloco3);
        jogador.destruirBloco(bloco4);

        //Chama o método estático - sem a necessidade de uma instancia.
        Conversor.converter(jogador.getPonto());

    }
}
