package algorithm1;

public class Student
{
    private String studentName;
    private String studentID;
    public Student(String studentName, String studentID)
    {
        super();
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getName()
    {
        return studentName;
    }
    public void setName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getId()
    {
        return studentID;
    }
    public void setId(String studentID)
    {
        this.studentID = studentID;
    }
}
