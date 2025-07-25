<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="SI (j &lt; 21) ALORS"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" epaisseurPoint="2" maxBoucle="500000" arrondiAuto="vrai" totalAffichages="1000" totalBoucles="5000000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="x EST_DU_TYPE NOMBRE" code="1#NOMBRE#x"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="j EST_DU_TYPE NOMBRE" code="1#NOMBRE#j"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;1er Opérande de 1 à 10 :&quot;" code="4#1er Opérande de 1 à 10 :#0"/>
        <item algoitem="LIRE x" code="2#x#pasliste"/>
        <item algoitem="i PREND_LA_VALEUR 1" code="5#i#1#pasliste"/>
        <item algoitem="TANT_QUE (x&lt;0 OU x>10) FAIRE" code="15#x&lt;0 OU x>10">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot;Saisir une valeur entre 1 et 10 :&quot;" code="4#Saisir une valeur entre 1 et 10 :#0"/>
            <item algoitem="LIRE x" code="2#x#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="POUR j ALLANT_DE 1 A 20" code="12#j#1#20">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="SI (j &lt; 21) ALORS" code="6#j &lt; 21">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;  &quot;" code="4#  #1"/>
                <item algoitem="POUR i ALLANT_DE 1 A x" code="12#i#1#x">
                    <item algoitem="DEBUT_POUR" code="13#debutpour"/>
                    <item algoitem="AFFICHER &quot; |&quot;" code="4# |#0"/>
                    <item algoitem="AFFICHERCALCUL i *  j" code="20#i *  j#0"/>
                    <item algoitem="AFFICHER &quot; |&quot;" code="4# |#0"/>
                    <item algoitem="FIN_POUR" code="14#finpour"/>
                </item>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
