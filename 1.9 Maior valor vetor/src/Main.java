import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    static double maior(double[] v){
        double m=-1;
        for(int i=0;i<v.length;i++){
            if(v[i]>m) m=v[i];
        }
        return m;
    }
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double[] v = new double[5];

        for(int i=0;i<v.length;i++){
            v[i] = sc.nextDouble();
        }
        
        double m = maior(v);
        
        int pos=0;
        for(int i=0;i<v.length;i++){
            if(v[i]==m) {
                pos=i;
                break;
            } 
        }
        
        System.out.printf("MAIOR = %.2f\nPOSIÇÃO = %d\n", m, pos);
    }  
}