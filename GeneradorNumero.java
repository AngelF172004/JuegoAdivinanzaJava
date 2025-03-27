    public static int aleatorio(){ //Se genera el numero random
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }