public class Funcionario {
    String[] nome = new String[2];
    int[] horasTrabalhadas = new int[2];
    double[] valorHora = new double[2];
    
    double calculaSalario(int pos){
        return horasTrabalhadas[pos]*valorHora[pos];
    }
    
    int max(double[] v){
        double maior=0;
        int pos=0;
        for(int i=0;i<v.length;i++){
            if(v[i]>maior){
               maior=v[i];
               pos=i;
            }
        }
        return pos;
    }
}
