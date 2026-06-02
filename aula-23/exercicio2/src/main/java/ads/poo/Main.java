package ads.poo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int a,b;


        try{
            System.out.print("Entre com o numero: ");
            a = ler.nextInt();
            System.out.print("Entre com o numero: ");
            b = ler.nextInt();

            int res = a / b;

            System.out.println(a + " dividido por " + b + " = " +res);
        }catch (InputMismatchException e){
            System.out.println("Só é permitido numeros inteiros");
            ler.nextLine();
        }catch (ArithmeticException e) {
            System.out.println("Apenas numeros divisiveis");
            ler.nextLine();
        }catch (Exception e){
            System.out.println(e.getMessage());
            ler.nextLine();
        }
        System.out.println("Fim do programa");

    }
}