import java.util.*;

public class AffectationHashMap {

    private HashMap<Employe, Departement> map = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (map.containsKey(e)) {
            System.out.println("employe existe!" + map.get(e));
        } else {
            map.put(e, d);
        }
    }
    public void afficherEmployesEtDepartements() {
        if (map.isEmpty()) {
            System.out.println("Aucune affectation.");
            return;
        }
        for (Map.Entry<Employe, Departement> x : map.entrySet()) {
            System.out.println("Employe:" + x.getKey() + " Departement:" + x.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        } else {
            System.out.println(" Aucune affectation trouvee");
        }
    }

    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(map);
    }
}
