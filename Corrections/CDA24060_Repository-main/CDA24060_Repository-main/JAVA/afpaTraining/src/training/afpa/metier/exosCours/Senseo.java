package training.afpa.metier.exosCours;

/**
 * @author jboebion
 */
public class Senseo {

    // Déclaration des types et constantes
    enum Etat {
        FIXE,
        CLIGNOTANT
    }

    private static final int TASSE = 10; // 10 ml
    private static final int TEMPERATURE = 89; // température max de l'eau

    // Déclaration des variables
    private boolean active;
    private boolean choix1Cafe;
    private boolean choix2Cafe;
    private Etat voyant;
    private int temperatureEau;
    private int niveauEau;

    public Senseo() {
        // Initialisation des variables
        this.active = true; // La machine est en fonctionnement
        this.choix1Cafe = false; // Initialement, aucun choix de café
        this.choix2Cafe = false; // Initialement, aucun choix de café
        this.voyant = Etat.CLIGNOTANT; // Initialement, le voyant est clignotant
        this.temperatureEau = 0; // Température initiale de l'eau
        this.niveauEau = 0; // Niveau initial de l'eau
    }

    // Procédure pour chauffer l'eau
    private void chaufferEau() {
        while (temperatureEau < TEMPERATURE) {
            // Activer la résistance de la Senseo
            temperatureEau++;
            System.out.println("Chauffage de l'eau... Température actuelle: " + temperatureEau + "°C");
        }
        voyant = Etat.FIXE;
    }

    // Procédure pour ajouter de l'eau
    private void ajouterEau() {
        while (niveauEau < TASSE) {
            // Attendre que l'eau soit remise
            niveauEau += 10; // Ajout simulé de 10 ml d'eau
            System.out.println("Ajout d'eau... Niveau actuel: " + niveauEau + " ml");
        }
        voyant = Etat.FIXE;
    }

    // Procédure pour faire du café
    private void faireCafe(int compteur) {
        while (niveauEau >= TASSE) {
            switch (compteur) {
                case 1:
                    niveauEau -= TASSE;
                    break;
                case 2:
                    niveauEau -= (2 * TASSE);
                    break;
                default:
                    throw new IllegalArgumentException("Nombre de tasses invalide : " + compteur);
            }
            if (niveauEau < TASSE || temperatureEau < TEMPERATURE) {
                voyant = Etat.CLIGNOTANT;
                break;
            }
            System.out.println("Café préparé. Niveau d'eau restant: " + niveauEau + " ml");
        }
    }

    public void demarrer() {
        while (active) {
            // Test de la température
            if (temperatureEau < TEMPERATURE && niveauEau >= TASSE) {
                voyant = Etat.CLIGNOTANT;
                chaufferEau();
            }

            // Test du niveau de l'eau
            if (niveauEau < TASSE) {
                voyant = Etat.CLIGNOTANT;
                ajouterEau();
            }

            // Tout est ok pour faire le café
            if (voyant == Etat.FIXE) {
                if (choix1Cafe) {
                    faireCafe(1);
                }
                if (choix2Cafe) {
                    faireCafe(2);
                }
            }
        }
    }

    // Méthodes pour simuler les choix de café
    public void choisir1Cafe() {
        choix1Cafe = true;
    }

    public void choisir2Cafe() {
        choix2Cafe = true;
    }

    public void arreter() {
        active = false;
    }

    public static void main(String[] args) {
        Senseo senseo = new Senseo();

        // Simulation de fonctionnement de la machine
        senseo.niveauEau = 20; // Ajouter de l'eau initiale
        senseo.temperatureEau = 85; // Température initiale

        senseo.choisir1Cafe(); // Choisir 1 café
        senseo.demarrer(); // Démarrer la machine

        // Arrêter la machine après utilisation
        senseo.arreter();
    }

}
