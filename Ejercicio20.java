import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int suma;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();
        if (num <= 99999 && num >= 10000) {
            String numaALetra = String.valueOf(num);
            int decenamillar = Integer.valueOf(numaALetra.substring(4, 5)) * 10000;
            int unidadmillar = Integer.valueOf(numaALetra.substring(3, 4)) * 1000;
            int centena = Integer.valueOf(numaALetra.substring(2, 3)) * 100;
            int decena = Integer.valueOf(numaALetra.substring(1, 2)) * 10;
            int unidad = Integer.valueOf(numaALetra.substring(0, 1)) * 1;
            suma = decenamillar + unidadmillar + centena + decena + unidad;
            if (suma == num) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        } else {
            System.out.println("Numero invalido");
        }
    }
}