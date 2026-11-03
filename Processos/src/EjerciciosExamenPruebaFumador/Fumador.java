package EjerciciosExamenPruebaFumador;

public class Fumador extends Thread {

    private int id;
    private Mesa mesa;

    public Fumador(int id, Mesa mesa) {
        this.id = id;
        this.mesa = mesa;
    }

    public void run() {
        try {
            while (true) {
                mesa.coger(id);
                Thread.sleep(1000);
                System.out.println("El fumador " + id + " termina de fumar");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
