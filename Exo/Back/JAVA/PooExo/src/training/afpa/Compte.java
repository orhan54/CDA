package training.afpa;

public class Compte {

        public double solde;

        //class constructor
        public Compte() {
            solde = 0;
        }

        public Compte(int solde) {
            this.solde = solde;
        }

        //methode deposer
        public void Deposer(int versement) {
            solde += versement;
            System.out.println("Votre compte a un solde de : " + solde +"€");
        }

        //methode retirer
        public void Retirer(int retirer) {
            solde -= retirer;
            System.out.println("Vôtre nouveau solde est de : " + solde +"€");
        }

        //methode pour afficher
        public void Afficher() {
            System.out.println("Votre compte a un solde de : " + solde+"€");
        }
}
