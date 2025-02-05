package br.edu.unifei.ecot12.bleach;

public class HuecoMundoFactory implements SoulKing<HuecoMundo>{

    @Override
    public HuecoMundo buildRealm() {
        return new HuecoMundo();
    }
    
}
