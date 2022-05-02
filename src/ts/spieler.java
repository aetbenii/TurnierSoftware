package ts;

public class spieler {

    private String vorname;
    private String nachname;
    private String email;

    public spieler(String vorname, String nachname, String email){
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "spieler{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'';
    }
}
