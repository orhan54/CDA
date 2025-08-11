package training.afpa.MMORPG.Model;

public class Race {

    private String classe;
    private String bonusSpec;

    public Race(String classe, String specialisation) {
        this.setClasse(classe);
        this.setBonusSpec(specialisation);
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getBonusSpec() {
        return this.bonusSpec;
    }

    public void setBonusSpec(String bonusSpec) {
        this.bonusSpec = bonusSpec;
    }

}
