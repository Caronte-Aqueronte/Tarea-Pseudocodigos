public class Ejercicio6 {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 200);
        double porsentaje;
        System.out.println("El numero aleatorio es " + random);
        porsentaje = random * 0.3;
        System.out.println("El numero aumentado un 30% es " + (random + porsentaje));
    }
}