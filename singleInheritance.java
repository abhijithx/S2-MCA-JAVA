
public class singleInheritance {

    static class tire {

        void display() {
            System.out.println(" 4 tires");
        }
    }

    static class car extends tire {

        void display1() {
            System.out.println(" car with tire");
        }
    }

    public static void main(String[] args) {
        car c1 = new car();
        c1.display();

    }

}
