import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Funcionario f = new Funcionario();
        Scanner sc = new Scanner(System.in);
        
        double[] salarios = new double[2];
        
        for(int i=0;i<2;i++){            
            System.out.printf("Digite o nome do funcionário, horas trabalhadas e valor recebido por hora: \n");
            f.nome[i] = br.readLine();
            f.horasTrabalhadas[i] = sc.nextInt();
            f.valorHora[i] = sc.nextDouble();
            System.out.printf("Salário de %s = R$ %.2f\n\n", f.nome[i], f.calculaSalario(i));
            salarios[i]=f.calculaSalario(i);
        }
        int maior = f.max(salarios);
        System.out.printf("O maior salário é o de %s\n", f.nome[maior]);
    }
    
}
