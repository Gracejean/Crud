package crud;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mongodb.BasicDBObject;

public class MongoIncrement {

    public void mongoIncrement() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        for (int i = 0; i < 1001; i++) {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongo = new MongoClient("localhost", 27017);

            DB db = mongo.getDB("jeanBigData");
            DBCollection dbcol = db.getCollection("increment");
            BasicDBObject inc = new BasicDBObject("col1", i)
                    .append("col2", i + 1)
                    .append("col3", i + 2)
                    .append("col4", i + 3)
                    .append("col5", i + 4);
            dbcol.insert(inc);
        }
        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate1 = formatter1.format(date1);
        System.out.println(strDate1);
    }

    public void nonMongoIncrement() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        MongoClient mongo = new MongoClient("localhost", 27017);

        DB db = mongo.getDB("jeanBigData");
        DBCollection dbcol = db.getCollection("increment");

        for (int i = 0; i < 1001; i++) {
            BasicDBObject inc = new BasicDBObject("col1", i)
                    .append("col2", i + 1)
                    .append("col3", i + 2)
                    .append("col4", i + 3)
                    .append("col5", i + 4);
            dbcol.insert(inc);
        }
        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate1 = formatter1.format(date1);
        System.out.println(strDate1);
    }
}
