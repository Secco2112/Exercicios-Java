public class IMC {
    public double peso,altura;
    public String nome;
    
    double calcularIMC(){
        return peso/Math.pow(altura, 2);
    }
}
