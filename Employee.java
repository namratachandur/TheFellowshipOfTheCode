public class Employee extends Person
{
    private double salary;

    public Employee(String name, int age, double salary) 
    {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void displaySalary() 
    {
        System.out.println("I earn " + salary + " silver coins per month.");
    }

    public static void main(String[] args)
    {
        Employee archer = new Employee("Aragorn", 87, 150);
        archer.introduce();
        archer.displaySalary();
    }
}