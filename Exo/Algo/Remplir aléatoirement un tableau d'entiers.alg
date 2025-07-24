<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER tab[i]" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2lignes="" F2para="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" arrondiAuto="vrai" totalBoucles="5000000" totalAffichages="1000" maxBoucle="500000" nbDecimales="8" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#LISTE#tab" algoitem="tab EST_DU_TYPE LISTE"/>
        <item code="1#NOMBRE#tempo" algoitem="tempo EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="12#i#0#14" algoitem="POUR i ALLANT_DE 0 A 14">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#tab#ALGOBOX_ALEA_ENT(0,100)#i" algoitem="tab[i] PREND_LA_VALEUR ALGOBOX_ALEA_ENT(0,100)"/>
            <item code="3#tab#1#i" algoitem="AFFICHER tab[i]"/>
            <item code="6#tempo &lt; tab[i]" algoitem="SI (tempo &lt; tab[i]) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#tempo#tab[i]#pasliste" algoitem="tempo PREND_LA_VALEUR tab[i]"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="4#L'entier maxi dans le tableau est #0" algoitem="AFFICHER &quot;L'entier maxi dans le tableau est &quot;"/>
        <item code="3#tempo#1#pasliste" algoitem="AFFICHER tempo"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
