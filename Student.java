public class Student extends Person 
{   
    private String school;

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
        System.out.println("\nHello! My name is " + getName() + ", I am " + getAge() + " years old and I study at " + school + ".");
    }

    public static void main(String[] args) 
    {
        Student student = new Student("Frodo", 33, "The House of Lore");
        student.introduce();
    }
}