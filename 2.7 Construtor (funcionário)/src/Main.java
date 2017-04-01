import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Funcionario F1 = new Funcionario("Paulo", 3, 200);
        System.out.printf("O salario de %s é de %.2f\n", F1.nome, F1.CalcSalario());
    }

}
