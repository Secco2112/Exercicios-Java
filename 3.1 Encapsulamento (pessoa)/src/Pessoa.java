public class Pessoa {
    private String nome;
    private String cpf;
    private int idade; 
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;   
    }
    
    public String getCpf(){
        return this.cpf;
    }
    public void setcpf(String cpf){
        this.cpf=cpf;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setidade(int idade){
        this.idade=idade;
    }
}