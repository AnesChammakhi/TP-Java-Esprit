import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        AffectationHashMap aff = new AffectationHashMap();
        DepartementHashSet dep = new DepartementHashSet();

        Employe e1 = new Employe(1, "Ali", "Ahmed", "Informatique", 3);
        Employe e2 = new Employe(2, "Sana", "Ben Ali", "RH", 2);
        Employe e3 = new Employe(3, "Mouna", "Trabelsi", "Finance", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        Departement d1 = new Departement(101, "Informatique", 20);
        Departement d2 = new Departement(102, "RH", 10);
        Departement d3 = new Departement(103, "Finance", 12);

        dep.ajouterDepartement(d1);
        dep.ajouterDepartement(d2);
        dep.ajouterDepartement(d3);


        aff.ajouterEmployeDepartement(e1, d1);
        aff.ajouterEmployeDepartement(e2, d2);
        aff.ajouterEmployeDepartement(e3, d3);

        societe.displayEmploye();

        dep.afficherDepartements();

        aff.afficherEmployesEtDepartements();
    }


}