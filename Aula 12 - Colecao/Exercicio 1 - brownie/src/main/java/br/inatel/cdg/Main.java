package br.inatel.cdg;

import br.inatel.cdg.brownies.Brownie;
import br.inatel.cdg.brownies.BrownieCafe;
import br.inatel.cdg.brownies.BrownieDoceDeLeite;
import br.inatel.cdg.brownies.BrownieNutella;
import br.inatel.cdg.comprador.Comprador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BrownieCafe cafe = new BrownieCafe("Brownie de café","Café", 5);
        BrownieDoceDeLeite doce = new BrownieDoceDeLeite("Brownie de Doce de Leite", "Doce de Leite", 100);
        BrownieNutella nutella = new BrownieNutella("Brownie de Nutella", "Nutella", 20);

        BrownieCafe cafe2 = new BrownieCafe("Brownie café","Café", 50);
        BrownieDoceDeLeite doce2 = new BrownieDoceDeLeite("Brownie Doce de Leite", "Doce de Leite", 120);
        BrownieNutella nutella2 = new BrownieNutella("Brownie Nutella", "Nutella", 70);

        List<Brownie> listaBrownie = new ArrayList<Brownie>();

        listaBrownie.add(cafe);
        listaBrownie.add(doce);
        listaBrownie.add(nutella);
        listaBrownie.add(cafe2);
        listaBrownie.add(doce2);
        listaBrownie.add(nutella2);
        System.out.println("-------INICIAL--------");
        for (Brownie brownie : listaBrownie) {
            System.out.println(brownie.getNome() + " : " + brownie.getPreco());
        }


        Collections.sort(listaBrownie);
        //crescente
        System.out.println("-------CRESCENTE--------");
        for (Brownie brownie : listaBrownie) {
            System.out.println(brownie.getNome() + " : " + brownie.getPreco());
        }
        //decrescente
        Collections.reverse(listaBrownie);
        System.out.println("-------DECRESCENTE--------");
        for (Brownie brownie : listaBrownie) {
            System.out.println(brownie.getNome() + " : " + brownie.getPreco());
        }

    }
}
