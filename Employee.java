public class Employee extends Person // This is a subclass of Person
{
    private double salary; // Data field used in the Employee class

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
        // This method displays the salary of the employee
        System.out.println("I earn " + salary + " silver coins per month.");
    }

    public static void main(String[] args)
    {
        // Tests instances of Employee
        Employee archer = new Employee("Aragorn", 87, 150);
        archer.introduce();
        archer.displaySalary();
    }
}
