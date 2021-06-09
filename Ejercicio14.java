import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese dos numeros");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if (num1 % num2 == 0) {
            System.out.println("Es divisible");
        } else {
            System.out.println("No divisible");
        }
    }
}