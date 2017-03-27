public class Funcionario {
    String nome;
    int horasTrabalhadas;
    double valorHora;
    
    double calculaSalario(){
        return horasTrabalhadas*valorHora;
    }
}
