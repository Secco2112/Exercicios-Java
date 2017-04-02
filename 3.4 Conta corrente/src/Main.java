import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente(0);
        
        cc.cadastrarSenha("senhadaconta");
        cc.getSenha();
        cc.alterarSenha("senhaDaConta", "novasenha");
        cc.alterarSenha("senhadaconta", "novasenha");
        cc.getSenha();
        cc.creditar(700, "senhadaconta");
        cc.getSaldo();
        cc.creditar(700, "novasenha");
        cc.getSaldo();
        cc.debitar(500, "novasenha");
        cc.getSaldo();
    }
    
}
