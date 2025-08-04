package training.afpa.cda24060.poo;

public class Computer {

    // déclaration des propriétés de l'ordinateur
    private int ram;
    private String cpu;
    private String drive;

    // declaration d'une variable statique
    private static int numberOfComputers;

    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getDrive() {
        return this.drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public static int getNumberOfComputers() {
        // ici je ne peux pas appliquer this
        // ce n'est pas une instance
        return numberOfComputers;
    }

    public static void setNumberOfComputers(int numberOfComputers) {
        Computer.numberOfComputers = numberOfComputers;
    }

    // Déclaration d'un bloc static
    static {
        numberOfComputers=0;
    }

    // Déclaration d'une méthode statique
    public static void displayNumberInstance() {
        System.out.println("Number of Computers: " + numberOfComputers);
    }

    // Déclaration des constructeurs
    // le constructeur par défaut
    public Computer() {
        numberOfComputers++;
    }
    // le constructeur avec toutes les propriètes
    public Computer(int ram, String cpu, String drive) {
        this.ram = ram;
        this.cpu = cpu;
        this.drive = drive;
        numberOfComputers++;
    }
    // un constructeur avec seulement 2 proprètes
    public Computer(int ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
        this.drive = null;
        numberOfComputers++;
    }

    // Déclaration des actions de l'ordinateur
    private void chargingOS () { }

    private void chargingBios() {
        this.chargingOS();
    }

    public void start() {
        this.chargingBios();
    }
    public void stop() {}

    public int resolve(int x ,int y) { return x+y; }

}
