package training.afpa.Exo1;

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
            this.solde += versement;
            System.out.println("Vôtre compte a un solde de : " + solde +"€");
        }

        //methode retirer
        public void Retirer(int retirer) {
<<<<<<< HEAD:Exo/Back/JAVA/PooExo/src/training/afpa/Compte.java
            if(this.solde >= retirer) {
                this.solde -= retirer;
            }else{
                System.out.println("Retrait impossible");
            }
=======
            this.solde -= retirer;
>>>>>>> ba538ab8d34882d6f869867b37a82bd9f4ecfc93:Exo/Back/JAVA/PooExo/src/training/afpa/Exo1/Compte.java
            System.out.println("Vôtre nouveau solde est de : " + solde +"€");
        }

        //methode pour afficher
        public void Afficher() {
            System.out.println("Votre compte a un solde de : " + solde+"€");
        }
}
