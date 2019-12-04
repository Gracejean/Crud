package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Crud {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        for (int i = 0; i < 10001; i++) {

//    }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jean", "root", "");

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(null);
                String query = "INSERT INTO `increment` (`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + (i) + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";

                stmt.executeQuery(query);
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
//                System.out.println("Error!");

            }
        }
        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate1 = formatter1.format(date1);
        System.out.println(strDate1);

    }
}

//stmt = (Statement) con.createStatement();
////                ResultSet rs = stmt.executeQuery(null);
//               String sql = "INSERT INTO `sql_test`(`id`, `column1`, `column2`, `column3`, `column4`, `column5`) VALUES (" + i + "," + (i) + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
//
//               stmt.executeUpdate(sql);
//               con.close();
//
//           } catch (ClassNotFoundException | SQLException e) {
//               System.out.println("Error!");
