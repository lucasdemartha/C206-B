package br.inatel.cdg.bloco;

public class Bloco {

    private static int numBlocos = 0;

    public Bloco(){
        numBlocos++;
    }

    public void destruir(){
        System.out.println("Bloco destruido");
        numBlocos--;
    }

    public static int getNumBlocos() {
        return numBlocos;
    }
}
