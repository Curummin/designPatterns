package br.edu.unifei.ecot12.bleach;

public class Soldier implements Rank {

    private Division division;

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    @Override
    public void changeRank(Shinigami s) {
        s.setRanking(new Encharged());
    }

}
