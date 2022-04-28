package ts;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    private static String datenbank = "turnierdb.db";

    public static void main(String[] args) {

        ArrayList<spieler> allespieler = new ArrayList<>();
        //createNewDatabase("test.db");
        //Connect.connect("turnierdb.db");
        //dbfill.erzeugeTurnier("Turnier404");
        dbselect.selectTurnier();
        System.out.println('\n');
        //dbfill.spielerHinzufügen("Kevin", "F", "kefin@email.com");

        allespieler = dbselect.selectSpieler();

        System.out.println('\n');

        dbselect.findeSpielerEinesTurnieres("Turnier404");
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
