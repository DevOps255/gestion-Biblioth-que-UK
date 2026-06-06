package gestionBiblioUK;

;

public class ServicesFlux {
    private Stock stock;

    public ServicesFlux (Stock stock) {
        this.stock = stock;
    }

    public void enregistrerEmprunt(String titre) {
        Livre livre = stock.chercherParTitre(titre);

        if (livre == null) {
            System.out.println("\n-> Erreur : Le livre \"" + titre + "\" n'existe pas.");
            return;
        }

        if (livre.isDisponible()) {
            livre.setDisponible(false);
            System.out.println("\n-> Succès : Vous avez emprunté " + livre);
            System.out.println("   [Rappel] À rembourser avant deux semaines.");
        } else {
            System.out.println("\n-> Erreur : Le livre \"" + titre + "\" est déjà emprunté.");
        }
    }

    public void enregistrerRetour(String titre) {
        Livre livre = stock.chercherParTitre(titre);

        if (livre == null) {
            System.out.println("\n-> Erreur : Le livre \"" + titre + "\" ne provient pas de cette bibliothèque.");
            return;
        }

        if (!livre.isDisponible()) {
            livre.setDisponible(true);
            System.out.println("\n-> Succès : Vous avez retourné " + livre);
        } else {
            System.out.println("\n-> Erreur : Ce livre est déjà indiqué comme disponible.");
        }
    }

    public void enregistrerModification(String titreActuel, LivreModifier modifications) {
        Livre livre = stock.chercherParTitre(titreActuel);

        if (livre == null) {
            System.out.println("\n-> Erreur : Le livre \"" + titreActuel + "\" n'existe pas.");
            return;
        }

        // Si la chaîne n'est pas vide après suppression des espaces blancs
        if (!modifications.getNouveauTitre().trim().isEmpty()) {
            livre.setTitre(modifications.getNouveauTitre());
        }
        if (!modifications.getNouvelAuteur().trim().isEmpty()) {
            livre.setAuteur(modifications.getNouvelAuteur());
        }

        System.out.println("\n-> Succès : Le livre a été modifié avec succès !");
        System.out.println("   Nouvelles informations : " + livre);
    }
}
