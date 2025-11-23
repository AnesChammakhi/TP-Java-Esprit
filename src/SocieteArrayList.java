import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SocieteArrayList implements IGestion<Employe>,IRechercheAvancee<Employe>   {

    List <Employe> Employes=new ArrayList();
    @Override
    public void ajouterEmploye(Employe employe) {
        Employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
            for (Employe e: Employes){
                if(e.getNom().equals(nom)) return true;
            }
            return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return Employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        Employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : Employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
    Collections.sort(Employes);
        //Employes.sort(null); // null = use natural order (compareTo)

    }
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        //Employes.sort(new EmployeComparator());
        Collections.sort(Employes, new EmployeComparator());


    }


    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList();

        for (Employe e : Employes) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                resultat.add(e);
            }
        }

        return resultat;
    }

}
