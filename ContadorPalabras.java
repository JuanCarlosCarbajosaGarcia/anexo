import java.util.Scanner;

public class ContadorPalabras {
Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ContadorPalabras cp = new ContadorPalabras();
        cp.cuentapalabras();    
    }
    public void cuentapalabras(){
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.trim().split("\\s+");
        System.out.println("Número de palabras: " + palabras.length);
        sc.close();
    }
}