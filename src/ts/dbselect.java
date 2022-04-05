package ts;

import java.net.ConnectException;
import java.sql.*;

public class dbselect {

    private static String datenbank = "turnierdb.db";

    public static void selectTurnier(){
        Connection con = Connect.connect(datenbank);
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM Turnier";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("ALLE TURNIERE:");
            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void selectSpieler(){
        Connection con = Connect.connect(datenbank);
        try(Statement statement = con.createStatement()){
            ResultSet rs = statement.executeQuery("SELECT * FROM Spieler;");
            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2)+ " " + rs.getString(3) + " " + rs.getString(4));
            }
            con.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // alle spieler von einem bestimmten Turnier.
    // nicht void sondern eine Liste zurückgeben.
    public static void findeSpielerEinesTurnieres(String TurnierName){
        Connection con = Connect.connect(datenbank);
        try(Statement statement = con.createStatement()){
            //nach TurnierID gesucht.
            //ResultSet rs = statement.executeQuery("SELECT * FROM Spieler JOIN Spieler_nimmt_teil_Turnier ON Spieler.SpielerID = Spieler_nimmt_teil_Turnier.SpielerID WHERE TurnierID = "+TurnierID);
            ResultSet rs = statement.executeQuery(
                        "SELECT Spieler.vorname, Spieler.nachname, Turnier.TurnierName FROM Spieler " +
                            "JOIN Spieler_nimmt_teil_Turnier ON Spieler.SpielerID = Spieler_nimmt_teil_Turnier.SpielerID " +
                            "JOIN Turnier ON Spieler_nimmt_teil_Turnier.TurnierID = Turnier.TurnierID " +
                            "WHERE TurnierName like '"+TurnierName+"'");
            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2)+ " - " + rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // alle Runden von einem bestimmten Turnier.
    public static void findeRundenEinesTurnieres(String Turniername){
        Connection con = Connect.connect(datenbank);
        try(Statement statement = con.createStatement()){
            ResultSet rs = statement.executeQuery("");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
