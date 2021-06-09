import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int siguiente;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();
        siguiente = num + 1;
        System.out.println("El numero despues de " + num + " es " + siguiente);
    }
}