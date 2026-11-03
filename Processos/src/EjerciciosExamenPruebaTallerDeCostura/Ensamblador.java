package EjerciciosExamenPruebaTallerDeCostura;

public class Ensamblador extends Thread {

    private Cesta mangas;
    private Cesta cuerpos;

    public Ensamblador(Cesta mangas, Cesta cuerpos) {
        this.mangas = mangas;
        this.cuerpos = cuerpos;
    }

    public void run() {
        try {
            while (true) {
                mangas.quitar(2);
                cuerpos.quitar(1);
                Thread.sleep(800);
                System.out.println("Jersey terminado");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
