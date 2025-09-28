public class Zoo {
    Animal[] animals;
    String name,city;
    final int nbrCages = 25;
    int i=0;
    public Zoo(String name,String city){
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
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

    public boolean addAnimal(Animal animal){
        if (animal == null) return false;
        if (searchAnimal(animal) != -1) {
            System.out.println(animal.name+" already exists in the zoo");
            return false;
        }
        if (i < this.nbrCages) {
            this.animals[i] = animal;
            i++;
            System.out.println(animal.name + " added to the zoo");
            return true;
        } else {
            System.out.println("Zoo is full cannot add more animals");
            return false;
        }
    }

    public void afficherAnimals() {
        for (int k = 0; k < i; k++) {
            System.out.println(animals[k]);
        }
    }
    public int searchAnimal(Animal animal){
        for (int k = 0; k < i; k++) {
            if (animals[k].equals(animal)) {
                return k;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
            for (int k = 0; k < i; k++) {
                if( animals[k].equals(animal)){ //l9ineh
                    for(int j=k ; j< i-1; j++){
                        animals[j]=animals[j+1];
                    }
                    animals[i-1]=null;
                    i--;
                    return true;
                }
            }
            return false;
    }
    public boolean isZooFull(){
        return i==nbrCages;

    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.i >= z2.i){
            return z1;
        }
        else return z2;
    }



}
