package br.edu.unifei.ecot12.bleach;

public abstract class SpecialHuman extends Human{
    
    public void killEssence(Soul s)
    {
        s.setEssence(false);
    }
}
