package br.edu.unifei.ecot12.bleach;

public class Zanpakutou extends Soul {

    private ReleaseState releaseState = new Seald();
    private Shinigami shinigami;

    public Shinigami getShinigami() {
        return shinigami;
    }

    public void setShinigami(Shinigami shinigami) {
        this.shinigami = shinigami;
    }

    public void restrain() {
        releaseState.previousStage(this);
    }

    public void release() {
        releaseState.nextStage(this);
    }

    public ReleaseState getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(ReleaseState releaseState) {
        this.releaseState = releaseState;
    }
}
