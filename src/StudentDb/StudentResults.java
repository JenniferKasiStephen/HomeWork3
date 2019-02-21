package StudentDb;

import java.util.Scanner;

public class StudentResults {

    private StudentResults(){}
    public static StudentResults getInstance() { // singleton
        StudentResults db = new StudentResults();
        return db;

    }
    public static void main(String[] args) {
        StudentResults db1 =StudentResults.getInstance();
        Scanner Studentscore = new Scanner(System.in);
        System.out.println("Enter:");
        int midtermExam = Studentscore.nextInt();
        int finalExam = Studentscore.nextInt();
        int result = midtermExam+finalExam;
        Studentscore.close();
        System.out.println("Total :" + result);
        int score = 200;
        String grade;
        if(score<180){
            grade = "A";

        }else if(score<150){
            grade="B";
        }
        else {
            grade = "C";
        }
        System.out.println("Grade :" + grade);
    }


}
