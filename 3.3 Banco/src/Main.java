import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Banco c = new Banco(0);
        c.Credito(200);
        c.getSaldo();
        c.Debito(100);
        c.getSaldo();
    }

}
