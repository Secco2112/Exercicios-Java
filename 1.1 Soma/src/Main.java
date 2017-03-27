import java.util.Scanner;

public class Main {

    static int soma(int a, int b){return a+b;}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.printf("SOMA = %d\n", soma(a,b));
    }  
}
