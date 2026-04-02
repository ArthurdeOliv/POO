package ads.poo;

import java.util.ArrayList;

public class App {

    private ArrayList<Conta> contas;

    public App(){
        this.contas= new ArrayList<>();
    }

    void cadastrar(){
        var titular = IO.readln("Nome do titular: ");
        var numero = IO.readln("Numero da conta: ");
        var saldo = IO.readln("Saldo inicial: ");

        Conta novaConta = new Conta(titular, numero, saldo);

        this.contas.add(novaConta);
    }

    void listar(){

    }



    void menu(int opcao){
        switch (opcao){
            case 1 -> {cadastrar();}
        }
    }

    static void main(String[] args) {
        App app = new App();
        app.menu(1);

        IO.println("..:: MENU::..");
        IO.println("1 - Cadastrar conta.");
        IO.println("2 - Listar todas as contas.");
        IO.println("3 - Depositar em uma conta.");
        IO.println("4 - Sacar de uma conta.");
        IO.println("5 - Sair.");
        var opcao = IO.readln("Entre com uma opção");
        app.menu(opcao);

    }
}
