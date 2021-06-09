import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int d1;
        int d2;
        int d3;
        int d4;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();
        if (num <= 9999 && num >= 1000) {
            String numletra = String.valueOf(num);
            d1 = Integer.valueOf(numletra.substring(0, 1));
            d2 = Integer.valueOf(numletra.substring(1, 2));
            d3 = Integer.valueOf(numletra.substring(2, 3));
            d4 = Integer.valueOf(numletra.substring(3, 4));
            System.out.println("d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + ", d4=" + d4 + ", la suma es " + (d1 + d2 + d3 + d4));
        } else {
            System.out.println("Numero invalido");
        }
    }
}