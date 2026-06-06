package gestion-Biblioth-que-UK;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Livre> listeLivres;

    public Stock() {
        // Initialisation explicite ici pour bloquer tout crash "NullPointerException"
        this.listeLivres = new ArrayList<>();
    }

    public void ajouter(Livre livre) {
        this.listeLivres.add(livre);
    }

    public List<Livre> getListeLivres() {
        return this.listeLivres;
    }

    public Livre chercherParTitre(String titre) {
        for (Livre livre : listeLivres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                return livre;
            }
        }
        return null; 
    }
}
