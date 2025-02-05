package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public class Espada extends Arrancar {
    private String deathAspect;
    private int ranking;
    private List<Fraccion> servants = new ArrayList<Fraccion>();

    public List<Fraccion> getServants() {
        return servants;
    }

    public void setServants(List<Fraccion> servants) {
        this.servants = servants;
    }

    public String getDeathAspect() {
        return deathAspect;
    }

    public void setDeathAspect(String deathAspect) {
        this.deathAspect = deathAspect;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

}
