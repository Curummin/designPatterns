package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public class Division {
    private int number;
    private Shinigami captain;
    private Shinigami lieutenent;
    private List<Shinigami> soldiers = new ArrayList<Shinigami>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Shinigami getCaptain() {
        return captain;
    }

    public void setCaptain(Shinigami captain) {
        this.captain = captain;
    }

    public Shinigami getLieutenent() {
        return lieutenent;
    }

    public void setLieutenent(Shinigami lieutenent) {
        this.lieutenent = lieutenent;
    }

    public List<Shinigami> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Shinigami> soldiers) {
        this.soldiers = soldiers;
    }

   

}