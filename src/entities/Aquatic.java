package entities;

public abstract sealed class Aquatic extends Animal permits Dolphin,Penguin {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public String toString() {
        return (super.toString() +" habitat: "+ this.habitat);
    }

    @Override
    public boolean equals(Object obj) {
        Aquatic other = (Aquatic) obj;

        return this.getName().equals(other.getName())
                && this.getAge() == other.getAge()
                && this.habitat.equals(other.habitat);
    }


}
