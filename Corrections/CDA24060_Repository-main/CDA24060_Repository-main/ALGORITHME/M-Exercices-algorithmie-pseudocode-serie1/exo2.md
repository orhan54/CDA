# Exercice 2

> Ecrivez un algorithme en pseudo code permettant le calcul de la factorielle d'un entier X

## Version TANTQUE

```bash
Programme factorielle

    // Bloc déclaration
    Variable valeurSaisie : entier
    Variable resultat : entier
    Variable compteur : entier

    DEBUT
        // initialisation de nos variables
        resultat := 1

        // Lecture de la saisie
        valeurSaisie := lireEntier()
        
        compteur := valeurSaisie

        SI (valeurSaisie = 0 OU valeurSaisie = 1) ALORS
            écrire ("La factorielle de ", valeurSaisie, " est : ", resultat)
        SINON
            TANTQUE (compteur > 1) FAIRE
                resultat := resultat * compteur
                compteur := compteur - 1
            FINTANTQUE
            écrire ("La factorielle de ", valeurSaisie, " est : ", resultat)
        FINSI
    FIN
```

## Version REPETER
```bash
Programme factorielle

    // Bloc déclaration
    Variable valeurSaisie : entier
    Variable resultat : entier
    Variable compteur : entier

    DEBUT
        // initialisation de nos variables
        resultat := 1

        // Lecture de la saisie
        valeurSaisie := lireEntier()
        
        compteur := valeurSaisie

        SI (valeurSaisie = 0 OU valeurSaisie = 1) ALORS
            écrire ("La factorielle de ", valeurSaisie, " est : ", resultat)
        SINON
            REPETER
                resultat := resultat * compteur
                compteur := compteur - 1
            JUSQU'A (compteur = 1)
            écrire ("La factorielle de ", valeurSaisie, " est : ", resultat)
        FINSI
    FIN
```

## Version POUR
```bash
Programme factorielle

    // Bloc déclaration
    Variable valeurSaisie : entier
    Variable resultat : entier
    Variable compteur : entier

    DEBUT
        // initialisation de nos variables
        resultat := 1

        // Lecture de la saisie
        valeurSaisie := lireEntier()
        
        compteur := valeurSaisie

        SI (valeurSaisie = 0 OU valeurSaisie = 1) ALORS
            écrire ("La factorielle de ", valeurSaisie, " est : ", resultat)
        SINON
            POUR compteur allant de valeurSaisie à 1 FAIRE
                resultat := resultat * compteur
                compteur := compteur - 1
            FIN POUR
            écrire ("La factorielle de ", valeurSaisie, " est : ", resultat)
        FINSI
    FIN
```