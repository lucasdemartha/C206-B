package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome, tipoTiro;
    private double vida;


    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if (tipoTiro.equals("Explosivo")){
            ast.destruir(); //Tiro explosivo destroi qualquer asteroide
        }else{
            if (ast.getTipoAsteroide().equals("Grande")){
                System.out.println("Não é possível destruir um asteroide grande com tiro Normal");
            }
            else {
                ast.destruir(); //o asteroide é pequeno
            }
        }
    }

}
