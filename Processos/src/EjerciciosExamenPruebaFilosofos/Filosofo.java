package EjerciciosExamenPruebaFilosofos;

import java.util.Random;

public class Filosofo extends Thread {

    private int id;
    private Mesa mesa;
    private Random random = new Random();

    public Filosofo(int id, Mesa mesa) {
        this.id = id;
        this.mesa = mesa;
    }

    public void run() {
        try {
            while (true) {
                System.out.println("El filosofo " + id + " medita");
                Thread.sleep(random.nextInt(1000) + 500);
                mesa.coger(id);
                System.out.println("El filosofo " + id + " come");
                Thread.sleep(random.nextInt(1000) + 500);
                mesa.soltar(id);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
