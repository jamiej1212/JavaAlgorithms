package algorithm1;

/**
 * 학생 정보들을 저장하고, 학생 이름으로 검색했을 때 학번을 출력하는 프로그램 작성
 *
 * algorithm1.Student 클래스 생성
 * String name, no를 가짐 (이름과 학번)
 *
 * 학생들을 ArrayList에 저장한 이후,
 * 검색을 계속할지 질문
 * y -> 반복
 * n -> 프로그램 종료
 *
 */

public class Student
{
    private String studentName, studentID;

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
    public void setID(String studentID)
    {
        this.studentID = studentID;
    }


}
