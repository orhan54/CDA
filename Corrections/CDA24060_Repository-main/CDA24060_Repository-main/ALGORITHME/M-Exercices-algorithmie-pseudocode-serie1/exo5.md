# Exercice 5

> Ecrivez un algorithme en pseudocode permettant la recherche dichotomique d'une variable entière X dans un tableau d'entiers TabEntiers de taille TAILLE_MAX déjà trié

```bash
Programme RechercheDichotomique
// Ce programme effectue une recherche dichotomique, dans un tableau d’entiers déjà trié.
// Si l’entier recherché est trouvé, on affiche le rang où il se trouve dans le tableau, 
// sinon on indique que l’entier n’existe pas dans le tableau.


    fonction rechercherEntier (tab : tabent, x : entier) : entier
    // Cette fonction recherche la valeur de x dans le tableau tab et retourne sa position.
    // Si y n’existe pas, la fonction retourne -1
    
    Variable indiceBas : entier
    Variable indiceHaut : entier
    Variable indiceMilieu : entier
    Variable trouvé : booléen

    Début
        indiceBas := 0
        indiceHaut := tab.taille – 1
        indiceMilieu := (indiceBas + indiceHaut)/2
        trouvé := faux

        tantque (trouvé = faux ET indiceBas <= indiceHaut) faire
            Si (y < tab[indiceMilieu]) Alors
                indiceHaut := indiceMilieu - 1
            Sinon 
                Si (y > tab[indiceMilieu]) Alors
                    indiceBas := indiceMilieu +1
                Sinon 
                    trouvé := true
                Finsi
            Finsi
            indiceMilieu := (indiceBas + indiceHaut) / 2
        fintantque

        Si (trouvé = vrai) Alors
            retourner (indiceMilieu)
        Sinon
            retourner (-1)
        Finsi
    fin   

    type tabent = tableau[10] de entier // Création du type tabent
    Variable x : entier
    Variable position: entier
    Variable resultat : entier
    Variable tabEntiers : tabent

    Début
        tabEntiers = {-2, -1, 0, 13, 24, 37, 44, 56, 99, 117} // Tableau trié

        écrire (« Veuillez saisir la valeur de X à rechercher dans le tableau »)
        x := lireEntier()

        position = rechercherEntier(tabEntiers, x)

        Si (position == -1) Alors
            écrire(" x n’existe pas dans le tableau ")
        Sinon
            écrire(" x se trouve à la position ", position, "dans le tableau ")
        Fin
    Fin
```