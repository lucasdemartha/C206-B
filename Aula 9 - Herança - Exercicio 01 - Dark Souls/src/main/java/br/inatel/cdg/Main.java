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

    }
}
