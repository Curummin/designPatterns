package br.edu.unifei.ecot12.bleach;

public class Encharged implements Rank {

    @Override
    public void changeRank(Shinigami s) {
        s.setRanking(new Lieutenent());
    }

}
