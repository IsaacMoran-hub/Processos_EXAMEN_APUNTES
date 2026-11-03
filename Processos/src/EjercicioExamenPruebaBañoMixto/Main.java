package EjercicioExamenPruebaBañoMixto;

public class Main {

    public static void main(String[] args) {

        baño bano = new baño();

        Persona p1 = new Persona("Juan", "Hombre", bano);
        Persona p2 = new Persona("Pedro", "Hombre", bano);
        Persona p3 = new Persona("Ana", "Mujer", bano);
        Persona p4 = new Persona("Maria", "Mujer", bano);
        Persona p5 = new Persona("Luis", "Hombre", bano);
        Persona p6 = new Persona("Laura", "Mujer", bano);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
    }
}
