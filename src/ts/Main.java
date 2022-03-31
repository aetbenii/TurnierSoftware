package ts;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        //createNewDatabase("test.db");
        Connect.connect();
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
