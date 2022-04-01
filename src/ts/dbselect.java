package ts;

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
                String tname = rs.getString("Turniername");
                System.out.println(tname+"\n\n");
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
}
