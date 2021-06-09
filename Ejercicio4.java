import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int cuadrado;
        int cubo;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();
        cuadrado = (int) Math.pow(num, 2);
        cubo = (int) Math.pow(num, 3);
        System.out.println("El cuadrado de " + num + " es " + cuadrado + " y el cubo es " + cubo);
    }
}