package ads.poo;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class App {

    private ArrayList<Conta> contas;

    public App(){
        this.contas= new ArrayList<>();
    }

    void cadastrar(){
        var titular = IO.readln("Nome do titular: ");
        var numero = IO.readln("Numero da conta: ");
        double saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        Conta novaConta = new Conta(titular, numero, saldo);

        this.contas.add(novaConta);
    }

    void listar(){
        for (Conta elemento : contas){
            IO.println(elemento.toString());
        }
    }


    void depositar() {

        IO.println("Digite o número da conta em que deseja depositar: ");
        String n_conta = IO.readln();
        for (Conta elemento : contas) {
            if (elemento.getNumero().equals(n_conta)){
                IO.println("Qual o valor você deseja depositar: ");
                double deposito = Double.parseDouble(IO.readln());
                elemento.depositar(deposito);
            } else {
                IO.println("Conta inexistente!!");
            }
        }
    }

    void sacar() {
        IO.println("Digite o número da conta em que deseja sacar: ");
        String n_conta = IO.readln();
        for (Conta elemento : contas) {
            if (elemento.getNumero().equals(n_conta)){
                IO.println("Qual o valor você deseja sacar: ");
                double saque = Double.parseDouble(IO.readln());
                elemento.sacar(saque);
            }else{
                IO.println("Conta inexistente!!");
            }
        }
    }

    void menu(int opcao){
        switch (opcao){
            case 1 -> {cadastrar();}
            case 2 -> {listar();}
            case 3 -> {depositar();}
            case 4 -> {sacar();}

        }
    }

    static void main(String[] args) {
        App app = new App();
        int opcao = 0;

        do {
            IO.println("..:: MENU::..");
            IO.println("1 - Cadastrar conta.");
            IO.println("2 - Listar todas as contas.");
            IO.println("3 - Depositar em uma conta.");
            IO.println("4 - Sacar de uma conta.");
            IO.println("5 - Sair.");
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
            app.menu(opcao);
        } while (opcao != 5);


    }
}
