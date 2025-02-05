package br.edu.unifei.ecot12.bleach;

public abstract class Soul {
    private boolean phisicalBody;
    private boolean essence;
    private String name;

    public boolean isPhisicalBody() {
        return phisicalBody;
    }

    public void setPhisicalBody(boolean phisicalBody) {
        this.phisicalBody = phisicalBody;
    }

    public boolean isEssence() {
        return essence;
    }

    public void setEssence(boolean essence) {
        this.essence = essence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
