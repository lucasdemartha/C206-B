package br.inatel.cdg.inimigo;

public class Asteroide {
    private String nome, tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void destruir(){
        System.out.println("Asteroide " + tipoAsteroide + " Sendo destruido!");
    }

}
