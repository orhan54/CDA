# Exercice 2

> Ecrivez un algorithme en pseudocode permettant de remplir un tableau d’entiers dans le module principal puis, grâce à la fonction calculerMoyenne, de calculer et afficher la moyenne des valeurs entières de ce tableau d’entiers transmis en argument.

```bash
Programme RemplirEtMoyenne

    somme : entier
    tableau[TAILLE] : Entier
    TAILLE : entier

    Fonction calculerMoyenne(tableau)
        somme <- 0
        Pour i de 0 à longueur(tableau) - 1
            somme <- somme + tableau[i]
        Fin Pour
        moyenne <- somme / longueur(tableau)
        Retourner moyenne
    Fin Fonction

    Debut
        TAILLE <- 10 

        // Remplir le tableau avec des valeurs
        Pour i de 0 à TAILLE - 1
            tableau[i] <- valeur_entrée_par_utilisateur 
        Fin Pour

        // Afficher le tableau
        Pour i de 0 à TAILLE - 1
            Afficher tableau[i]
        Fin Pour

        // Calculer et afficher la moyenne
        moyenne <- calculerMoyenne(tableau)
        Afficher "La moyenne des valeurs dans le tableau est : ", moyenne
    Fin
```