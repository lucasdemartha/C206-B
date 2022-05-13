package br.inatel.cdg;

import java.util.*;

public class Conta {

    protected double saldo;
    protected double limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void mostraInfo(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        for(Cliente cliente: clientes){

            try{
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
            }catch(NullPointerException e){
                System.out.println("Não existe cliente nessa posição");
            }
        }

    }



}
