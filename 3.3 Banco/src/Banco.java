public class Banco {
    private double Saldo;
    
    public Banco(int saldo){
        this.Saldo=saldo;
    }
    
    public double Credito(int deposito){
        return this.Saldo += deposito;
    }
    public double Debito(int saque){
        return this.Saldo -= saque;
    }
    public void getSaldo(){
        System.out.printf("O saldo atual é de R$%.2f\n", this.Saldo);
    }
}
