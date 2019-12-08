package crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Crud {

    public static void main(String[] args) {
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        int col4 = 0;
        int col5 = 0;
        int val = 1000;
        int i = 0;

        String query = null;
        Connection con = null;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate = formatter.format(date);
        System.out.println(strDate);

//        for (int i = 0; i < 10001; i++) {
//            if (i == val) {
//                Date date1 = new Date();
//                SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
//                String strDate1 = formatter1.format(date1);
//                System.out.println(strDate1);
//            } else {
//                query = "INSERT INTO `increment` ( `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + (col1 + 1) + "," + (col2 + 2) + "," + (col3 + 3) + "," + (col4 + 4) + "," + (col5 + 5) + ")";
//
//                try {
//
//                    Statement stmt = null;
//                    Class.forName("com.mysql.jdbc.Driver");
//                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/jean", "root", "");
//
//                    stmt = (Statement) con.createStatement();
//                    ResultSet rs = stmt.executeQuery(null);
//
//                    stmt.executeQuery(query);
//                    con.close();
//
//                } catch (ClassNotFoundException | SQLException e) {
//
//                }
//                col1++;
//                col2++;
//                col3++;
//                col4++;
//                col5++;
//            }
//
//        }
        while (i < val) {
            query = "INSERT INTO `increment` ( `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + (col1 + 1) + "," + (col2 + 2) + "," + (col3 + 3) + "," + (col4 + 4) + "," + (col5 + 5) + ")";

            try {

                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/jean", "root", "");

                stmt = (Statement) con.createStatement();
                ResultSet rs = stmt.executeQuery(null);

                stmt.executeQuery(query);
                con.close();
                col1++;
                col2++;
                col3++;
                col4++;
                col5++;

            } catch (ClassNotFoundException | SQLException e) {

            }

        }
        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate1 = formatter1.format(date1);
        System.out.println(strDate1);

    }

}
