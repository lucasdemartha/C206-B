package br.inatel.cdg.classes;

import br.inatel.cdg.exception.NomeException;
import br.inatel.cdg.exception.NotaException;
import java.util.HashSet;
import java.util.Set;


public class Fetin {

    String edicao;
    private Set<Projeto> projetos = new HashSet<>();

    public Fetin(String edicao) {
        this.edicao = edicao;
    }

    public void addCliente(Projeto projeto) {
        projetos.add(projeto);
    }

    public void confereNota() throws NotaException {

        for (Projeto projeto : projetos) {
            System.out.println("Nome do projeto: " + projeto.getNome());
            System.out.println("Nota: " + projeto.getNota());
            if (projeto.getNota() <= 6) {
                throw new NotaException("Nota insuficiente");
            }
        }
    }


    public void confereInfo() {
        for (Projeto projeto : projetos) {
            try {
                if (projeto == null) {
                    throw new NomeException();
                } else {
                    System.out.println("Nome do projeto: " + projeto.getNome());
                    System.out.println("Nota: " + projeto.getNota());
                }
            } catch (NomeException e) {
                System.out.println("Não foi inserido nenhuma informação");
            }
        }
    }

}
