package TD.model;

public class Client {

    private String nom;
    private String prenom;

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString(){
        return nom + " " + prenom;
    }
}
