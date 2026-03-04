public class Cpu {
    private double price;
    private Processor processor;
    private Ram ram;

    public Cpu(double price, int cores, String procCompany, int memory, String ramCompany) {
        this.price = price;
        this.processor = new Processor(cores, procCompany);
        this.ram = new Ram(memory, ramCompany);
    }

    public void display() {
        System.out.println("CPU Price: $" + price);
        processor.display();
        ram.display();
    }

  
    public class Processor {
        private int noOfCores;
        private String company;

        public Processor(int noOfCores, String company) {
            this.noOfCores = noOfCores;
            this.company = company;
        }

        public void display() {
            System.out.println("Processor: " + noOfCores + " cores, Company: " + company);
        }
    }

   
    public static class Ram {
        private int memory;
        private String company;

        public Ram(int memory, String company) {
            this.memory = memory;
            this.company = company;
        }

        public void display() {
            System.out.println("RAM: " + memory + " GB, Company: " + company);
        }
    }
}
