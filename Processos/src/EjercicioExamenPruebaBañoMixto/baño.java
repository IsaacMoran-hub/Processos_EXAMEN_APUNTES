package EjercicioExamenPruebaBañoMixto;

public class baño {

    private int dentro = 0;
    private int capacidad = 3;

    private String sexo = "";

    public synchronized void entrar(String sexo) throws InterruptedException {

        while (dentro == capacidad || (!this.sexo.equals("") && !this.sexo.equals(sexo))) {
            wait();
        }

        this.sexo = sexo;
        dentro++;

        System.out.println(Thread.currentThread().getName()
                + " entra al baño (" + sexo + "). Dentro: " + dentro);
    }

    public synchronized void salir(String sexo) {

        dentro--;

        System.out.println(Thread.currentThread().getName()
                + " sale del baño (" + sexo + "). Dentro: " + dentro);

        if (dentro == 0) {
            this.sexo = "";
        }

        notifyAll();
    }
}
