package EjerciciosExamenPruebaPuenteEstrecho;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Puente puente = new Puente();
        Random random = new Random();

        int id = 1;
        while (true) {
            new Vehiculo(id, random.nextInt(2), puente).start();
            id++;
            Thread.sleep(random.nextInt(500));
        }
    }
}
