package br.inatel.cdg;

public class CavaleiroDePrata extends Inimigo{
    public CavaleiroDePrata(String nome, double vida, String tipoArma) {
        super(nome, vida, tipoArma);
    }
    public void ataqueForte(){
        System.out.println("Atacando forte");
    }

}
