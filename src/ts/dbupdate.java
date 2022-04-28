package ts;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class dbupdate {

    private static String datenbank = "turnierdb.db";

    public static void updateTurnierName(String turniername) throws SQLException {
        Connection con = Connect.connect(datenbank);
        try(Statement statement = con.createStatement()){

        }
    }
}
