package crud;

public class Crud {

    public static void main(String[] args) {

        Increment i = new Increment();
//        i.increment();
//          i.noConnectionIncrement();
          
        Delete_Mysql d = new Delete_Mysql();
//        d.delMysql();
//        d.noConnetionDel();
          
        Average a = new Average();
//        a.average();  
//        a.nonSqlAverage();
        
        MongoIncrement mongo = new MongoIncrement();
        mongo.mongoIncrement();
//        mongo.nonMongoIncrement();
        
//        MongoDelete del = new MongoDelete();
//        del.mongoDel();
//        del.nonMongoDel();
        
        MongoAverage m = new MongoAverage();
        
    }

}
    