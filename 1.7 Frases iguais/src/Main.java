import java.util.Scanner;

public class Main {
    
    static boolean iguais(String a, String b){return a.equals(b);}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String frase1 = sc.nextLine();
        String frase2 = sc.nextLine();

        System.out.printf(iguais(frase1,frase2)? "Iguais\n": "Diferentes\n");
    }  
}

