import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Ingrese tres numeros");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " + num1 + " es el mayor de los tres");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + " es el mayor de los tres");
        } else {
            System.out.println("El numero " + num3 + " es el mayor de los tres");
        }
    }
}