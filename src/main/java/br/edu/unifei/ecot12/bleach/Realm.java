package br.edu.unifei.ecot12.bleach;

import java.util.ArrayList;
import java.util.List;

public abstract class Realm {

    private List<Soul> souls = new ArrayList<>();

    private float reishiConcentration;

    public float getReishiConcentration() {
        return reishiConcentration;
    }

    public void setReishiConcentration(float reishiConcentration) {
        this.reishiConcentration = reishiConcentration;
    }

    public List<Soul> getSouls() {
        return souls;
    }

    public void setSouls(List<Soul> souls) {
        this.souls = souls;
    }

}
