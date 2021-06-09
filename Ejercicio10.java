import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        double perimetro;
        double base;
        double altura;
        System.out.println("Ingrese la base");
        base = scanner.nextDouble();
        System.out.println("Ingrese la altura");
        altura = scanner.nextDouble();
        area = base * altura;
        perimetro = (2 * base) + (2 * altura);
        System.out.println("El area es " + area + " y el perimetro es " + perimetro);
    }
}