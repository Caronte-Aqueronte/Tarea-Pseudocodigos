import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado1;
        int lado2;
        int lado3;
        System.out.println("Ingrese los tres lados");
        lado1 = scanner.nextInt();
        lado2 = scanner.nextInt();
        lado3 = scanner.nextInt();
        if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            System.out.println("El triangulo es escaleno");
        } else if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
            System.out.println("El triángulo es equilátero");
        } else {
            System.out.println("El triángulo es Isoceles");
        }
    }
}