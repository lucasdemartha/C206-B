public class Kart {

    String nome;
    Motor motor;
    Piloto piloto;

    void pular(){
        System.out.println("Carro " + nome + " esta pulando!");
    }

    void soltarTurbo(){
        System.out.println("Carro " + nome + " esta soltando turbo!");
    }

    void fazerDrift(){
        System.out.println("Carro " + nome + " esta fazendo drift!");
    }

    Kart(String nome){
        motor = new Motor();
        this.nome = nome;
    }

}
