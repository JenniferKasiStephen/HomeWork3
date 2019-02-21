package StudentDb;

public class TestStudentDb {

    public static void main(String[] args) {
        System.out.println("Enter details:");
        StudentDb db = new StudentDb();
        db.setStdName("Jacob");
        db.setStdGender("Male");
        db.setStdDob(89);
        db.setStdCourseId("PharmD01");

        System.out.println(db.getStdName() + " " +db.getStdGender() + " " + db.getStdDob() + " " + db.getStdCourseId());


    }


}

