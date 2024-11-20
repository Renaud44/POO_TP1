package TD.model;

import java.awt.*;

public class Compte implements Comparable<Compte> {

    private int numeroCompte;
    private double solde;
    private Client client;

    public Compte(int numeroCompte, double solde, Client client) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.client = client;

    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }
    public int compareTo(Compte autreCompte) {
        return Double.compare(this.solde, autreCompte.solde);
    }

    public String toString() {
        return "Propriétaire du compte : "+ client.toString() + "\nNuméro de compte : "  + numeroCompte + " \nSolde : " + solde+"£\n\n";
    }

}
