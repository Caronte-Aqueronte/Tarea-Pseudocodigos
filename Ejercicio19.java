import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numrandom = (int) (Math.random() * (1000 - 1)) + 1;
        System.out.println("el numero random es " + numrandom);
        if (numrandom % 5 == 0 && numrandom <= 25) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}