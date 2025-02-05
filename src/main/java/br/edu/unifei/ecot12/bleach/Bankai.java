package br.edu.unifei.ecot12.bleach;

public class Bankai implements ReleaseState{

    private String powerDescription;

    public String getPowerDescription() {
        return powerDescription;
    }

    public void setPowerDescription(String powerDescription) {
        this.powerDescription = powerDescription;
    }

    @Override
    public void nextStage(Zanpakutou zanpakutou) {}

    @Override
    public void previousStage(Zanpakutou zanpakutou) {
        zanpakutou.setReleaseState(new Shikai());
    }
    
}
