package gestionBiblioUK;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void afficherMenuPrincipal() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Ajouter un livre");
        System.out.println("2. Rechercher  les livres disponibles");
        System.out.println("3. Emprunter un livre");
        System.out.println("4. Retourner un livre");
        System.out.println("5. Modifier un livre");
        System.out.println("6. Quitter le programme");
        System.out.print("Votre choix : ");
    }

    public int lireChoix() {
        if (scanner.hasNextInt()) {
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme le retour à la ligne restant (\n)
            return choix;
        } else {
            scanner.nextLine(); // Vide le tampon en cas de saisie de texte incorrecte
            return -1; 
        }
    }

    public String lireChamp(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public void afficherLivresDisponibles(Stock stock) {
        System.out.println("\n=== LISTE DES LIVRES DISPONIBLES ===");
        boolean aucunLivre = true;
        
        for (Livre livre : stock.getListeLivres()) {
            if (livre.isDisponible()) {
                System.out.println("- " + livre);
                aucunLivre = false;
            }
        }
        
        if (aucunLivre) {
            System.out.println("Aucun livre n'est disponible actuellement.");
        }
        System.out.println("=====================================");
    }

    public void fermer() {
        scanner.close();
    }
}
