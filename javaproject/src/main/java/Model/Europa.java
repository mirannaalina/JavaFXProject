package Model;

public class Europa {

    private int id;
    private String tari;
    private String caracteristici;

    public Europa(int id, String tari, String caracteristici) {
        this.id = id;
        this.tari = tari;
        this.caracteristici = caracteristici;
    }

    public Europa(){}

    @Override
    public String toString() {
        return this.tari + " " +caracteristici;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTari() {
        return tari;
    }

    public void setTari(String tari) {
        this.tari = tari;
    }

    public String getCaracteristici() {
        return caracteristici;
    }

    public void setCaracteristici(String caracteristici) {
        this.caracteristici = caracteristici;
    }
}
