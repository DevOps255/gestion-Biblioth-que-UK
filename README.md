# gestion-Biblio-UK

# #️⃣ Global - Système de Gestion de Bibliothèque Interactif

## 📝 Présentation du Projet
Ce dépôt centralisé héberge l'application console Java développée en équipe (5 collaborateurs) permettant de gérer les flux, les modifications et le stock d'une bibliothèque universitaire. 

L'application applique une architecture modulaire stricte basée sur la séparation des responsabilités pour fluidifier le travail collaboratif, isoler les tâches de chaque développeur et éviter les conflits de fusion.

---

## 🛠️ Architecture du Code & Répartition de l'Équipe

Le projet est structuré au sein du package `gestionBiblioUK` avec les rôles suivants :

1. **`Livre.java`** : Modèle de données encapsulant les propriétés d'un ouvrage (titre, auteur, statut de disponibilité).
2. **`LivreModifier.java`** : Classe technique de transfert de données (DTO) dédiée à l'isolation des requêtes de modification.
3. **`Stock.java`** : Gestionnaire de base de données en mémoire (`List<Livre>`) doté d'une initialisation sécurisée contre les erreurs de pointeur nul (`NullPointerException`).
4. **`ServicesFlux.java`** : Module logique métier orchestrant la validation des flux applicatifs (emprunts, retours et modifications d'ouvrages).
5. **`Menu.java`** : Interface utilisateur textuelle gérant l'affichage des menus et la capture robuste des entrées via la console.
6. **`Main.java`** : Point d'entrée principal initialisant l'application et injectant les dépendances entre chaque composant.

---

## 🚀 Commandes d'Initialisation (Quick Setup)

Conformément à la configuration initiale du dépôt, voici les étapes de base exécutées sur la ligne de commande pour lier le projet local au serveur distant :

```bash
# Initialisation du dépôt local et premier commit de base
echo "# Global" >> README.md
git init
git add README.md
git commit -m "first commit"

# Configuration de la branche principale et du lien distant
git branch -M main
git remote add origin [https://github.com/DevOps255/gestion-Biblioth-que-UK.git](https://github.com/DevOps255/gestion-Biblioth-que-UK.git)
git push -u origin main
```


## 💻 Instructions d'Installation et d'Exécution

### Prérequis
* **Java JDK 8** ou une version supérieure installé sur votre machine.
* **Git** installé et configuré.

### Compilation et Lancement en Ligne de Commande
1. Ouvrez votre terminal (Git Bash recommandé) et clonez le dépôt :
```bash
   git clone [https://github.com/DevOps255/gestion-Biblioth-que-UK.git](https://github.com/DevOps255/gestion-Biblioth-que-UK.git)

