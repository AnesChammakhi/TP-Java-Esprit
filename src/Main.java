import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        societe.ajouterEmploye(new Employe(1, "Amine","bejoaui", "Informatique", 3));
        societe.ajouterEmploye(new Employe(2, "Sara","ben sgh", "Comptabilité", 2));
        societe.ajouterEmploye(new Employe(3, "Anes","cham", "Informatique", 4));

        List<Employe> informaticiens = societe.rechercherParDepartement("Informatique");

        System.out.println("Employes du departement Informatique :");
        for (Employe e : informaticiens) {
            System.out.println(e);
        }
    }
}