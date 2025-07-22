<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="TANT_QUE (i &lt;= X) FAIRE" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" nbDecimales="8" maxBoucle="500000" totalAffichages="1000" epaisseurLigne="2" arrondiAuto="vrai" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="X EST_DU_TYPE NOMBRE" code="1#NOMBRE#X"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="resultat EST_DU_TYPE NOMBRE" code="1#NOMBRE#resultat"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE X" code="2#X#pasliste"/>
        <item algoitem="i PREND_LA_VALEUR 1" code="5#i#1#pasliste"/>
        <item algoitem="SI (X &lt;= 0) ALORS" code="6#X &lt;= 0">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;saisir un nombre positif&quot;" code="4#saisir un nombre positif#0"/>
            <item algoitem="LIRE X" code="2#X#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="TANT_QUE (i &lt;= X) FAIRE" code="15#i &lt;= X">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="resultat PREND_LA_VALEUR i * X" code="5#resultat#i * X#pasliste"/>
            <item algoitem="AFFICHER resultat" code="3#resultat#0#pasliste"/>
            <item algoitem="i PREND_LA_VALEUR i+1" code="5#i#i+1#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
