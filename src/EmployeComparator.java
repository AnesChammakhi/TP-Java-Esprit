import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {

        int dep = e1.getNomDepartement().compareTo(e2.getNomDepartement());
        if (dep != 0) return dep;

        return Integer.compare(e1.getGrade(), e2.getGrade());
    }
}
