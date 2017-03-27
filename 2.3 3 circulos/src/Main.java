import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ord = {"primeiro", "segundo", "terceiro"};
        
        Circulo circulo = new Circulo();
        
        for(int i=0;i<3;i++){
            System.out.printf("Insira o %s raio: ", ord[i]);
            circulo.raio = sc.nextInt();
            System.out.printf("Área do %s círculo: %.2f\nPerímetro do %s círculo: %.2f\n", ord[i], circulo.area(), ord[i], circulo.perimetro());
        }
    }
    
}
