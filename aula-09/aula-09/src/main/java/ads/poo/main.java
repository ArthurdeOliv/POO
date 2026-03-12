package ads.poo;
public class main {
    static void main() {
        Contador contador = new Contador();

        contador.setValorAtual(0);

        contador.incrementador();
        System.out.println(contador.ValorAtual());
        contador.incrementador();
        System.out.println(contador.ValorAtual());

    }
}