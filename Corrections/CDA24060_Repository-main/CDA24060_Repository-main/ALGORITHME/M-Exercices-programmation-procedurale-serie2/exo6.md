# Exercice 6

> Ecrivez un algorithme en pseudocode permettant de trier un tableau d’entiers.

```bash
Programme trieTableau

    Procédure afficherTableau(tableau)
        Pour i de 0 à longueur(tableau)-1
            Afficher tableau[i]
        Fin Pour
    Fin Procédure

    Procédure trierTableau(tableau, ordreCroissant)
        permuter : Booléen
        temp : Entier

        Répéter
            permuter <- Faux
            Pour i de 0 à longueur(tableau) - 2
                Si (ordreCroissant et tableau[i] > tableau[i + 1]) ou (non ordreCroissant et tableau[i] < tableau[i + 1]) Alors
                    temp <- tableau[i]
                    tableau[i] <- tableau[i + 1]
                    tableau[i + 1] <- temp
                    permuter <- Vrai
                Fin Si
            Fin Pour
        Jusqu'à non permuter
    Fin Procédure

    Debut
        Constante TAILLE <- 10
        Déclarer tableauEntiers[TAILLE] : Entier
        Déclarer ordreCroissant : Booléen

        // Remplir le tableau avec des valeurs aléatoires
        Pour i de 0 à TAILLE - 1
            tableauEntiers[i] <- nombre_aléatoire(-50, 50) // Par exemple, des entiers entre -50 et 50
        Fin Pour

        // Afficher le tableau non trié
        Afficher "Tableau non trié :"
        afficherTableau(tableauEntiers)

        // Demander l'ordre de tri
        Afficher "Voulez-vous trier le tableau dans l'ordre croissant ? (Oui/Non)"
        réponse <- valeur_entrée_par_utilisateur
        Si réponse = "Oui" Alors
            ordreCroissant <- Vrai
        Sinon
            ordreCroissant <- Faux
        Fin Si

        // Trier le tableau
        trierTableau(tableauEntiers, ordreCroissant)

        // Afficher le tableau trié
        Afficher "Tableau trié :"
        afficherTableau(tableauEntiers)
    Fin
```