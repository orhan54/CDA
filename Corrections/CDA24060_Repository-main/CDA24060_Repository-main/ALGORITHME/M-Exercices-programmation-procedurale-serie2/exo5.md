# Exercice 5

> Ecrivez un algorithme en pseudocode permettant de réaliser une calculatrice pour les 4 opérations arithmétiques suivantes : + , - , * , / .

```bash
Programme calculatrice

    operateur : Caractère
    operande1 : Reel
    operande2 : Reel
    resultat : Reel
    continuer : Booléen

    Fonction calculer(operateur : Caractère, operande1 : Reel, operande2 : Reel) : Reel
        resultat : Reel

        Selon operateur
            Cas '+'
                resultat <- operande1 + operande2
            Cas '-'
                resultat <- operande1 - operande2
            Cas '*'
                resultat <- operande1 * operande2
            Cas '/'
                Si operande2 = 0 Alors
                    Afficher "Erreur : Division par zéro."
                    Retourner 0
                Sinon
                    resultat <- operande1 / operande2
                Fin Si
        Fin Selon

        Retourner resultat
    Fin Fonction

    Debut
        continuer <- Vrai

        Tant que continuer Faire
            // Afficher le menu et obtenir l'opération
            Afficher "Choisissez une opération : +, -, *, /"
            operateur <- valeur_entrée_par_utilisateur

            // Vérifier que l'opérateur est valide
            Si operateur n'est pas dans ['+', '-', '*', '/'] Alors
                Afficher "Opérateur invalide. Veuillez entrer un opérateur valide."
                Continuer
            Fin Si

            // Saisie des opérandes
            Afficher "Entrez le premier opérande (nombre réel) : "
            operande1 <- valeur_entrée_par_utilisateur

            Afficher "Entrez le second opérande (nombre réel) : "
            operande2 <- valeur_entrée_par_utilisateur

            // Calculer le résultat
            resultat <- calculer(operateur, operande1, operande2)

            // Afficher le résultat
            Afficher "Le résultat de ", operande1, " ", operateur, " ", operande2, " est : ", resultat

            // Demander si l'utilisateur souhaite continuer
            Afficher "Souhaitez-vous effectuer un autre calcul ? (Oui/Non)"
            réponse <- valeur_entrée_par_utilisateur
            Si réponse != "Oui" Alors
                continuer <- Faux
            Fin Si
        Fin Tant que
    Fin
```