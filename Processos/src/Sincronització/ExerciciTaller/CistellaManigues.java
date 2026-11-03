package Sincronització.ExerciciTaller;

public class CistellaManigues {
    private int maniga;
    private boolean ple;

    public CistellaManigues(){
        maniga = 0;
        ple = false;
    }

    public int getManiga() {
        return maniga;
    }

    public void addManiga() throws InterruptedException {
        if (ple) wait();
        maniga++;
        if (maniga==8) ple=true;
    }

    public void treureManiga(){
        maniga--;
    }
}
