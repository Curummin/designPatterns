package br.edu.unifei.ecot12.bleach;

public class Shinigami extends Soul {

    private Rank ranking = new Soldier();
    private Zanpakutou zanpakutou;

    public void promotion() {
        ranking.changeRank(this);
    }

    public void killHollow(Hollow h)
    {
        h.setEssence(false);
    }

    public Rank getRanking() {
        return ranking;
    }

    public void setRanking(Rank ranking) {
        this.ranking = ranking;
    }

    public Zanpakutou getZanpakutou() {
        return zanpakutou;
    }

    public void setZanpakutou(Zanpakutou zanpakutou) {
        this.zanpakutou = zanpakutou;
    }

}
