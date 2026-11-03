package EjercicioExamenPruebaCanibalesMisioneros;

public class Main {

    public static void main(String[] args) {

        Bote bote = new Bote();

        Persona p1 = new Persona("Misionero 1", "Misionero", bote);
        Persona p2 = new Persona("Misionero 2", "Misionero", bote);
        Persona p3 = new Persona("Canibal 1", "Canibal", bote);

        Persona p4 = new Persona("Canibal 2", "Canibal", bote);
        Persona p5 = new Persona("Misionero 3", "Misionero", bote);
        Persona p6 = new Persona("Canibal 3", "Canibal", bote);

        p1.start();
        p2.start();
        p3.start();

        p4.start();
        p5.start();
        p6.start();
    }
}
