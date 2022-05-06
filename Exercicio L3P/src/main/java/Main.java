import brownies.Brownie;
import brownies.BrownieCafe;
import brownies.BrownieDoceDeLeite;
import brownies.BrownieNutella;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaInformada = new ArrayList<>();
        System.out.println("Entre com 6 nomes: ");
        listaInformada.add(sc.nextLine());
        listaInformada.add(sc.nextLine());
        listaInformada.add(sc.nextLine());
        listaInformada.add(sc.nextLine());
        listaInformada.add(sc.nextLine());
        listaInformada.add(sc.nextLine());


        BrownieCafe cafe1 = new BrownieCafe(listaInformada.get(0), new Random().nextDouble()*100);
        BrownieCafe cafe2 = new BrownieCafe(listaInformada.get(1), new Random().nextDouble()*100);
        BrownieDoceDeLeite doce1 = new BrownieDoceDeLeite(listaInformada.get(2), new Random().nextDouble()*100);
        BrownieDoceDeLeite doce2 = new BrownieDoceDeLeite(listaInformada.get(3), new Random().nextDouble()*100);
        BrownieNutella nutella1 = new BrownieNutella(listaInformada.get(4), new Random().nextDouble()*100);
        BrownieNutella nutella2 = new BrownieNutella(listaInformada.get(5), new Random().nextDouble()*100);

        ArrayList<Brownie> bw = new ArrayList<Brownie>();

        bw.add(cafe1);
        bw.add(cafe2);
        bw.add(doce1);
        bw.add(doce2);
        bw.add(nutella1);
        bw.add(nutella2);

        System.out.println("LISTA DE BROWNIES SEM ORDENAÇÃO DE PREÇO");
        System.out.println("-------------------------");
        for(Brownie brownie: bw)
        {
            brownie.mostraInfo();
            System.out.println("-------------------------");
        }
        Collections.sort(bw);
        Collections.reverse(bw);
        System.out.println("LISTA DE BROWNIES COM ORDENAÇÃO DE PREÇO");
        System.out.println("-------------------------");
        for(Brownie brownie: bw)
        {
            brownie.mostraInfo();
            System.out.println("-------------------------");
        }

    }
}
