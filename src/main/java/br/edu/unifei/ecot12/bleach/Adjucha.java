package br.edu.unifei.ecot12.bleach;

public class Adjucha implements MenosGrande {

    private String animalForm;

    @Override
    public void change(Hollow h) {
        h.setMenosGrande(new VastoLorde());
    }

    public String getAnimalForm() {
        return animalForm;
    }

    public void setAnimalForm(String animalForm) {
        this.animalForm = animalForm;
    }

}
