public class Formata {
    
    public String formataParaDois(double valor){
        return String.format("%.2f", valor);
    }
    
    public String formata(double valor, int casas){
        return String.format("%." + casas + "f", valor);
    }
}
