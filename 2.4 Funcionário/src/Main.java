import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
            
        System.out.println("Nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Horas trabalhadas do funcionário: ");
        funcionario.horasTrabalhadas = sc.nextInt();
        System.out.println("Valor por hora do funcionário: ");
        funcionario.valorHora = sc.nextDouble();
            
        System.out.printf("Salário de %s = R$ %.2f\n", funcionario.nome, funcionario.calculaSalario());
    }
}
