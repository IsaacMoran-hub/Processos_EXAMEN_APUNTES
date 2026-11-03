package EjercicioExamenPruebaCanibalesMisioneros;

public class Persona extends Thread {

    private String tipo;
    private Bote bote;

    public Persona(String nombre, String tipo, Bote bote) {
        super(nombre);
        this.tipo = tipo;
        this.bote = bote;
    }

    public void run() {

        try {

            if (tipo.equals("Misionero")) {
                bote.LlegaMisionero();
            } else {
                bote.LlegaCanibal();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
