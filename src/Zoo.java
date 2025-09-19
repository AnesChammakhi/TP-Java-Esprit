public class Zoo {
    Animal[] animals;
    String name,city;
    int nbrCages;
    int i=0;

    public Zoo(String name,String city,int nbrCages){
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void Ajout (Animal X){
        if (i < this.nbrCages) {
            this.animals[i] = X;
            i++;
            System.out.println(X.name + " added to the zoo");
        } else {
            System.out.println("Zoo is full cannot add more animals");
        }
    }
    public String toString(){
        return name+" "+city+" "+nbrCages;
    }
}
