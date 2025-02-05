package br.edu.unifei.ecot12.bleach;

public class Arrancar extends Hollow {
    private String awakenForm;

    public Arrancar(){
        setMaskIntegrity(false);
    }
    public String getAwakenForm() {
        return awakenForm;
    }

    public void setAwakenForm(String awakenForm) {
        this.awakenForm = awakenForm;
    }
}
