import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    static double soma(double[] v){
        double s=0;
        for(int i=0;i<v.length;i++) s+=v[i];
        return s;
    }
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double[] v = new double[5];
        
        for(int i=0;i<5;i++){
            v[i] = sc.nextDouble();
        }
        
        System.out.printf("v = {");
        for(int i=0;i<5;i++){
            if(i==4){
                System.out.printf(v[i] + "}\n");
            }
            else{
                System.out.printf(v[i] + ", ");
            }
        }
        
        System.out.printf("SOMA = %.2f\nMÉDIA = %.2f\n", soma(v), soma(v)/v.length);
    }  
}