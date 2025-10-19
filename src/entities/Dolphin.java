package entities;

public final class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat,float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return (super.toString() +" swimmingSpeed: "+ this.swimmingSpeed);

    }

    public void swim(){
        System.out.println("This dolphin is swimming.");
    }

}
