import java.util.Scanner;

public class Main {
    static boolean div(int a, int b){return a%b==0;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.printf(div(a,b)? "%d é divisível por %d\n": "%d não é divisível por %d\n", a, b);
    }
    
}
