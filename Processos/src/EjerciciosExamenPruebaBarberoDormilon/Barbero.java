package EjerciciosExamenPruebaBarberoDormilon;

public class Barbero extends Thread {

    private Barberia barberia;

    public Barbero(Barberia barberia) {
        this.barberia = barberia;
    }

    public void run() {
        try {
            while (true) {
                barberia.siguiente();
                Thread.sleep(1000);
                barberia.terminar();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
