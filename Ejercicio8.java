import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numero2;
        int numero3;
        double promedio;
        System.out.println("Ingrese 3 numeros");
        numero = scanner.nextInt();
        numero2 = scanner.nextInt();
        numero3 = scanner.nextInt();
        promedio = (double) (numero + numero2 + numero3) / 3;
        System.out.println("El promedio es " + promedio);
    }
}