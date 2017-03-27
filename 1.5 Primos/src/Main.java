import java.util.Scanner;

public class Main {

    static boolean primo(int n){
        int div=0;
        for(int i=1;i<=Math.sqrt(n) && div<2;i++){
            if(n%i==0) div++;
        }
        return div==1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a=sc.nextInt();
        
        for(int i=2;i<=a;i++){
            if(primo(i)) System.out.printf("%d\n", i);
        }
    }  
}


