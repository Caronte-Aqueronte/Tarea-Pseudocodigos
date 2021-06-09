public class Ejercicio7 {

    public static void main(String[] args) {
        int numrandom = (int) (Math.random() * (50 - 10)) + 10;;
        double porsentaje;
        System.out.println("El numero aleatorio es " + numrandom);
        porsentaje = numrandom * 0.15;
        System.out.println("El numero disminuido un 15% es " + (numrandom - porsentaje));
    }
}