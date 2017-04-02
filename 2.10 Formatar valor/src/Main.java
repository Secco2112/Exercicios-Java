import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Formata f = new Formata();
        
        System.out.printf("Valor: \n");
        double numero = sc.nextDouble();
        System.out.printf("Casas decimais a formatar: \n");
        int casas = sc.nextInt();
        
        System.out.printf("Duas casas decimais: %s\nN casa decimais: %s\n", f.formataParaDois(numero), f.formata(numero,casas));
    }
    
}
