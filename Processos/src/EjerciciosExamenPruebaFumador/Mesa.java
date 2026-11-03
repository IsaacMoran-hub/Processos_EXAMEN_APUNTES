package EjerciciosExamenPruebaFumador;

public class Mesa {

    private int falta = -1;

    public synchronized void poner(int ingredienteQueFalta) throws InterruptedException {
        while (falta != -1) {
            wait();
        }
        falta = ingredienteQueFalta;
        System.out.println("El proveedor pone ingredientes. Falta el " + ingredienteQueFalta);
        notifyAll();
    }

    public synchronized void coger(int id) throws InterruptedException {
        while (falta != id) {
            wait();
        }
        falta = -1;
        System.out.println("El fumador " + id + " coge los ingredientes y empieza a fumar");
        notifyAll();
    }
}
