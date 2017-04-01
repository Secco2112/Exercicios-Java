public class Funcionario {
    String nome;
    int horas;
    double valor;
    
    public Funcionario(String nome, int horas, double valor){
        this.nome = nome;
        this.horas = horas;
        this.valor = valor;
    }
    
    double CalcSalario(){
        return horas*valor;
    }
}
