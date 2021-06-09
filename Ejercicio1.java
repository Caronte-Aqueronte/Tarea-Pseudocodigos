import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Ingrese dos numeros");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        System.out.println("La suma es " + (numero1 + numero2));
    }
}