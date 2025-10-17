import java.util.Random;
import java.util.Scanner;

public class BuscarArray {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int tamaño = 10; // Tamaño del array
        int[] miArray = new int[tamaño];
        Random random = new Random(); // Crea una instancia de Random

        // Llena el array con números aleatorios
        for (int i = 0; i < tamaño; i++) {
            // Genera un número aleatorio entre 0 (inclusive) y 100 (exclusivo)
            int num = random.nextInt(100); 
            miArray[i] = num;
        }

        // Opcional: Imprimir el array para verificar
        System.out.println("Array aleatorio generado:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(miArray[i] + " ");
        }

        
        System.out.println("\nIngrese un número a buscar en el array:");
        
        int buscar = sc.nextInt();
        int posicion = 1;
        
        for (int i = 0; i < tamaño; i++) {
            if (miArray[i] == buscar) {
                posicion = i+1;
                break;
            }
        }
            if (posicion != -1) {
                System.out.println("Número " + buscar + " encontrado en la posición " + posicion);
            }else {
                System.out.println("Número " + buscar + " no encontrado en el array.");
            }
            sc.close();
        }
}