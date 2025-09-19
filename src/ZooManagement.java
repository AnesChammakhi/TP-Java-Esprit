public class ZooManagement {
    public class ZooManagment {
        int nbrCages;
        String zooName;

        public ZooManagment(int nbrCages, String zooName){
            this.nbrCages = nbrCages ;
            this.zooName = zooName;
        }

        public ZooManagment(){
            this.nbrCages = 20 ;
            this.zooName = "my zoo";
        }



        public String toString() {return zooName + " comporte " + nbrCages + " cages.";}
    }
}
