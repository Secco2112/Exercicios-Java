public class ContaCorrente {
    private String nome, Senha, senhaCadastrada="";
    private double saldo;
    
    public ContaCorrente(double Saldo){
        this.saldo=Saldo;
    }
    
    public void cadastrarSenha(String senha){
        this.Senha = senha;
        senhaCadastrada = senha;
    }
    
    public void alterarSenha(String velhaSenha, String novaSenha){
        if(senhaCadastrada.equals(velhaSenha) && !velhaSenha.equals(novaSenha)){
            this.cadastrarSenha(novaSenha);
            System.out.println("Senha alterada com sucesso!");
        }
        else{
            System.out.println("Erro ao alterar senha.");
        }
    }
    
    public void getSenha(){
        System.out.println("Senha atual: " + senhaCadastrada);
    }
    
    public void getSaldo(){
        System.out.println("Saldo atual: R$" + this.saldo);
    }
    
    public void creditar(double valor, String senha){
        if(senha.equals(senhaCadastrada)){
            this.saldo+=valor;
            System.out.println("Foram creditados R$" + valor + " na sua conta corrente.");
        }
        else{
            System.out.println("Senha incorreta ao creditar. Por favor, tente novamente.");
        }
    }
    
    public void debitar(double valor, String senha){
        if(senha.equals(senhaCadastrada)){
            this.saldo-=valor;
            System.out.println("Foram debitados R$" + valor + " da sua conta corrente.");
        }
        else{
            System.out.println("Senha incorreta ao debitar. Por favor, tente novamente.");
        }
    }
}
