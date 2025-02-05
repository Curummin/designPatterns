package br.edu.unifei.ecot12.bleach;

public interface ReleaseState {
    public void nextStage(Zanpakutou zanpakutou);
    public void previousStage(Zanpakutou zanpakutou);
}
