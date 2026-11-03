package EjercicioExamenPruebaRadiadoAtomico;

public class Consumidor extends Thread {

    private Buffer buffer;
    private int posicion = 0;

    public Consumidor(String nombre, Buffer buffer) {
        super(nombre);
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int dato = buffer.leer(posicion);

                System.out.println(getName() + " lee " + dato);

                buffer.terminado(posicion);
                posicion++;

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}
