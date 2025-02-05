package br.edu.unifei.ecot12.bleach;

public class Gilian implements MenosGrande{
    private float size;

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public void change(Hollow h) {
        h.setMenosGrande(new Adjucha());
    }
}
