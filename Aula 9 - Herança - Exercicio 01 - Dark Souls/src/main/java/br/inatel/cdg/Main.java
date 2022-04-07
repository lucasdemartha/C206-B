package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {

        ZumbiLerdo z1 = new ZumbiLerdo("Zumbi", 5, "Faca");

        CavaleiroDePrata cp1 = new CavaleiroDePrata("Prateado",5,"Machado");

        CavaleiroNegro cn1 = new CavaleiroNegro("Negro", 5,"Espada");


        z1.atacando();
        System.out.println(z1.getVida());
        z1.tomarDano();
        z1.mostraInfo();

        cp1.atacando();
        cp1.ataqueForte();
        System.out.println(cp1.getVida());
        cp1.tomarDano();
        cp1.mostraInfo();

        cn1.atacando();
        cn1.ataqueRapido();
        System.out.println(cn1.getVida());
        cn1.tomarDano();
        cn1.mostraInfo();
    }
}
