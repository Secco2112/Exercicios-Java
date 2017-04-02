public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Paulo");
        System.out.println(p1.getNome());
        p1.setcpf("005.127.856-60");
        System.out.println(p1.getCpf());
        p1.setidade(29);
        System.out.println(p1.getIdade());
    }

}
