<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="resultat PREND_LA_VALEUR i * X"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2para="" F2defaut="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" totalBoucles="5000000" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" maxBoucle="500000" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#X" algoitem="X EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#resultat" algoitem="resultat EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="2#X#pasliste" algoitem="LIRE X"/>
        <item code="5#i#1#pasliste" algoitem="i PREND_LA_VALEUR 1"/>
        <item code="6#X &lt;= 0" algoitem="SI (X &lt;= 0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#saisir un nombre positif#0" algoitem="AFFICHER &quot;saisir un nombre positif&quot;"/>
            <item code="2#X#pasliste" algoitem="LIRE X"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#X > 0" algoitem="SI (X > 0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="12#i#1#X" algoitem="POUR i ALLANT_DE 1 A X">
                <item code="13#debutpour" algoitem="DEBUT_POUR"/>
                <item code="5#resultat#i * X#pasliste" algoitem="resultat PREND_LA_VALEUR i * X"/>
                <item code="3#resultat#0#pasliste" algoitem="AFFICHER resultat"/>
                <item code="14#finpour" algoitem="FIN_POUR"/>
            </item>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
