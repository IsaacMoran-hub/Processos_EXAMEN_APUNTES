package EjerciciosExamenPruebaTallerDeCostura;

public class Cesta {

    private String nombre;
    private int capacidad;
    private int piezas = 0;

    public Cesta(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public synchronized void poner() throws InterruptedException {
        while (piezas == capacidad) {
            wait();
        }
        piezas++;
        System.out.println("Cesta de " + nombre + ": " + piezas + "/" + capacidad);
        notifyAll();
    }

    public synchronized void quitar(int cantidad) throws InterruptedException {
        while (piezas < cantidad) {
            wait();
        }
        piezas = piezas - cantidad;
        System.out.println("Cesta de " + nombre + ": " + piezas + "/" + capacidad);
        notifyAll();
    }
}
