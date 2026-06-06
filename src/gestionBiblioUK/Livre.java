package gestionBiblioUK;

public class Livre {


    private String titre;
    private String auteur;
    private boolean estDisponible;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.estDisponible = true; // Disponible par défaut
    }

    public String getTitre() { 
    	return titre;
    	}
    public String getAuteur() { 
    	return auteur;
    	}
    public boolean isDisponible() { 
    	return estDisponible;
    	}
    
    public void setDisponible(boolean estDisponible) { 
        this.estDisponible = estDisponible; 
    }

    public void setTitre(String titre) { 
        this.titre = titre; 
    }

    public void setAuteur(String auteur) { 
        this.auteur = auteur; 
    }

    @Override
    public String toString() {
        return "\"" + titre + "\" de " + auteur;
}
}
