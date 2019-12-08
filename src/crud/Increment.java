package crud;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Increment {

    Date date1 = new Date();
    SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
    String strDate1 = formatter1.format(date1);
    
    
    public void increment(){
        System.out.println(strDate1);
    }

}
// int col1 = 0;
//       int col2 = 0;
//       int col3 = 0;
//       int col4 = 0;
//       int col5 = 0;
////       int i;
//
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
//        String strDate = formatter.format(date);
//        System.out.println(strDate);
//        
//         for (int i = 0; i < 1001; i++) {
//        if (i == 1000) {
//               Date timeFinish = new Date();
//               SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
//               System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));
//           } else {
//               col1++;
//               col2++;
//               col3++;
//               col4++;
//               col5++;
//               i++;
////               Connection conn = null;
//               Statement stmt = null;
//               String insertQuery;
//
//               insertQuery = String.format("INSERT INTO `increment` (col1,col2,col3,col4,col5)"
//                       + "VALUES ('%d','%d','%d','%d','%d')", col1, col2 + 1, col3 + 2, col4 + 3, col5 + 4);
//               try {
//                   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/jean", "root", "");
//                   stmt = conn.createStatement();
//                   int result = stmt.executeUpdate(insertQuery);
//                   System.out.println(result);
//                   conn.close();
//               } catch (SQLException ex) {
//                   JOptionPane.showMessageDialog(null, ex);
//                   System.out.println(ex.getMessage());
//               }

//        for (int i = 0; i < 10001; i++) {
//                            String query = "INSERT INTO `increment` ( `id`,`col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + i + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
//
//    }
//            try {
//                Statement stmt = null;
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jean", "root", "");
//
//                 stmt  = (Statement) con.createStatement();
//                ResultSet rs = stmt.executeQuery(null);
//
//                stmt.executeQuery(query);
//                con.close();
//
//            } catch (ClassNotFoundException | SQLException e) {
////                System.out.println("Error!");
//
//            }
//        }
//        Date date1 = new Date();
//        SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
//        String strDate1 = formatter1.format(date1);
//        System.out.println(strDate1);

//    }
//}



//
//public class TestSQL {
//
//   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//   final String DB_URL = "jdbc:mysql://localhost/jean";
//   final String USER = "root";
//   final String PASS = "";
//
//   public void insertNumbers() {
//       int col1 = 0;
//       int col2 = 0;
//       int col3 = 0;
//       int col4 = 0;
//       int col5 = 0;
//       Date timeStart = new Date();
//       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
//       System.out.println("Time Started: " + dateFormat.format(timeStart));
//
//       for (int i = 0; i < 1001; i++) {
//           if (i == 1000) {
//               Date timeFinish = new Date();
//               SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
//               System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));
//           } else {
//               col1++;
//               col2++;
//               col3++;
//               col4++;
//               col5++;
//               i++;
//               Connection conn = null;
//               Statement stmt = null;
//               String insertQuery;
//
//               insertQuery = String.format("INSERT INTO `increment` (col1,col2,col3,col4,col5)"
//                       + "VALUES ('%d','%d','%d','%d','%d')", col1, col2 + 1, col3 + 2, col4 + 3, col5 + 4);
//               try {
//                   conn = DriverManager.getConnection(DB_URL, USER, PASS);
//                   stmt = conn.createStatement();
//                   int result = stmt.executeUpdate(insertQuery);
//                   System.out.println(result);
//                   conn.close();
//               } catch (SQLException ex) {
//                   JOptionPane.showMessageDialog(null, ex);
//                   System.out.println(ex.getMessage());
//               }
//
//           }
//       }
//   }
//}
       
//
//   }
//
//}


//or (int i = 0; i < 1001; i++) {
//           try {
//               Statement stmt = null;
//               Class.forName("com.mysql.jdbc.Driver");
//               java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
//               stmt = (Statement) con.createStatement();
////                ResultSet rs = stmt.executeQuery(null);
//               String sql = "INSERT INTO `test`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + i + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
//
//               stmt.executeUpdate(sql);
//               con.close();
//
//           } catch (ClassNotFoundException | SQLException e) {
//               System.out.println("Error!");
//
//           }
//       }