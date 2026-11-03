package EjerciciosExamenPruebaFumador;

import java.util.Random;

public class Proveedor extends Thread {

    private Mesa mesa;
    private Random random = new Random();

    public Proveedor(Mesa mesa) {
        this.mesa = mesa;
    }

    public void run() {
        try {
            while (true) {
                mesa.poner(random.nextInt(3));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
