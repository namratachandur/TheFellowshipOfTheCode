import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Galadriel", 8000));
        people.add(new Student("Frodo", 33, "The House of Lore"));
        people.add(new Employee("Aragorn", 87, 150));
        people.add(new Manager("Gandalf the Grey", 2019, 1000, 8));
        people.add(new Person("Bilbo", 111));
        people.add(new Student("Samwise", 33, "The House of Lore"));
        people.add(new Manager("Legolas", 3000, 500, 200));
        people.add(new Person("Gimli", 140));

        for (int i = 0; i < people.size(); i++) 
        {
            Person person = people.get(i);
            person.introduce(); 
            if (person instanceof Employee) 
            {
                ((Employee) person).displaySalary();
            } 
            else if (person instanceof Manager) 
            {
                ((Manager) person).displaySalary();
            }
        } 
    }
}