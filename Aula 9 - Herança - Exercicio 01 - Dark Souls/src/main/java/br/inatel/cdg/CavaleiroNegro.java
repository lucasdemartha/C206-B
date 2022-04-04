package br.inatel.cdg;

public class CavaleiroNegro extends Inimigo{
    public CavaleiroNegro(String nome, double vida, String tipoArma) {
        super(nome, vida, tipoArma);
    }

    public void ataqueRapido(){
        System.out.println("Atacando Rapido");
    }
}
