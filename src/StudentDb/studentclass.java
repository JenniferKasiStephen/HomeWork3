package StudentDb;

public class studentclass { //nested class

    secondClass one = new secondClass();
    thirdClass two = new thirdClass();

    public void firstClass() {
        System.out.println("first class Science");
        one.secondClass1();
        two.thirdClass2();
    }

    private class secondClass {

        private void secondClass1() {
            System.out.println("Second class is Social");
        }

    }

    private class thirdClass {
        private void thirdClass2() {
            System.out.println("Third class is English");
        }
    }


    public static void main(String[] args){
        studentclass main = new studentclass();
        main.firstClass();
    }
}
