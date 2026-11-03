package EjercicioExamenPruebaRadiadoAtomico;

public class Buffer {

    private int[] datos;
    private int[] leidos;
    private int cantidad = 0;
    private int consumidores;

    public Buffer(int capacidad, int consumidores) {
        datos = new int[capacidad];
        leidos = new int[capacidad];
        this.consumidores = consumidores;
    }

    public synchronized void producir(int dato) throws InterruptedException {
        while (cantidad == datos.length) {
            wait();
        }

        datos[cantidad] = dato;
        leidos[cantidad] = 0;
        cantidad++;

        notifyAll();
    }

    public synchronized int leer(int posicion) throws InterruptedException {
        while (posicion >= cantidad) {
            wait();
        }

        return datos[posicion];
    }

    public synchronized void terminado(int posicion) {
        leidos[posicion]++;

        if (leidos[posicion] == consumidores) {
            for (int i = posicion; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
                leidos[i] = leidos[i + 1];
            }

            cantidad--;
            notifyAll();
        }
    }
}