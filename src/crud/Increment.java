package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Increment {

    public void increment() {

        String query = null;
        Connection con = null;

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        for (int i = 1; i < 201; i++) {
            try {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/jean", "root", "");
                stmt = (Statement) con.createStatement();

                query = "INSERT INTO `increment`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + (i) + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";

                stmt.executeUpdate(query);
                con.close();

            } catch (ClassNotFoundException | SQLException e) {

            }
            System.out.println(i);
        }

        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate1 = formatter1.format(date1);
        System.out.println(strDate1);

    }

    public void noConnectionIncrement() {
        Connection con = null;

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        try {
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/jean", "root", "");
            stmt = (Statement) con.createStatement();

            for (int i = 1; i < 201; i++) {

                stmt.executeUpdate("INSERT INTO `increment`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + (i) + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")");
               System.out.println(i);
            }
             

            
            con.close();

        } catch (ClassNotFoundException | SQLException e) {

        }

        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate1 = formatter1.format(date1);
        System.out.println(strDate1);
    }

}
