package br.inatel.cdg;

import br.inatel.cdg.classes.Fetin;
import br.inatel.cdg.classes.Projeto;
import br.inatel.cdg.exception.NotaException;

public class Main {
    public static void main(String[] args) throws NotaException {
        Projeto p1 = new Projeto("Projeto 1",4);
        Projeto p2 = new Projeto("Projeto 2",8);
        Projeto p3 = null;

        Fetin fetin = new Fetin("50");

        fetin.addCliente(p1);
        fetin.addCliente(p2);
        fetin.addCliente(p3);

        fetin.confereInfo();
        fetin.confereNota();
    }
}
