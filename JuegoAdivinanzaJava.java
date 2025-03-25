import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n\t\t-----Juego de Adivinanza de un Número-----\n");
        System.out.println("Se generará un número aleatorio entre 1 y 100, y tú deberás adivinarlo");
        System.out.println("Ingresa el número de intentos permitidos para adivinar:");
        int intentos = scanner.nextInt(); //Se ingresa el número de intentos
        int numeroaleatorio = aleatorio(); //Usando el método aleatorio se genera el número
        int contador = 0; //El contador de intentos
        int opcion; //El intento de adivinar

        while (contador < intentos) { //El ciclo del funcionamiento principal
            opcion = 0;
            System.out.println("\n\nIngresa el número de tu intento " + (contador+1) + ":");
            opcion = scanner.nextInt();

            if (pistas(opcion, numeroaleatorio)) { //Se compara el numero ingresado con el random 
                break;                
            }
            
            contador++;
        }
        if (contador >= intentos){
            System.out.println("\n\n\t\t\t\tNO ADIVINASTE :(");
        }
        scanner.close();
        return;
    }
  
    public static int aleatorio(){ //Se genera el numero random
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }

    public static boolean pistas(int opcion, int numeroaleatorio){ //El metodo que compara los numeros
        if (opcion == numeroaleatorio) {
            System.out.println("\n\n\t\t\t\tADIVINASTE!!!\n\n\t\t\t\tFELICIDADES!!!");
            return true;
        }
        else if (opcion > numeroaleatorio) {
            System.out.println("El numero a adivinar es menor :(");
            return false;
        }
        else {
            System.out.println("El numero a adivinar es mayor :(");
            return false;
        }
    }

}