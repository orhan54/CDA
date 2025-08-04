# Exercice 6

> Ecrire un algorithme en pseudocode permettant le range ment dans un tableau d’entiers à deux dimensions « Tableau Factorielles » des 10 premiers entiers numériques et de leur factorielle respective.

```bash
Programme TableauFactorielles
// Ce programme range dans un tableau d’entiers à deux dimensions les entiers de 1 à 10 et leur factorielle respective.
    
    fonction CalculFactorielle(valeur :entier) 
        
        Variable resultat : entier

        Début   
            resultat := 1
            Pour indice allant de 1 à valeur faire
                resultat = resultat * indice
                indice := indice + 1
            FINPOUR
            retourner resultat
        Fin

    type tabent = tableau[10] de entier
    type matrice = tableau[2] de tabent
    
    Variable Variable indiceColonne = entier
    Variable x = entier
    Variable tableauFactorielles : matrice

    Début
        // Remplissage de la première ligne du tableau
        indiceColonne := 0
        
        tantque ( indiceColonne < 9 ) faire
            tableauFactorielles[0][indiceColonne] = indiceColonne + 1
            indiceColonne = indiceColonne + 1
        fintantque

        // Remplissage de la deuxième ligne du tableau
        indiceColonne := 0
        tantque ( indiceColonne < 9 ) faire
            tableauFactorielles[1][indiceColonne] = CalculFactorielle(indiceColonne + 1)
        fintantque

        écrire (" Pour quelle valeur entière souhaitez-vous calculer la factorielle ? ( entre 1 et 10 ) ")
        x := lireEntier()

        Si ( x <1 OU x > 10) Alors
            écrire(" x doit être compris entre 1 et 10 ")
        Sinon
            resultat := tableauFactorielles[1][x-1]
            écrire(" La factorielle de » , x , " est : ", resultat)
        Fin
    Fin
```