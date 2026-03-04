public class Product {

    int pCode;
    String name;
    int price;

    public Product(int pCode, String name, int price) {
        this.pCode = pCode;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("product code: " + pCode);
        System.out.println("product name: " + name);
        System.out.println("product price: " + price);
    }

    

}