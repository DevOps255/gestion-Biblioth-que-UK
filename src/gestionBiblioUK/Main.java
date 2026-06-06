package gestionBiblioUK;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        ServicesFlux serviceFlux = new ServicesFlux(stock);
        Menu ihm = new Menu();
        
        int choix = 0;
        System.out.println("Bienvenue dans le gestionnaire de bibliothèque !");

        do {
            ihm.afficherMenuPrincipal();
            choix = ihm.lireChoix();

            switch (choix) {
                case 1:
                    String titre = ihm.lireChamp("\nEntrez le titre du livre : ");
                    String auteur = ihm.lireChamp("Entrez l'auteur du livre : ");
                    stock.ajouter(new Livre(titre, auteur));
                    System.out.println("-> Succès : Livre enregistré.");
                    break;

                case 2:
                    ihm.afficherLivresDisponibles(stock);
                    break;

                case 3:
                    String titreEmprunt = ihm.lireChamp("\nEntrez le titre du livre à emprunter : ");
                    serviceFlux.enregistrerEmprunt(titreEmprunt);
                    break;

                case 4:
                    String titreRetour = ihm.lireChamp("\nEntrez le titre du livre à retourner : ");
                    serviceFlux.enregistrerRetour(titreRetour);
                    break;

                case 5:
                    String cible = ihm.lireChamp("\nEntrez le titre du livre à modifier : ");
                    System.out.println("--- Laissez vide si vous ne voulez pas modifier le champ ---");
                    String nTitre = ihm.lireChamp("Nouveau titre : ");
                    String nAuteur = ihm.lireChamp("Nouvel auteur : ");
                    
                    LivreModifier modifs = new LivreModifier(nTitre, nAuteur);
                    serviceFlux.enregistrerModification(cible, modifs);
                    break;

                case 6:
                    System.out.println("\nMerci d'avoir utilisé le programme. Au revoir !");
                    ihm.fermer();
                    break;

                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }

        } while (choix != 6);
    }
}