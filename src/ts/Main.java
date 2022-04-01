package ts;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static String datenbank = "turnierdb.db";

    public static void main(String[] args) {
        //createNewDatabase("test.db");
        //Connect.connect("turnierdb.db");
        //dbfill.erzeugeTurnier(datenbank, "Test");
        //dbselect.selectTurnier();
        dbfill.spielerHinzufügen("Pio", "Pompino", "ppompino@email.com");
        dbselect.selectSpieler();
    }

//    public static void createNewDatabase(String fileName){
//        String url = "jdbc:sqlite:C:\\sqlite\\db" +fileName;
//
//        try (Connection con = DriverManager.getConnection(url)) {
//            DatabaseMetaData meta = con.getMetaData();
//            System.out.println("Der Treiber Name ist: "+meta.getDriverName());
//            System.out.println("Eine neue Datenbank wurde erstellt");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
