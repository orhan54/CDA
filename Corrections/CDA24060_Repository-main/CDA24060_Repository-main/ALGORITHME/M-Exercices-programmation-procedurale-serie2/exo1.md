# Exercice 1

> Ecrivez un algorithme en pseudocode qui permet de remplir aléatoirement un tableau d’entiers de TAILLE éléments dans le module principal puis qui affiche la valeur entière maximum de ce tableau d’entiers.

```bash
Programme RemplirLireMaxEntier

    maxi : entier
    TAILLE : entier
    tableau[TAILLE] : Entier

    Fonction lireMaxTabEntiers(tableau)
        maxi <- tableau[0]
        Pour i de 0 à longueur(tableau)
            Si tableau[i] > maxi Alors
                maxi <- tableau[i]
            Fin Si
        Fin Pour
        Retourner maxi
    Fin Fonction

    Début
        TAILLE <- 10 

        // Remplir le tableau avec des valeurs aléatoires
        Pour i de 0 à TAILLE - 1
            tableau[i] <- nombre_aléatoire(0, 100) des entiers entre 0 et 100
        Fin Pour

        // Afficher le tableau
        Pour i de 0 à TAILLE - 1
            Afficher tableau[i]
        Fin Pour

        // Trouver et afficher la valeur maximale
        maxi <- lireMaxTabEntiers(tableau)
        Afficher "La valeur maximale dans le tableau est : ", maxi
    Fin
```