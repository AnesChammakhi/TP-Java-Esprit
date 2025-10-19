package main;

import entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter entities.Zoo name: ");
        String name = sc.next();
        System.out.print("Enter entities.Zoo city: ");
        String city = sc.next();
        if(name.isEmpty()){
            System.out.print("Enter entities.Zoo age: ");
            int age = sc.nextInt();
        }
        else{
            Zoo Z1 = new Zoo(name,city);
            Zoo Z2 = new Zoo("Carthage", "Tunis");
            //System.out.println(Z1);
            /**
             for (int i=0; i<28;i++){
             entities.Animal A1= new entities.Animal("lion","labowbow",i,false);
             boolean x=Z1.addAnimal(A1);
             if(x)
             System.out.println("animal added to "+Z1.name);
             else
             System.out.println("entities.Zoo is full cannot add more animals");

             }*/

            Animal A1= new Animal("lion","labowbow",5,true);
            Animal A2= new Animal("Monkey","Mibombo",3,false);
            Animal A3= new Animal("Monkey","Bobo",5,false);

            Z1.addAnimal(A1);
            Z1.addAnimal(A2);
            Z2.addAnimal(A3);

            System.out.println("****");
            Z1.afficherAnimals();
            System.out.println("****");

            int x = Z1.searchAnimal(A2);
            System.out.println("recherche: " + x);
            System.out.println("****");


            Zoo bigzoo = Zoo.comparerZoo(Z1, Z2);
            System.out.println("Le zoo avec le plus d'animaux est : " + bigzoo.getName());

            Terrestrial  terr = new Terrestrial("mouse ","Splinter",7,true,4);
            Dolphin dolphin = new Dolphin("dolphin","Porsche",2,true,"ocean",10);
            Penguin penguin = new Penguin("penguin","kawasaki",3,true,"ocean",5);
            Penguin penguin2 = new Penguin("penguin","krico",3,true,"ocean",7);

            System.out.println(penguin2);
            System.out.println(terr);
            System.out.println(dolphin);
            System.out.println(penguin);

            Z1.addAquaticAnimal(penguin2);
            Z1.addAquaticAnimal(dolphin);
            Z1.addAquaticAnimal(penguin);


            Z1.swimAll();
            Z1.displayNumberOfAquaticsByType();
            float depth=Z1.maxPenguinSwimmingDepth();
            System.out.println(depth);






        }
    }
}



