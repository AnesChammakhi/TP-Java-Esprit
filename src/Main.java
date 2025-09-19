public class Main {
    public static void main(String[] args) {
        //sou heya nafsha system out printf
        Animal A1= new Animal("lion","labowbow",8,false);
        Zoo Z1=new Zoo("myZoo","Tunis",25);
        Z1.Ajout(A1);
        System.out.println(Z1);
        System.out.println(A1);

    }
}
