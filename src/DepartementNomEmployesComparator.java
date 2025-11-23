import java.util.Comparator;

public class DepartementNomEmployesComparator implements Comparator<Departement> {
    @Override
    public int compare(Departement d1,Departement d2){
        int x= d1.getNomDepartement().compareTo(d2.getNomDepartement());
        if(x!=0){
            return x;
        }

        return Integer.compare(d1.getNombreEmployes(),d2.getNombreEmployes());

    }
}
