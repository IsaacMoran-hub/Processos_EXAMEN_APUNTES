package EjerciciosExamenPruebaBarberoDormilon;

public class Cliente extends Thread {

    private int id;
    private Barberia barberia;

    public Cliente(int id, Barberia barberia) {
        this.id = id;
        this.barberia = barberia;
    }

    public void run() {
        try {
            barberia.entrar(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
