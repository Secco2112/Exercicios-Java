import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        IMC imc = new IMC();
        
        System.out.println("Insira o nome do paciente:");
        imc.nome = sc.nextLine();
        System.out.println("Insira o peso do paciente:");
        imc.peso = sc.nextDouble();
        System.out.println("Insira a altura do paciente:");
        imc.altura = sc.nextDouble();
        
        System.out.printf("O IMC de %s = %.2f\n", imc.nome, imc.calcularIMC());
    }
    
}
