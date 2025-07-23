<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;x et &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" arrondiAuto="vrai" epaisseurLigne="2" maxBoucle="500000" totalBoucles="5000000" totalAffichages="1000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#x" algoitem="x EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#y" algoitem="y EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#resultat" algoitem="resultat EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#saisir la valeur de x :#0" algoitem="AFFICHER &quot;saisir la valeur de x :&quot;"/>
        <item code="2#x#pasliste" algoitem="LIRE x"/>
        <item code="4#saisir le valeur de y :#0" algoitem="AFFICHER &quot;saisir le valeur de y :&quot;"/>
        <item code="2#y#pasliste" algoitem="LIRE y"/>
        <item code="6#x ET y &lt; 0" algoitem="SI (x ET y &lt; 0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#saisir des valeurs positifs !!#0" algoitem="AFFICHER &quot;saisir des valeurs positifs !!&quot;"/>
            <item code="2#x#pasliste" algoitem="LIRE x"/>
            <item code="2#y#pasliste" algoitem="LIRE y"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="5#resultat#pow(x,y)#pasliste" algoitem="resultat PREND_LA_VALEUR pow(x,y)"/>
                <item code="4#La puissance de #0" algoitem="AFFICHER &quot;La puissance de &quot;"/>
                <item code="3#x#0#pasliste" algoitem="AFFICHER x"/>
                <item code="4#x et #0" algoitem="AFFICHER &quot;x et &quot;"/>
                <item code="3#y#0#pasliste" algoitem="AFFICHER y"/>
                <item code="4#y est :  #0" algoitem="AFFICHER &quot;y est :  &quot;"/>
                <item code="3#resultat#0#pasliste" algoitem="AFFICHER resultat"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
