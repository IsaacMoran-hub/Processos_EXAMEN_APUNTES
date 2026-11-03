package EjerciciosExamenPruebaFilosofos;

public class Mesa {

    private boolean[] ocupado = new boolean[5];

    public synchronized void coger(int id) throws InterruptedException {
        int izquierdo = id;
        int derecho = (id + 1) % 5;
        while (ocupado[izquierdo] || ocupado[derecho]) {
            wait();
        }
        ocupado[izquierdo] = true;
        ocupado[derecho] = true;
    }

    public synchronized void soltar(int id) {
        ocupado[id] = false;
        ocupado[(id + 1) % 5] = false;
        notifyAll();
    }
}
