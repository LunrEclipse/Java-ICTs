public class CollegeStudent extends Student
{
    private String myMajor;
    private int myYear;
    
    public CollegeStudent(String name, int age, String gender, String id, double gpa, int year, String major)
    {
        super(name, age, gender, id, gpa);
        myMajor = major;
        myYear = year;
    }
    
    public void setYear(int year)
    {
        myYear = year;
    }
    
    public void setMajor(String major)
    {
        myMajor = major;
    }
    
    public int getYear()
    {
        return myYear;
    }
    
    public String getMajor()
    {
        return myMajor;
    }
    
    public String toString()
    {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}