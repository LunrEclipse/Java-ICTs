public class Driver
{
    public static void main (String[] args)
    {
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob.toString());
        
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne.toString());
        
        Teacher duke = new Teacher("Duke Java", 34, "M", "Computer Science", 5000.0);
        System.out.println(duke.toString());
        
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima.toString());
    }
}