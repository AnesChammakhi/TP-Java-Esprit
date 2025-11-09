public class Employe {

    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employe() {

    }

    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        return ((Employe) obj).nom.equals(this.nom);

    }
    @Override
    public String toString() {
        return id+" "+nom+" "+prenom+" "+nomDepartement+" "+grade;
    }
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
     this.prenom = prenom;
    }
}

