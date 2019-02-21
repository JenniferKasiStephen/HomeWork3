package StudentDb;

public class WeeklySchedule {

    Week week;

    public WeeklySchedule(){}
    public WeeklySchedule(Week week){
        this.week=week;
    }

    public static void everyweek(Week week) {
        switch (week){
            case Monday:
                System.out.println("Student has:" + " " + " maths class");
                break;
            case Tuesday:
                System.out.println("Student has:" + " " + "english class");
                break;
            case Wednesday:
                System.out.println("Student has:" + " " + "social class");
                break;
            case Thursday:
                System.out.println("Student has:" + " " + "hindi class");
                break;
            case Friday:
                System.out.println("Student has:" + " " + "science class");
                break;
            case Saturday:
                System.out.println("Student has:" + " " + "Telugu class");
                break;
            case Sunday:
                System.out.println("Student has:" + " " + "EV class");
                break;
            default:
                System.out.println("Student has:" +" "+ "french class");
                break;

        }
    }
    public static void main(String[]args){
        WeeklySchedule data = new WeeklySchedule();
        data.everyweek(Week.Friday);

    }


}
