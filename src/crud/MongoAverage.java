package crud;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MongoAverage {

    public void mongoAverage() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMM yyyy HH:mm:ss ");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        for (int i = 0; i < 6; i++) {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongo = new MongoClient("localhost", 27017);

            DB db = mongo.getDB("jeanBigData");
            DBCollection dbcol = db.getCollection("increment");
            
            BasicDBObject col = new BasicDBObject("col1", null);
            
                

        }
    }
}
