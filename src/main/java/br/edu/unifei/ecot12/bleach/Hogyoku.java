package br.edu.unifei.ecot12.bleach;

public class Hogyoku {

    private static Hogyoku instace = new Hogyoku();

    public static Hogyoku getInstace() {
        return instace;
    }


    private Hogyoku() {
    }

    public Vizard createVizard() {
        Vizard v = new Vizard();
        return v;
    }
}
