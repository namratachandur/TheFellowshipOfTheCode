public class Person // This is the base class (superclass)
{
    // Data fields used in the Person class and its subclasses
    private String name;
    private int age;

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public void introduce()
    {
        // This method is overridden in subclasses
        System.out.println("\nHello! My name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) 
    {
        // Tests instances of Person 
        Person elven_queen = new Person("Galadriel", 8000);
        elven_queen.introduce();
        Person hobbit = new Person("Bilbo", 111);
        hobbit.introduce();
        Person dwarf = new Person("Gimli", 140);
        dwarf.introduce();
    }
}
