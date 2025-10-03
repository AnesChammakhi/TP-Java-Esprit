package main;

import entities.Animal;
import entities.Zoo;

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

        }
    }
}



