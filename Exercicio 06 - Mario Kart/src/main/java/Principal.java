public class Principal {
    public static void main(String[] args) {

        //criando kart / motor criado junto dentro da classe Kart
        Kart kart1 = new Kart("Kart1");
        Kart kart2 = new Kart("Kart2");

        //adicionando valores para o motor
        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 95.20f;
        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 76.10f;

        //criando pilotos
        Piloto piloto1 = new Piloto("Piloto1");
        Piloto piloto2 = new Piloto("Piloto2");

        //associando os pilotos aos karts
        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        //executando ações do piloto
        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        //executando ações do kart
        kart1.fazerDrift();
        kart1.motor.mostraInfo();
        kart2.soltarTurbo();
        kart2.motor.mostraInfo();

    }

}
