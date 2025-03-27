import java.util.Random;

public class GeneradorNumero {
    public static int aleatorio() { // Método para generar un número aleatorio
        Random random = new Random();
        int min = 1;
        int max = 100;
        return random.nextInt(max - min + 1) + min;
    }
}
