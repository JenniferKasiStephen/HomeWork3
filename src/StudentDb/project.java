package StudentDb;

public class project extends ProjectDetails implements studentProjects {

    public project(){}
    public project(String Class, int count){
     super(Class,count);
    }
    public void ScienceProject(){
        System.out.println("Student has has done a Science project on Hydrophobic sand");
    }


    public void stName() {
        System.out.println("Henry has done the science project");
    }




}
