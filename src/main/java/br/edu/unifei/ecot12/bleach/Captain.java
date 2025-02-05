package br.edu.unifei.ecot12.bleach;

public class Captain implements Rank{

    private Division division;

    @Override
    public void changeRank(Shinigami shinigami) {
    }


    public Division getDivision() {
        return division;
    }


    public void setDivision(Division division) {
        this.division = division;
    }
    
}
