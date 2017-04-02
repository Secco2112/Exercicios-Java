import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
            
        int valorGerado = jogo.geraValor();
        
        jogo.mostra("Escolha do jogador %d: ", 1);
        while(sc.hasNext()){
            boolean acertou=false;
            jogador1.escolha = sc.nextInt();
            jogo.mostra("Escolha do jogador %d: ", 2);
            jogador2.escolha = sc.nextInt();
            if(jogador1.escolha==valorGerado){
                if(jogador2.escolha==valorGerado) System.out.println("Empate, ambos jogadores acertaram.");
                else {System.out.println("Jogador 1 venceu!");jogador1.pontuacao++;}
                System.out.println("Novo jogo? Sim: 1 | Não: 2");
                int escolha = sc.nextInt();
                while(escolha<1 || escolha>2) {System.out.println("Novo jogo? Sim: 1 | Não: 2"); escolha = sc.nextInt();}
                if(!jogo.novoJogo(escolha)) {System.out.printf("\nPontuações:\nJogador 1: %d pontos\nJogador 2: %d pontos\n", jogador1.pontuacao, jogador2.pontuacao);break;}
                else {acertou=true;System.out.println("");}
            }
            if(jogador2.escolha==valorGerado){
                if(jogador1.escolha==valorGerado) System.out.println("Empate, ambos jogadores acertaram.");
                else {System.out.println("Jogador 2 venceu!");jogador2.pontuacao++;}
                System.out.println("Novo jogo? Sim: 1 | Não: 2");
                int escolha = sc.nextInt();
                while(escolha<1 || escolha>2) {System.out.println("Novo jogo? Sim: 1 | Não: 2"); escolha = sc.nextInt();}
                if(!jogo.novoJogo(escolha)) {System.out.printf("\nPontuações:\nJogador 1: %d pontos\nJogador 2: %d pontos\n", jogador1.pontuacao, jogador2.pontuacao);break;}
                else {acertou=true;System.out.println("");}
            }
            else if(jogador1.escolha!=valorGerado && jogador2.escolha!=valorGerado && !acertou) System.out.println("Os dois erraram.");
            jogo.mostra("Escolha do jogador %d: ", 1);
        }
    }
    
}