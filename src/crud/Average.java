package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Average {

    String query = null;
    Connection con = null;

    public void average() {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        float col1 = 0;
        float col2 = 0;
        float col3 = 0;
        float col4 = 0;
        float col5 = 0;

        for (int i = 1; i < 1001; i++) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/jean", "root", "");
                Statement stmt = con.createStatement();
                String sql = "SELECT AVG(col1) FROM increment";

                ResultSet rs = stmt.executeQuery("SELECT `col1`, `col2`, `col3`, `col4`, `col5` FROM `increment` WHERE id= '" + i + "' ");
                rs.next();

                col1 += rs.getFloat("col1");
                col2 += rs.getFloat("col2");
                col3 += rs.getFloat("col3");
                col4 += rs.getFloat("col4");
                col5 += rs.getFloat("col5");

                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }

        }
        System.out.println(col1 / 200);
        System.out.println(col2 / 200);
        System.out.println(col3 / 200);
        System.out.println(col4 / 200);
        System.out.println(col5 / 200);

        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate1 = formatter1.format(date1);

        System.out.println(strDate1);

    }

    public void nonSqlAverage() {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        float col1 = 0;
        float col2 = 0;
        float col3 = 0;
        float col4 = 0;
        float col5 = 0;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/jean", "root", "");
            Statement stmt = con.createStatement();
//            String sql = "SELECT AVG(col1) FROM increment";

            for (int i = 1; i < 1001; i++) {

                ResultSet rs = stmt.executeQuery("SELECT `col1`, `col2`, `col3`, `col4`, `col5` FROM `increment` WHERE id= '" + i + "' ");
                rs.next();

                col1 += rs.getFloat("col1");
                col2 += rs.getFloat("col2");
                col3 += rs.getFloat("col3");
                col4 += rs.getFloat("col4");
                col5 += rs.getFloat("col5");

            }
            con.close();

            System.out.println(col1 / 200);
            System.out.println(col2 / 200);
            System.out.println(col3 / 200);
            System.out.println(col4 / 200);
            System.out.println(col5 / 200);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate1 = formatter1.format(date1);

        System.out.println(strDate1);

    }

}
