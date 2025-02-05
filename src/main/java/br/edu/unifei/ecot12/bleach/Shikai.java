package br.edu.unifei.ecot12.bleach;

public class Shikai implements ReleaseState {

    private String powerDescription;

    @Override
    public void nextStage(Zanpakutou zanpakutou) {
        zanpakutou.setReleaseState(new Bankai());
    }

    @Override
    public void previousStage(Zanpakutou zanpakutou) {
        zanpakutou.setReleaseState(new Seald());
    }

    public String getPowerDescription() {
        return powerDescription;
    }

    public void setPowerDescription(String powerDescription) {
        this.powerDescription = powerDescription;
    }

}
