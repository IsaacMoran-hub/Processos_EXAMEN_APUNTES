package EjerciciosExamenPruebaBarberoDormilon;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Barberia barberia = new Barberia(3);
        Random random = new Random();

        new Barbero(barberia).start();

        int id = 1;
        while (true) {
            new Cliente(id, barberia).start();
            id++;
            Thread.sleep(random.nextInt(1500));
        }
    }
}
