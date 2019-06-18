import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
import java.util.Iterator;
import java.util.Scanner;

public class Operation {
    MongoClient mongo = new MongoClient("localhost", 27017);
    MongoDatabase database = mongo.getDatabase("studentDetails");
    MongoCollection<Document> collection = database.getCollection("studentCollection");
    Student students = new Student();
    Scanner scanner = new Scanner(System.in);
    public void insertData() {
        System.out.println("enter student  name");
       students.setname(scanner.nextLine());
        System.out.println("enter father name");
        students.setfatherName(scanner.nextLine());
        System.out.println("enter age");
        students.setage(scanner.nextInt());
        Document student = new Document("title", "MongoDB")
                .append("name", students.getname())
                .append("fatherName", students.getfatherName())
                .append("age", students.getage());
        collection.insertOne(student);
        System.out.println("Document inserted successfully");
    }
    public void displayData() {
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public void deleteData() {
        System.out.println("enter student id ");
        students.setid(scanner.nextLine());
        collection.deleteOne(new Document("_id", new ObjectId(students.getid())));
        System.out.println("Document deleted successfully...");
    }
    public void updateData(){
        System.out.println("entert 1 for update name");
        System.out.println("enter 2 for update age");
        System.out.println("enter 3 for update father name");

    }

}

