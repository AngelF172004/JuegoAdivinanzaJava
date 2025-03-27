
Juego de adivinanza de números
Paradigmas de programación

Jorge Eduardo Vázquez Villagrán                       Moran Hernández Ángel Fernando                                                 Daniel Enrique Cortes Santos
ESCUELA SUPERIOR DE COMPUTO

¿De qué trata el programa?
El programa es un juego que consiste en adivinar un número generado de manera aleatoria.
Tienes un número limitado de intentos, si adivinas el número antes de que se acaben, habrás ganado el juego.
Por otro lado, si te equivocas, el programa te irá dando pistas (Si el número es mayor o menor) y en caso de no adivinarlo antes de que se terminen los intentos, habrás perdido.

¿Cómo se implementó?
Utiliza 2 librerías principales:
Java.util.Random: Genera un número aleatorio.
Java.util.Scanner: Lee los números que pone el usuario.
La función Main() se encarga de detectar las entradas, explicar el juego, pedir el número de intentos que quieres tener, llamar a la función Aleario() e iniciar un bucle while que da inicio al juego.
Dicho bucle le pide al usuario un número, lo compara y da pistas en caso de errar; con la función Pistas(). En caso de acertar termina el juego.
La función Aleatorio() genera un número entre 1 y 100 con Random.nextInt().
Pistas() compara el numero escaneado con el número aleatorio, devuelve true si se acertó y false en caso de no acertar, diciendo de paso si tu número debe ser mayor o menor.

Instrucciones para ejecutar el programa:
Para ejecutar el programa en Visual Studio Code es importante tener la extensión de Java (Java Extension Pack).
Una vez hecho, tienes que abrir el archivo JuegoAdivinanzaJava.java que tiene el código fuente.
Y con la instrucción para ejecutar (Ctrl + Shift + B) se abrirá una terminar donde funciona el programa.

Problemas encontrados:
Ninguno, el código era sencillo de realizar.

Solución a los problemas:
No se necesitaron soluciones.

Enlace al GitHub:
https://github.com/AngelF172004/JuegoAdivinanzaJava

Enlace al Microsoft Planner:
https://planner.cloud.microsoft/f94bf4d9-8097-4794-adf6-a5466ca28563/Home/PlanViews/utRMqKQNNUqENPawbiuKT2QAD80h?Type=PlanLink&Channel=Link&CreatedTime=638786376521450000

Archivo fuente:
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

Capturas del funcionamiento:
 ![image](https://github.com/user-attachments/assets/1bbfb33c-6ade-4583-b0a9-3c34ad218843)


 
 
