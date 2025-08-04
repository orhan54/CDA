package training.afpa.main;

import training.afpa.metier.serie1.TpExosMetisSerie1;
import training.afpa.metier.serie2.TpExosMetisSerie2;

public class Main {

    public static void main(String[] args) {


        Main main = new Main();
        main.start();
    }

    public void start() {

        System.out.println("Hello and welcome!");
        TpExosMetisSerie1.exo5_Dichtomie();
    }

}