package br.inatel.cdg.brownies;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, String sabor, double preco) {
        super(nome, sabor, preco);
    }

    public void adicionaNutella(){

        System.out.println(super.nome + " adiciona nutella");

    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de nutella adicionado");
    }
}
