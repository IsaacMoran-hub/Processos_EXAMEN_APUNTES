package EjerciciosExamenPruebaPuenteEstrecho;

public class Vehiculo extends Thread {

    private int id;
    private int sentido;
    private Puente puente;

    public Vehiculo(int id, int sentido, Puente puente) {
        this.id = id;
        this.sentido = sentido;
        this.puente = puente;
    }

    public void run() {
        try {
            puente.llegar(id, sentido);
            Thread.sleep(1000);
            puente.salir(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
