public class Circulo {
   int raio;
   
   double area(){
       return Math.PI*Math.pow(raio, 2);
   }
   
   double perimetro(){
        return 2*Math.PI*raio;
   }
}
