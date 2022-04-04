package ts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbfill {

    private static String datenbank = "turnierdb.db";

    public static void erzeugeTurnier(String turniername){
        Connection con = Connect.connect(datenbank);
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO Turnier(TurnierName) VALUES(?) ";
            ps = con.prepareStatement(sql);
            ps.setString(1, turniername);
            ps.execute();
            System.out.println("Data has been inserted!");
            ps.close();
            con.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("ging nicht");
        }
    }

    public static void erstelleRundeImTurnier(int turnierid){
        Connection con = Connect.connect(datenbank);
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO Runde(TurnierID) Values(?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, ""+turnierid);
            System.out.println("Data has been inserted!");
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void spielerHinzufügen(String vorname, String nachname, String email){
        Connection con = Connect.connect(datenbank);
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO Spieler(vorname, nachname, email) VALUES(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,vorname);
            ps.setString(2,nachname);
            ps.setString(3,email);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void meldeSpielerAnTurnierAn(int SpielerID, int TurnierID){
        Connection con = Connect.connect(datenbank);
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO Spieler_nimmt_teil_Turnier(SpielerID, TurnierID) VALUES(?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, ""+SpielerID);
            ps.setString(2, ""+TurnierID);
            System.out.println("Data has been inserted!");
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void gibSpielerPunkteInEinerRunde(int SpielerID, int anzahlPunkte, int RundeID){
        Connection con = Connect.connect(datenbank);
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO Spielel_sammeltpunkte_Runde(Punkte, SpielerID, RundeID) Values(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, ""+anzahlPunkte);
            ps.setString(2, ""+SpielerID);
            ps.setString(3, ""+RundeID);
            System.out.println("Data has been inserted!");
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
