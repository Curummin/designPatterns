package br.edu.unifei.ecot12.bleach;

public class SoulSocietyFactory implements SoulKing<SoulSociety>{

    @Override
    public SoulSociety buildRealm() {
      return new SoulSociety();
    }
    
    
}
