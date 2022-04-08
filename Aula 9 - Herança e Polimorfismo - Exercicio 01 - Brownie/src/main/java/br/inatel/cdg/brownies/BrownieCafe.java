package br.inatel.cdg.brownies;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, String sabor, double preco) {
        super(nome, sabor, preco);
    }

    public void adicionaCafe(){

        System.out.println(super.nome + " adicionando cafe");

    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de café adicionado");
    }
}
