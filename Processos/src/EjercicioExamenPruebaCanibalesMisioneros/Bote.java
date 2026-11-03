package EjercicioExamenPruebaCanibalesMisioneros;

public class Bote {

    private int misioneros = 0;
    private int canibales = 0;

    public synchronized void LlegaMisionero() throws InterruptedException {

        while (misioneros + canibales == 3 || (misioneros == 2 && canibales == 1)) {
            wait();
        }

        misioneros++;

        System.out.println("Llega un misionero. " + "Misioneros: " + misioneros + " Caníbales: " + canibales);

        comprobarBote();
    }

    public synchronized void LlegaCanibal() throws InterruptedException {

        while (misioneros + canibales == 3 || (misioneros == 2 && canibales == 1)) {
            wait();
        }

        canibales++;

        System.out.println("Llega un caníbal. " + "Misioneros: " + misioneros + " Caníbales: " + canibales);

        comprobarBote();
    }

    private void comprobarBote() {

        if (misioneros + canibales == 3) {

            System.out.println("BOTE LLENO. El bote cruza el río.");

            misioneros = 0;
            canibales = 0;

            System.out.println("El bote vuelve vacío.");

            notifyAll();
        }
    }
}
