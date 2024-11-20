package TD.service;

import TD.model.Compte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BanqueService {

    public List<Compte> sortBySolde(List<Compte> comptes) {
        List<Compte> comptesTries = new ArrayList<>(comptes);
        Collections.sort(comptesTries);
        return comptesTries;
    }

}
