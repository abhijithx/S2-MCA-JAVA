class Complex{
    double real;
    double imag;

    Complex(double r, double i){
        real=r;
        imag=i;
    }

    Complex add(Complex c){
        return new Complex(this.real+c.real,this.imag+c.imag);
    }

    void display(){
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 2);

        Complex result = c1.add(c2);

        System.out.print("Sum = ");
        result.display();

}
}