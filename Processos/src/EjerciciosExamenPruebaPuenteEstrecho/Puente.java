package EjerciciosExamenPruebaPuenteEstrecho;

public class Puente {

    private int dentro = 0;
    private int sentidoActual = 0;
    private int seguidos = 0;
    private int[] esperando = new int[2];
    private String[] nombres = {"izquierda", "derecha"};

    public synchronized void llegar(int id, int sentido) throws InterruptedException {
        int otro = 1 - sentido;
        esperando[sentido]++;
        while (!puedeEntrar(sentido, otro)) {
            wait();
        }
        esperando[sentido]--;
        if (dentro == 0) {
            seguidos = 0;
        }
        seguidos++;
        sentidoActual = sentido;
        dentro++;
        System.out.println("Vehiculo " + id + " (" + nombres[sentido] + ") entra. En el puente: " + dentro);
    }

    private boolean puedeEntrar(int sentido, int otro) {
        if (dentro == 0) {
            return esperando[otro] == 0 || sentido != sentidoActual;
        }
        return sentidoActual == sentido && dentro < 3 && (esperando[otro] == 0 || seguidos < 3);
    }

    public synchronized void salir(int id) {
        dentro--;
        System.out.println("Vehiculo " + id + " sale. En el puente: " + dentro);
        notifyAll();
    }
}
