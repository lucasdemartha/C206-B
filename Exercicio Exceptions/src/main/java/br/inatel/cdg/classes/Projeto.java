package br.inatel.cdg.classes;

public class Projeto {

    private String nome;
    private double nota;

    public Projeto(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Projeto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
