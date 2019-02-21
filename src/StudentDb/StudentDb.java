package StudentDb;

public class StudentDb {

    //encapsulation

    private String StdName;
    private String StdGender;
    private String StdCourseId;
    private int stdDob;

    //constructor
    public StudentDb(){}
    public StudentDb(String stdName, String stdGender, String stdCourseId, int stdDob) {
        StdName = stdName;
        StdGender = stdGender;
        StdCourseId = stdCourseId;
        this.stdDob = stdDob;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(String stdName) {
        StdName = stdName;
    }

    public String getStdGender() {
        return StdGender;
    }

    public void setStdGender(String stdGender) {
        StdGender = stdGender;
    }

    public String getStdCourseId() {
        return StdCourseId;
    }

    public void setStdCourseId(String stdCourseId) {
        StdCourseId = stdCourseId;
    }

    public int getStdDob() {
        return stdDob;
    }

    public void setStdDob(int stdDob) {
        this.stdDob = stdDob;
    }


    }



