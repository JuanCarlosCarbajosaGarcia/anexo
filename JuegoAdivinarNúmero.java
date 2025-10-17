import java.util.Scanner;

public class JuegoAdivinarNúmero {
    

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        Scanner sc = new Scanner(System.in);

        //Genera un número aleatorio
        int min = 1;
        int max = 20;
        int numeroAleatorio = random.nextInt((max - min) + 1) + min;

        System.out.println("introducca un numero inicial para recibir una pista: ");
        int num = sc.nextInt();
        
        while (num != numeroAleatorio) {
            if (num < numeroAleatorio) {
                System.out.println("El número es mayor");
                num = sc.nextInt();
            } {
                
            }
            if (num > numeroAleatorio) {
                System.out.println("El número es menor");
                num = sc.nextInt();
            }
            if (num == numeroAleatorio) {
                System.out.println("felizidades ese es el numerro");
                break;
            }
        }
        sc.close();
    }
}
