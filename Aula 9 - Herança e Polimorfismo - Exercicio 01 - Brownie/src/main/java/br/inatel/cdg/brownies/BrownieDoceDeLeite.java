package br.inatel.cdg.brownies;

public class BrownieDoceDeLeite extends Brownie {
    public BrownieDoceDeLeite(String nome, String sabor, double preco) {
        super(nome, sabor, preco);
    }

    public void adicionaDoceDeLeite(){

        System.out.println(super.nome + " adicionando Doce de Leite");

    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de doce de leite adicionado");
    }

}
