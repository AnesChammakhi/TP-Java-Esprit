import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> departements = new HashSet();
    Iterator<Departement> it= departements.iterator();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> dep = new ArrayList<Departement>();
        Collections.sort(dep);
        for( Departement d : dep) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> dep = new ArrayList<>(departements);
        Collections.sort(dep, new DepartementNomEmployesComparator());
        for (Departement d : dep) {
            System.out.println(d);
        }    }
}
