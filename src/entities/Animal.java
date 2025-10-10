package entities;

public sealed class Animal permits Aquatic,Terrestrial{
    private String family,name;
    private int age;
    private boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {

        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;}

    public String toString() {
        return family+" "+name+" "+age+" "+isMammal;
    }

    public int getAge() {
            return age;
    }
    public String getFamily() {
        return family;
    }
    public String getName() {
        return name;
    }
    public boolean getIsMammal() {
        return isMammal;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public void setIsMammal(boolean mammal) {
        isMammal = mammal;
    }
    public void setName(String name) {
        this.name = name;
    }

}
