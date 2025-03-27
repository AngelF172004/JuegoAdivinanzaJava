public class Comparador {
    public static boolean pistas(int opcion, int numeroaleatorio) { // Compara los números
        if (opcion == numeroaleatorio) {
            System.out.println("\n\n\t\t\t\tADIVINASTE!!!\n\n\t\t\t\tFELICIDADES!!!");
            return true;
        } else if (opcion > numeroaleatorio) {
            System.out.println("El número a adivinar es menor :(");
        } else {
            System.out.println("El número a adivinar es mayor :(");
        }
        return false;
    }
}
