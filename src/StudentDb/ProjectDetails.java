package StudentDb;

public abstract class ProjectDetails {

    String Class;
    int count;

	 public ProjectDetails() {}
	 public ProjectDetails(String Class, int count) {
            this.Class = Class;
            this.count = count;
            System.out.println(this.Class + " " + this.count);

    }

    public void startDate(){
        System.out.println("on 26th jan");
    }



    }
