import java.util.HashSet;

public class Customer {

    String name;
    int age;

    Customer(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {

        Customer c1= new Customer("Mohan",10);
        Customer c2= new Customer("Mohan",10);

        HashSet<Customer> customerSet=new HashSet<>();
        customerSet.add(c1);
        customerSet.add(c2);
        System.out.println(customerSet.size());
    }

    // getters and setters
}