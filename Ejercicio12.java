import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celcius = 0;
        double grados;
        System.out.println("Ingrese los grados");
        grados = scanner.nextDouble();
        celcius = (grados - 32) * 9 / 5;
        System.out.println("Son " + celcius + " grados celcius");

    }
}