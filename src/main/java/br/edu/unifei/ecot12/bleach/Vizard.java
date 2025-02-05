package br.edu.unifei.ecot12.bleach;

public class Vizard extends Shinigami{

    Hollow innerHollow = new Hollow();

    protected Vizard(){}
    
    public Hollow getInnerHollow() {
        return innerHollow;
    }

    public void setInnerHollow(Hollow innerHollow) {
        this.innerHollow = innerHollow;
    }
    
}
