import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pais;
        String capital;
        System.out.println("Ingrese un pais y su capital");
        pais = scanner.nextLine();
        capital = scanner.nextLine();
        System.out.println(capital+" es capital de "+pais);
    }
}