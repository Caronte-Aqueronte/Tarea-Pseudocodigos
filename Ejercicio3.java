import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int doble;
        int triple;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();
        doble = num * 2;
        triple = num * 3;
        System.out.println("El doble de " + num + " es " + doble + " y el triple es " + triple);
    }
}