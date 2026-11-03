package Sincronització.ExerciciTaller;

public class CistellaCos {
    private int cos;
    boolean ple;

    public CistellaCos(){
        cos = 0;
        ple = false;
    }

    public int getCos() {
        return cos;
    }

    public void addCos() {
        cos++;
        if (cos==5) ple=true;
    }

    public void treureCos(){
        cos--;
    }
}
