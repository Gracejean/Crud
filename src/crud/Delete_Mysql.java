package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Delete_Mysql {

    String query = null;
    Connection con = null;

    public void delMysql() {

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

                query = "DELETE FROM `increment` WHERE `id` = '" + i + "'";

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
    
    public void no

}
