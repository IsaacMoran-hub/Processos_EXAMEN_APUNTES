package EjerciciosExamenPruebaTallerDeCostura;

public class Main {

    static final int NumMaxMangas = 6;
    static final int NumMaxCuerpos = 4;

    public static void main(String[] args) {
        Cesta mangas = new Cesta("mangas", NumMaxMangas);
        Cesta cuerpos = new Cesta("cuerpos", NumMaxCuerpos);

        new Costurera(mangas, 300).start();
        new Costurera(cuerpos, 600).start();
        new Ensamblador(mangas, cuerpos).start();
    }
}
