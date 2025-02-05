package br.edu.unifei.ecot12.bleach;

public class Hollow extends Soul {

    private boolean maskIntegrity;

    private MenosGrande menosGrande = new Gilian();

    public void consumeHuman(Human h)
    {
        h.setEssence(false);
    }

    public void killShinigami(Shinigami s)
    {
        s.setEssence(false);
    }
    
    public void evolve() {
        menosGrande.change(this);
    }

    public MenosGrande getMenosGrande() {
        return menosGrande;
    }

    public void setMenosGrande(MenosGrande menosGrande) {
        this.menosGrande = menosGrande;
    }

    public boolean isMaskIntegrity() {
        return maskIntegrity;
    }

    public void setMaskIntegrity(boolean maskIntegrity) {
        this.maskIntegrity = maskIntegrity;
    }

}
