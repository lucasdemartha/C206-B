public class Principal {

    public static void main(String[] args) {

        Ashen ashen = new Ashen();
        Arma arma = new Arma();
        ashen.arma = arma;

        ashen.vida = 50;

        arma.nome = "Drake";
        arma.descricao = "Espada";
        arma.resistencia = 50;
        arma.poder = 100;

        System.out.println("Vida do ashen: " + ashen.vida);

        ashen.tomarDano();

        System.out.println("Vida do ashen apos tomar dano: " + ashen.vida);

        System.out.println("Info da arma de Ashen: ");
        ashen.arma.mostraInfoArma();

        ashen.usarArma();

        System.out.println("Info da arma de Ashen apos ser usada: ");
        ashen.arma.mostraInfoArma();


    }

}
