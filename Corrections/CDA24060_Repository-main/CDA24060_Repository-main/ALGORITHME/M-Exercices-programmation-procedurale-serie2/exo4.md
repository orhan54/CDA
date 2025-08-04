# Exercice 4

> Ecrivez un algorithme en pseudocode permettant le rangement, dans un tableau «TabMultiplication», des tables de multiplication de 1x1 jusqu’à 9x9.


```bash
Programme tableMultiplication

    Constante LIGNES <- 10
    Constante COLONNES <- 10

    Début
        Déclarer TabMultiplication[LIGNES][COLONNES] : Entier
        Déclarer continuer : Booléen

        // Remplir le tableau avec les tables de multiplication
        Pour i de 1 à LIGNES - 1
            Pour j de 1 à COLONNES - 1
                TabMultiplication[i][j] <- i * j
            Fin Pour
        Fin Pour

        continuer <- Vrai

        Tant que continuer Faire
            X <- 0
            Y <- 0

            // Saisie de X
            Répéter
                Afficher "Entrez un entier X entre 1 et 9 : "
                Si valeur_entrée_par_utilisateur est un entier Alors
                    X <- valeur_entrée_par_utilisateur
                Sinon
                    Afficher "Veuillez entrer un entier."
                Fin Si
            Jusqu'à X >= 1 et X <= 9

            // Saisie de Y
            Répéter
                Afficher "Entrez un entier Y entre 1 et 9 : "
                Si valeur_entrée_par_utilisateur est un entier Alors
                    Y <- valeur_entrée_par_utilisateur
                Sinon
                    Afficher "Veuillez entrer un entier."
                Fin Si
            Jusqu'à Y >= 1 et Y <= 9

            // Afficher le produit
            PRODUIT <- TabMultiplication[X][Y]
            Afficher "Le résultat de ", X, " x ", Y, " est ", PRODUIT

            // Demander si l'utilisateur souhaite continuer
            Afficher "Souhaitez-vous encore un calcul ? (Oui/Non)"
            réponse <- valeur_entrée_par_utilisateur
            Si réponse != "Oui" Alors
                continuer <- Faux
            Fin Si
        Fin Tant que
    Fin Module
```