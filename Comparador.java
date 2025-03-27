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