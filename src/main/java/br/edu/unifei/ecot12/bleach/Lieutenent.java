package br.edu.unifei.ecot12.bleach;

public class Lieutenent implements Rank {
    private Division division;

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    @Override
    public void changeRank(Shinigami s) {
        s.setRanking(new Captain());
    }

}
