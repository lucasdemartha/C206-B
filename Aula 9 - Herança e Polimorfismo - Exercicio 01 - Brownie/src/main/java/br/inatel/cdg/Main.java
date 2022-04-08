package br.inatel.cdg;

import br.inatel.cdg.brownies.BrownieCafe;
import br.inatel.cdg.brownies.BrownieDoceDeLeite;
import br.inatel.cdg.brownies.BrownieNutella;
import br.inatel.cdg.comprador.Comprador;

public class Main {
    public static void main(String[] args) {

        BrownieCafe cafe = new BrownieCafe("Brownie de café","Café", 5);
        BrownieDoceDeLeite doce = new BrownieDoceDeLeite("Brownie de Doce de Leite", "Doce de Leite", 100);
        BrownieNutella nutella = new BrownieNutella("Brownie de Nutella", "Nutella", 20);

        cafe.adicionaCafe();
        doce.adicionaDoceDeLeite();
        nutella.adicionaNutella();
        System.out.println("------------------");
        cafe.mostraInfo();
        doce.mostraInfo();
        nutella.mostraInfo();
        System.out.println("------------------");
        cafe.addCarrinhoDeCompras();
        cafe.calculaValorTotalCompra();
        doce.addCarrinhoDeCompras();
        doce.calculaValorTotalCompra();
        nutella.addCarrinhoDeCompras();
        nutella.calculaValorTotalCompra();
        System.out.println("------------------");

        Comprador comprador = new Comprador("Comprador",100);


        System.out.println("Saldo do comprador: " + comprador.getSaldo());
        comprador.efetuarCompra(cafe);
        comprador.efetuarCompra(nutella);
        comprador.efetuarCompra(doce);
        System.out.println("Novo saldo: " + comprador.getSaldo());

    }
}
