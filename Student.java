public class Student extends Person // This is a subclass of Person
{   
    private String school; // Data field used in the Student class

    public Student(String name, int age, String school)
    {
        super(name, age);
        this.school = school;
    }

    public String getSchool()
    {
        return school;
    }

    @Override
    public void introduce()
    {
        // This method overrides the introduce method in the Person class
        System.out.println("\nHello! My name is " + getName() + ", I am " + getAge() + " years old and I study at " + school + ".");
    }

    public static void main(String[] args) 
    {
        // Tests instances of Student
        Student student = new Student("Frodo", 33, "The House of Lore");
        student.introduce();
    }
}
