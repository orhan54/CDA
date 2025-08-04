## Exercice 3

> Ecrivez un algorithme en pseudocode permettant la résolution d'une équation du second degré ax² + bx + c = 0.

```bash
Programme EquationSecondDegre


    Variable a : entier
    Variable b : entier
    Variable c : entier
    Variabledelta : réel
    Variableresultat : réel
    
    Début
        écrire ("Saisir la valeur de a :")
        a := lireEntier()
        écrire ("Saisir la valeur de b :")
        b := lireEntier()
        écrire ("Saisir la valeur de c :")
        c := lireEntier()
        
        delta := (b*b) – (4*a*c)
        
        Si (delta < 0) Alors
            écrire (" Il n’y a pas de solution pour cette équation ")
        Sinon
            Si (delta = 0) Alors
                resultat := -b/(2*a)
                écrire (" Il y a une solution double pour cette équation : ")
                écrire (resultat)
            Sinon
                écrire (" Il y a 2 solutions pour cette équation : ")
                écrire (-b + (√delta/2*a))
                écrire (-b - (√delta/2*a))
            Finsi
        Finsi
    Fin
```