import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio;
        double altura;
        System.out.println("Ingrese el radio y luego la altura");
        radio = scanner.nextDouble();
        altura = scanner.nextDouble();
        if (radio > 0 && altura > 0) {
            double volumen = (Math.PI) * (Math.pow(radio, 2)) * altura;
            System.out.println("El volumen es " + volumen);
        } else {
            System.out.println("Datos invalidos");
        }
    }
}