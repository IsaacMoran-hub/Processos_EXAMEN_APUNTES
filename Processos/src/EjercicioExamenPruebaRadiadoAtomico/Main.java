package EjercicioExamenPruebaRadiadoAtomico;

public class Main {

    public static void main(String[] args) {

        Buffer buffer = new Buffer(3, 3);

        Productor p = new Productor(buffer);

        Consumidor c1 = new Consumidor("C1", buffer);
        Consumidor c2 = new Consumidor("C2", buffer);
        Consumidor c3 = new Consumidor("C3", buffer);

        p.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
