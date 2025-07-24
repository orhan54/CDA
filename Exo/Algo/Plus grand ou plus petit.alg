<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Bravo la valeur est : &quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2lignes="" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" epaisseurLigne="2" epaisseurPoint="2" totalBoucles="5000000" maxBoucle="500000" totalAffichages="1000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#saisie" algoitem="saisie EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Entrez une valeur :#0" algoitem="AFFICHER &quot;Entrez une valeur :&quot;"/>
        <item code="2#saisie#pasliste" algoitem="LIRE saisie"/>
        <item code="15#saisie &lt; 10 OU saisie>20" algoitem="TANT_QUE (saisie &lt; 10 OU saisie>20) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="6#saisie &lt; 10" algoitem="SI (saisie &lt; 10) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="4#Plus grand   =(#1" algoitem="AFFICHER &quot;Plus grand   =(&quot;"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="6#saisie > 20" algoitem="SI (saisie > 20) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="4#Plus petit  =(#1" algoitem="AFFICHER &quot;Plus petit  =(&quot;"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="4#Retente ta chance !!#1" algoitem="AFFICHER &quot;Retente ta chance !!&quot;"/>
            <item code="2#saisie#pasliste" algoitem="LIRE saisie"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#Bravo la valeur est : #0" algoitem="AFFICHER &quot;Bravo la valeur est : &quot;"/>
        <item code="3#saisie#1#pasliste" algoitem="AFFICHER saisie"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
