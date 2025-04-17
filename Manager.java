public class Manager extends Employee // This is a subclass of Employee (which is a subclass of Person)
{
    private int team_size; // Data field used in the Manager class

    public Manager(String name, int age, double salary, int team_size) 
    {
        super(name, age, salary);
        this.team_size = team_size;
    }

    public int getTeamSize() 
    {
        return team_size;
    }

    @Override
    public void displaySalary()
    {
        // This method overrides the displaySalary method in the Employee class
        System.out.println("I managing a team of " + team_size + " members.");
        System.out.println("I earn " + getSalary() + " silver coins per month.");
    }

    public static void main(String[] args) 
    {
        // Tests instances of Manager
        Manager wizard = new Manager("Gandalf the Grey", 2019, 1000, 8);
        wizard.introduce();
        wizard.displaySalary();
        Employee archer = new Manager("Legolas", 3000, 500, 200);
        archer.introduce();
        archer.displaySalary();
    }
}
