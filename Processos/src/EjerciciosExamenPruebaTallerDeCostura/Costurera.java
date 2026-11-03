package EjerciciosExamenPruebaTallerDeCostura;

import java.util.Random;

public class Costurera extends Thread {

    private Cesta cesta;
    private int tiempo;
    private Random random = new Random();

    public Costurera(Cesta cesta, int tiempo) {
        this.cesta = cesta;
        this.tiempo = tiempo;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(tiempo) + 100);
                cesta.poner();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
