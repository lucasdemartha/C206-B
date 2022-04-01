public class Banda {

    private String nome;
    private String genero;
    private Empresario empresario;
    private Musica[] musicas;
    private Membro[] membros;

    public Banda(String nome, String genero) { //construtor
        this.nome = nome;
        this.genero = genero;
        musicas = new Musica[5]; //Definindo o tamanho dentro do construtor //Sempre q criar uma banda, criara musica
        membros = new Membro[5]; //Sempre que criar uma banda, criara membro
    }

    public void mostraInfo(){
        System.out.println("A Banda: " + this.nome + " possui os seguintes membros:");
        for (Membro membro : membros) {
            if(membro != null)//Verifica se existe membro antes de imprimir
                System.out.println(membro.getNome());
        }
        System.out.println("A Banda: " + this.nome + " possui as seguintes musicas:");
        for (Musica musica : musicas) {
            if(musica != null)//Verifica se existe musica antes de imprimir
                System.out.println(musica.getNome());
        }
    }

    public void addMusicaNova(Musica musica){
        for(int i = 0; i < musicas.length; i++){//Varrendo o vetor de musicas
            if(musicas[i] == null){//Verifica se não existe musica
                musicas[i] = musica; //add musica na posição vazia
                break; //Adiciona e sai do metodo
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }

    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario; //podera ou nao ter empresario, por isso foi feito fora do construtor
    }

}
