public class Main {
    public static void main(String[] args) {

        Empresario empresario = new Empresario("Roberto",1000021023);

        Musica musica1 = new Musica("Ela e ela", 3.4f);

        Musica musica2 = new Musica("Alô ambev", 4.2f);

        Musica musica3 = new Musica("Vamo tomar uma", 3.2f);

        Membro membro1 = new Membro("Zé Neto", "Primeira Voz");

        Membro membro2 = new Membro("Cristiano","Segunda Voz");

        Banda banda = new Banda("Zé Neto e Cristiano","Sertanejo");

        banda.setEmpresario(empresario);
        //Adicionando Musicas
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        banda.addMusicaNova(musica3);
        //Adicionando Membros
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);

        banda.mostraInfo();


    }
}
