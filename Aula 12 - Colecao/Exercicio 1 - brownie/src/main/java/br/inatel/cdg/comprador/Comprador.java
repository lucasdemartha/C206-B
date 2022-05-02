package br.inatel.cdg.comprador;

import br.inatel.cdg.brownies.Brownie;

public class Comprador {

    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        brownie.addCarrinhoDeCompras();
        if(getSaldo() >= brownie.getPreco()){
            brownie.calculaValorTotalCompra();
            System.out.println(nome + " comprou o: " + brownie.getNome());
            saldo = saldo - brownie.getPreco();
        }
        else {
            System.out.println("Saldo insuficiente, não foi possível comprar o: " + brownie.getNome());
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
