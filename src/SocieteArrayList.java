import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SocieteArrayList implements IGestion<Employe>,IRechercheAvancee<Employe>{

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
        for (int i = 0; i < Employes.size() - 1; i++) {
            for (int j = 0; j < Employes.size() - 1 - i; j++) {
                if (Employes.get(j).getId() > Employes.get(j + 1).getId()) {
                    Employe temp = Employes.get(j);
                    Employes.set(j, Employes.get(j + 1));
                    Employes.set(j + 1, temp);
                }
            }
        }


    }
    @Override
    public void trierEmployeParNomDépartementEtGrade() {

            for (int i = 0; i < Employes.size() - 1; i++) {
                for (int j = 0; j < Employes.size() - 1 - i; j++) {
                    Employe e1 = Employes.get(j);
                    Employe e2 = Employes.get(j + 1);

                    if (e1.getNom().compareTo(e2.getNom()) > 0 ||
                        (e1.getNom().compareTo(e2.getNom()) == 0 && e1.getNomDepartement().compareTo(e2.getNomDepartement()) > 0) ||
                        (e1.getNom().compareTo(e2.getNom()) == 0 && e1.getNomDepartement().compareTo(e2.getNomDepartement()) == 0 && e1.getGrade() > e2.getGrade()))
                    {
                            Employes.set(j, e2);
                            Employes.set(j + 1, e1);
                    }
                }
            }


    }


    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();

        for (Employe e : Employes) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                resultat.add(e);
            }
        }

        return resultat;
    }

}
