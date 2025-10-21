package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float v) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth; // n7trm khedmtik kif ma heya
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
