package TD.org.example;

import TD.model.Client;
import TD.model.Compte;
import TD.service.BanqueService;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Compte compte1 = new Compte(967421, 10000,new Client("AZIZ", "Manu"));
        Compte compte2 = new Compte(968902, 3000, new Client("MALA", "Emma") );

        System.out.print("BIENVENUE CHER CLIENT. VEUILLEZ CREER UN COMPTE\nNom : ");
        String nom = sc.nextLine();

        System.out.print("Prénom : ");
        String prenom = sc.nextLine();

        Compte compteCree = new Compte(964230,(Math.random()*1000)+1000,new Client(nom, prenom));

        List<Compte> listeComptes = new ArrayList<Compte>();
        listeComptes.add(compte1);
        listeComptes.add(compte2);
        listeComptes.add(compteCree);

        BanqueService service = new BanqueService();
        List<Compte> comptesTries = service.sortBySolde(listeComptes);
        System.out.println(comptesTries);

        service.sortBySolde(listeComptes);

    }
}