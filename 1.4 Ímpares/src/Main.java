import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(a>b){
            int aux=a;
            a=b;
            b=aux;
        }
        
        for(int i=a;i<=b;i++){
            if(i==b){
                if(i%2!=0) System.out.printf("%d\n", i);
            }
            else{
                if(i%2!=0) System.out.printf("%d ", i);
            }
        }
    }
    
}