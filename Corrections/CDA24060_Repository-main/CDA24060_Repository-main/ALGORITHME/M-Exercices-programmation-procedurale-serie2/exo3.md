# Exercice 3

> Ecrivez un algorithme en pseudocode permettant dans le module principal la saisie de TAILLE_MAX valeurs entières négatives, positives ou nulles au sein d’une boucle.

```bash
Procédure RemplissageEtAnalyse

    tableauEntiers[TAILLE_MAX] : Entier
    nombrePositifs : entier
    sommePositifs : entier
    nombreNegatifs : entier
    sommeNegatifs : entier
    nombreNuls : entier
    moyennePositifs : entier
    moyenneNegatifs : entier

    Procédure afficherTableau(tableau)
        Pour i de 0 à longueur(tableau) - 1
            Afficher tableau[i]
        Fin Pour
    Fin Procédure

    Procédure analyserTableau(tableau)
        nombrePositifs <- 0
        sommePositifs <- 0
        nombreNegatifs <- 0
        sommeNegatifs <- 0
        nombreNuls <- 0

        Pour i de 0 à longueur(tableau) - 1
            Si tableau[i] > 0 Alors
                nombrePositifs <- nombrePositifs + 1
                sommePositifs <- sommePositifs + tableau[i]
            Sinon Si tableau[i] < 0 Alors
                nombreNegatifs <- nombreNegatifs + 1
                sommeNegatifs <- sommeNegatifs + tableau[i]
            Sinon
                nombreNuls <- nombreNuls + 1
            Fin Si
        Fin Pour

        // Calculer les moyennes
        Si nombrePositifs > 0 Alors
            moyennePositifs <- sommePositifs / nombrePositifs
        Sinon
            moyennePositifs <- 0
        Fin Si

        Si nombreNegatifs > 0 Alors
            moyenneNegatifs <- sommeNegatifs / nombreNegatifs
        Sinon
            moyenneNegatifs <- 0
        Fin Si

        // Afficher les résultats
        Afficher "Nombre d'entiers positifs : ", nombrePositifs, " Moyenne : ", moyennePositifs
        Afficher "Nombre d'entiers négatifs : ", nombreNegatifs, " Moyenne : ", moyenneNegatifs
        Afficher "Nombre de valeurs nulles : ", nombreNuls
    Fin Procédure

    Début
        TAILLE_MAX <- 10 

        // Saisie des valeurs par l'utilisateur
        Pour i de 0 à TAILLE_MAX - 1
            Afficher "Entrez un entier (positif, négatif ou nul) : "
            tableauEntiers[i] <- valeur_entrée_par_utilisateur
        Fin Pour

        // Afficher le tableau
        afficherTableauBoiteMessage(tableauEntiers)

        // Analyser le tableau
        analyserTableau(tableauEntiers)
    Fin
```