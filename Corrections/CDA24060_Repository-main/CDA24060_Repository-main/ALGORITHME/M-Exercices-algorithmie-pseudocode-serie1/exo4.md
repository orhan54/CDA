# Exercice 4

> Ecrivez un algorithme en pseudo code permettant le calcul d'un nombre X élevé à la puissance Y

```bash
Programme CalculPuissance
// Ce programme calcule et affiche X puissance Y.

    fonction puissance (x : entier, y : entier) : entier
    // Cette fonction calcule et retourne x élevé à la puissance y.
    Variable compteur : entier
    Variable resultat : entier
    
    Début
        compteur :=1
        resultat :=1
        
        tantque (compteur <= y) faire
            resultat := resultat * x
            compteur := compteur + 1
        fintantque
        retourner (resultat)
    Fin

    Variable x : entier
    Variable y : entier
    resultat : entier

    Début
        écrire ("Saisir la valeur de x : ")
        x := lireEntier()

        écrire ("Saisir la valeur de y : ")
        y := lireEntier()

        Si (y=0) Alors
            écrire ("Le résultat est 1")
        Sinon
            Si (x=0) Alors
                écrire ("Le résultat est 0")
            Sinon
                resultat := puissance (x,y)
                écrire ("Le résultat est ", resultat)
            Finsi
        Finsi
    Fin
```