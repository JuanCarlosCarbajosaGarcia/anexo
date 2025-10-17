import java.util.Scanner;

public class DeteccionNumerosPrimos {
      public static void main(String[] args) {
      //numeros a evaluar 
      int [] numprim = new int[4];
      Scanner sc = new Scanner(System.in);
      
      System.out.println("escriba 4 numeros para evaluar si son primos: ");
      
      for(int i=0; i<4; i++) {
        numprim[i] = sc.nextInt();
      }
      for(int i=0; i<4; i++) {
        boolean esprim = true;
        if(numprim[i] <= 1) {
          esprim = false;
        } else {
          for(int j=2; j<= Math.sqrt(numprim[i]); j++) {
            if(numprim[i] % j == 0) {
              esprim = false;
              break;
            }
          }
        }
        if(esprim) {
          System.out.println(numprim[i] + " es un numero primo.");
        } else {
          System.out.println(numprim[i] + " no es un numero primo.");
      }
      }
      sc.close();
    }
}
