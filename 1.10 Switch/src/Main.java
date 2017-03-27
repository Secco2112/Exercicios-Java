import java.util.Scanner;
 
class Main {
  public static double soma(double a, double b){return a+b;}
  public static double sub(double a, double b){return a-b;}
  public static double mult(double a, double b){return a*b;}
  public static double div(double a, double b){return a/b;}
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.printf("Digite dois valores:\n");
    while(sc.hasNext()){
      double a = sc.nextDouble();
      double b = sc.nextDouble();
     
      System.out.printf("\nInforme um valor que define o cálculo desejado:\n");
      System.out.printf("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
      int op = sc.nextInt();
     
      while(op<1 || op>4){
        System.out.printf("Por favor, digite um número entre 1 e 4, inclusive:\n");
        op = sc.nextInt();
      }
     
      switch(op){
        case 1:
            System.out.printf("\nSoma: %.2f\n", soma(a,b));
            break;
        case 2:
          System.out.printf("\nSubtração: %.2f\n", sub(a,b));
          break;
        case 3:
          System.out.printf("\nMultiplicação: %.2f\n", mult(a,b));
          break;
        case 4:
          System.out.printf("\nDivisão: %.2f\n", div(a,b));
          break;
        default:
          System.out.printf("\nValor inválido\n");
          break;
      }
     
      System.out.printf("\nDigite novamente dois valores:\n");
    }
  }
}