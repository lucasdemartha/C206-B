package br.inatel.cdg.animais;

public abstract class Mamifero {

    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSom();

    public void mostraInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }
}

