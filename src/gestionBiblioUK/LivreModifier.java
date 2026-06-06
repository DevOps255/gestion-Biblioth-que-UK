package gestionBiblioUK;


public class LivreModifier {
    private String nouveauTitre;
    private String nouvelAuteur;

    public LivreModifier(String nouveauTitre, String nouvelAuteur) {
        this.nouveauTitre = nouveauTitre;
        this.nouvelAuteur = nouvelAuteur;
    }

    public String getNouveauTitre() { 
    	return nouveauTitre; 
    	}
    public String getNouvelAuteur() { 
    	return nouvelAuteur;
    	}
}