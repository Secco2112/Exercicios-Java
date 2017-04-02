import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Quadrado q1 = new Quadrado(2);
        System.out.printf("A área é %.2f e o perímetro é %.2f\n", q1.area(), q1.perimetro());
    }

}
