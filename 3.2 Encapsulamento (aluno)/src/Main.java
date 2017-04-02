public class Main {

    public static void main(String[] args) {
        Aluno Ana = new Aluno("Ana", 10, 9);
        Ana.setNome("Ana");
        Ana.setN1(10);
        Ana.setN2(9);
        System.out.println("A media de " + Ana.getNome() + " é de " + Ana.CalculaMedia(Ana.getN1(), Ana.getN2()));
        
        Aluno Beto = new Aluno("Beto", 9, 10);
        Beto.setNome("Beto");
        Beto.setN1(9);
        Beto.setN2(10);
        System.out.println("A media de " + Beto.getNome() + " é de " + Beto.CalculaMedia(Beto.getN1(), Beto.getN2()));
    }
        
}
