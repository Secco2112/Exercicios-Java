import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Circulo circulo = new Circulo();
        
        System.out.println("Digite o valor do raio: ");
        circulo.raio = sc.nextInt();
        
        System.out.printf("ÁREA = %.2f\nPERÍMETRO = %.2f\n", circulo.area(), circulo.perimetro());
    }
    
}