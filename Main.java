import java.util.Random;


class Main {
  public static void main(String[] args) {
   Random r = new Random();
    double d[] = new double[5];
    double suma=0;
    for(int i =0; i < 5; i++){
      
    d[i] = r.nextInt(101);
      System.out.println("wylosowana liczba " + d[i]);
     double kw = Math.pow(d[i],2);
      System.out.println("kwadrat liczby " + kw);
     
    suma = suma + kw;
      System.out.println("suma kwadratów " + suma);
      System.out.println();
      
      
    } 
   
  }
}