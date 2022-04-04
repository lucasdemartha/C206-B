package br.inatel.cdg;

public class Inimigo {

    protected String nome;
    protected double vida;
    protected String tipoArma;

    public Inimigo(String nome, double vida, String tipoArma) {
        this.nome = nome;
        this.vida = vida;
        this.tipoArma = tipoArma;
    }

    public void atacando(){
        System.out.println("Atacandooo");
    }

    public void tomarDano(){
        System.out.println("Tomando dano");
        vida--;
    }

    public void mostraInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Vida: "+ vida);
        System.out.println("Arma: "+ tipoArma);
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public String getTipoArma() {
        return tipoArma;
    }
}
