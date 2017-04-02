public class Jogo {
    public int geraValor(){
        return (int)(Math.random()*10);
    }
    
    public void mostra(String frase, int param){
        System.out.printf(frase, param);
    }
    
    public boolean novoJogo(int escolha){
        return escolha==1;
    }
    
    public void limpaConsole() {  
        System.out.print("\b");  
        System.out.flush();  
    } 
}