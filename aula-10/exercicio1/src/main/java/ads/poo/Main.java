package ads.poo;
public class Main {
    static void main(String[] args) {

        Carro c = new Carro("Ferrari", 280);
        Carro d = new Carro("Mercedes", 299);
        Pessoa p = new Pessoa("Hamilton", "123.456.789-10", "7xCampeaoMundial@gmail.com");

        IO.println(p.toString());
    }
}
