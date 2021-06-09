import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A;
        String B;
        String aux;
        System.out.println("Ingrese A");
        A = scanner.nextLine();
        System.out.println("Ingrese B");
        B = scanner.nextLine();
        aux = A;
        A = B;
        B = aux;
        System.out.println("A tiene el valor de " + A + " y B tiene valor de " + B);

    }
}