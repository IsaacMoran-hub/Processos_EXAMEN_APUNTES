package EjerciciosExamenPruebaFumador;

public class Main {

    public static void main(String[] args) {
        Mesa mesa = new Mesa();

        new Proveedor(mesa).start();
        new Fumador(0, mesa).start();
        new Fumador(1, mesa).start();
        new Fumador(2, mesa).start();
    }
}



