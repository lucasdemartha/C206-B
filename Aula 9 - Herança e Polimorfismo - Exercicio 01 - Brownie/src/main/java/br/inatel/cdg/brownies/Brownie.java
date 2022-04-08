package br.inatel.cdg.brownies;

public class Brownie {

    protected String nome,sabor;
    protected double preco;

    public Brownie(String nome, String sabor, double preco) {
        this.nome = nome;
        this.sabor = sabor;
        this.preco = preco;
    }

    public void addCarrinhoDeCompras() {

        System.out.println("Adicionando no carrinho de compras um: "+ nome);
    }

    public void calculaValorTotalCompra() {
        System.out.println("Calculando valor total da compra de um: " + nome + ": " + preco);
    }

    public void mostraInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Sabor do produto: " + sabor);
        System.out.println(" ");
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
