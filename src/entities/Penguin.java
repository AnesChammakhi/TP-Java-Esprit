package entities;

public final class Penguin extends Aquatic {
    protected float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal, String habitat , float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return (super.toString() +" swimmingDepth: "+ this.swimmingDepth);

    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }


    public void swim(){
        System.out.println("This penguin is swimming.");
    }
}
