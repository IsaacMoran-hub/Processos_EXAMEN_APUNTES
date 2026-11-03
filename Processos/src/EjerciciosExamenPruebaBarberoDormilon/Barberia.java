package EjerciciosExamenPruebaBarberoDormilon;

public class Barberia {

    private int sillas;
    private int esperando = 0;
    private int llegados = 0;
    private int terminados = 0;

    public Barberia(int sillas) {
        this.sillas = sillas;
    }

    public synchronized void entrar(int id) throws InterruptedException {
        if (esperando == sillas) {
            System.out.println("El cliente " + id + " ve todo lleno y se marcha");
            return;
        }
        esperando++;
        int turno = llegados;
        llegados++;
        System.out.println("El cliente " + id + " se sienta a esperar (" + esperando + "/" + sillas + ")");
        notifyAll();
        while (terminados <= turno) {
            wait();
        }
        System.out.println("El cliente " + id + " se va pelado");
    }

    public synchronized void siguiente() throws InterruptedException {
        if (esperando == 0) {
            System.out.println("No hay clientes, el barbero se duerme");
        }
        while (esperando == 0) {
            wait();
        }
        esperando--;
        System.out.println("El barbero atiende a un cliente");
    }

    public synchronized void terminar() {
        terminados++;
        notifyAll();
    }
}
