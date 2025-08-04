# Exercice 1

> Ecrivez un algorithme en pseudocode permettant le calcul de la somme des N premiers nombres entiers.

## Version TantQue

```bash
Programme PremiersNombresEntiers

    // Bloc déclaration
    Variable valeurSaisie : entier
    Variable resultat : entier
    Variable compteur : entier

    Début
        // initialisation de nos variables
        resultat := 0
        compteur := 1

        // Lecture de la saisie
        valeurSaisie := lireEntier()
        
        // Parcours et calcul
        TANTQUE (compteur <= valeurSaisie) FAIRE
            resultat := resultat + compteur
            compteur := compteur + 1
        FINTANTQUE

        écrire("Le résultat avec tantque est : ", resultat)
    Fin

```

## Version Repeter
```bash
Programme PremiersNombresEntiers

    // Bloc déclaration
    Variable valeurSaisie : entier
    Variable resultat : entier
    Variable compteur : entier

    Début
        // initialisation de nos variables
        resultat := 0
        compteur := 1

        // Lecture de la saisie
        valeurSaisie := lireEntier()
        
        // Parcours et calcul
        REPETER
            resultat := resultat + compteur
            compteur := compteur + 1
        JUSQU'A compteur > valeurSaisie

        écrire("Le résultat avec tantque est : ", resultat)
    Fin
```
## Version Pour
```bash
Programme PremiersNombresEntiers

    // Bloc déclaration
    Variable valeurSaisie : entier
    Variable resultat : entier
    Variable compteur : entier

    Début
        // initialisation de nos variables
        resultat := 0

        // Lecture de la saisie
        valeurSaisie := lireEntier()
        
        // Parcours et calcul
        POUR compteur allant de 1 à valeurSaisie FAIRE
            resultat := resultat + compteur
            compteur := compteur + 1
        FINPOUR

        écrire("Le résultat avec tantque est : ", resultat)
    Fin
```
