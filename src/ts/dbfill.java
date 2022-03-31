package ts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbfill {

    public static void erzeugeTurnier(){
        Connection con = Connect.connect();
        PreparedStatement ps = null;
        try{
            String sql
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void erstelleRundeImTurnier(){

    }

    public static void meldeSpielerAnTurnierAn(){

    }

    public static void gibSpielerPunkteInEinerRunde(){

    }

}
