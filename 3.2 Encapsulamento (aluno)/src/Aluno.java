public class Aluno {

    private String Nome;
    private int N1;
    private int N2;

    public String getNome() {
        return Nome;
    }

    public int getN1() {
        return N1;
    }

    public int getN2() {
        return N2;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setN1(int N1) {
        this.N1 = N1;
    }

    public void setN2(int N2) {
        this.N2 = N2;
    }
    double CalculaMedia(int n1, int n2){
        return (n1+n2)/2.0;
    }
    
    public Aluno(String nome, int n1, int n2){
        this.Nome = this.getNome();
        this.N1 = this.getN1();
        this.N2 = this.getN2();
    }
}