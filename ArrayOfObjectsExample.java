
public class ArrayOfObjectsExample {

    static class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Carol", 28)
        };

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
