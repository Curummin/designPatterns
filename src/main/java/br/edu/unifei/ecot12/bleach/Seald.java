package br.edu.unifei.ecot12.bleach;

public class Seald implements ReleaseState{

    @Override
    public void nextStage(Zanpakutou zanpakutou) {
        zanpakutou.setReleaseState(new Shikai());
    }

    @Override
    public void previousStage(Zanpakutou zanpakutou) {}

}
