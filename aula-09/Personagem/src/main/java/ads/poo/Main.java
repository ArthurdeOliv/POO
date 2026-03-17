package ads.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha sua Raça: ");
        System.out.println("1. Humano");
        System.out.println("2. Elfo");
        System.out.println("3. Orc");

        int escolha = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do seu personagem: ");
        String nome = sc.nextLine();

        Personagem p = new Personagem(nome, escolha);

        System.out.println("Personagem criado!");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + p.getRaca());
        System.out.println("HP: " + p.getHP());
        System.out.println("Força: " + p.getForca());
        System.out.println("Velocidade: " + p.getVelocidade());

        sc.close();
    }
}
