
class functionOverloading {

    void add() {
        System.out.println("add() called");
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        functionOverloading fo = new functionOverloading();
        fo.add();
        System.out.println("int add: " + fo.add(2, 3));
        System.out.println("double add: " + fo.add(2.5, 3.1));
        System.out.println("String add: " + fo.add("Hello, ", "World"));
      
    }
}
