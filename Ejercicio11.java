import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yarda;
        double metro;
        double pie;
        double pulgada;
        double cm;
        System.out.println("Ingrese los cm");
        cm = scanner.nextDouble();
        yarda = cm / 91.44;
        metro = cm / 100;
        pie = cm / 30.48;
        pulgada = cm / 2.54;
        System.out.println(cm + "cms" + " a yardas son " + yarda + "yd, " + cm + "cms" + " a metros son " + metro + "mts, " + cm + "cms" + " a pies son " + pie + "pie, " + cm + "cms" + " a pulgadas son " + pulgada + "pulg");
    }
}