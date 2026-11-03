package EjercicioExamenPruebaBañoMixto;

public class Persona extends Thread {

    private String sexo;
    private baño baño;

    public Persona(String nombre, String sexo, baño bano) {
        super(nombre);
        this.sexo = sexo;
        this.baño = bano;
    }

    public void run() {

        try {

            System.out.println(getName() + " espera para entrar.");

            baño.entrar(sexo);

            Thread.sleep(2000);

            baño.salir(sexo);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
