package br.edu.unifei.ecot12.bleach;

public class LivingWorldFactory implements SoulKing<LivingWorld>{

    @Override
    public LivingWorld buildRealm() {
        return new LivingWorld();
    }
    

}
