public class Quadrado {
    int lado;
    public Quadrado(int lado){
        this.lado = lado;
    }
    double area(){
        return lado*lado;
    }
    double perimetro(){
        return 4*lado;
    }
}