/**
 * 학생 정보들을 저장하고, 학생 이름으로 검색했을 때 학번을 출력하는 프로그램 작성
 *
 * algorithm1.Student 클래스 생성
 * String name, no를 가짐 (이름과 학번)
 *
 * 학생 정보 객체를 생성
 * 학생들을 ArrayList에 저장한 이후 전체 출력
 * 검색을 계속할지 질문
 * y -> 반복
 * n -> 프로그램 종료
 *
 */

package algorithm1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Student studentOne = new Student("Linda K", "1234");
        Student studentTwo = new Student("James R", "5678");
        Student studentThree = new Student("Rachel P", "9101");

        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);

        System.out.println("Here's the list of students' information");
        for(Student s : studentList)
        {
            System.out.println(s.getName() + " " + s.getId());
        }

        while(true)
        {
            System.out.println("If you want to search further enter y, otherwise enter n");
            // Use both nextLine() to take inputs
            // Or we need to invoke scan.nextLine() before take a new input
            // Otherwise, nextLine() skips the console input
            String input = scan.nextLine();

            if(input.equals("y"))
            {
                System.out.println("Searching started");
                System.out.println("Enter a student's name");
                String name = scan.nextLine();

                // initialize a boolean variable
                boolean flag = false;

                for(Student s : studentList)
                {
                    if (s.getName().equals(name)) {
                        System.out.println("Corresponding student's ID number is: " + " " + s.getId());
                        // if there was a corresponding student
                        flag = true;
                    }
                }

                if(!flag)
                {
                    System.out.println("There is no corresponding student in the list");
                }

            }
            else if(input.equals("n"))
            {
                System.out.println("Searching stopped");
                break;
            }
        }
    }
}

/**
 *
 * Scanner Tips
 * Actually nextLine() method of Scanner skips the console input, when we use it after next(), nextInt() and all nextXXX() methods. Because next() and nextXXX() input methods doesn’t process/consider the newline character (When you press ENTER key after input them) and that newline character processed by nextLine() method. Therefore nextLine() method doesn’t read the input (which you wished for). To overcome this problem, you have to invoke an extra nextLline() method after next() and nextXXX().
 *
 *
 * Scenario-1 : Here both nextLine() methods will work fine.
 * Scanner sc =new Scanner(System.in);
 * String name=sc.nextLine();
 * String city=sc.nextLine();
 * System.out.println(name+” “+city);
 *
 * Scenario-2 : Here nextLine() will skip the input, Because next() doesn’t process the new line Character after its input.
 *
 * Scanner sc =new Scanner(System.in);
 * String name=sc.next(); //Input the String but not process newline char.
 * String city=sc.nextLine(); //So, newline will be processed by this line & input for City will be skipped.
 * System.out.println(name+” “+city);
 *
 * Solution to the Problem:
 *
 * Scenario-3 : You need to call an extra nextLine() method after next() or nextXXX() to process the new line Character.
 *
 * Scanner sc =new Scanner(System.in);
 * String name=sc.next(); //Input the String but not process newline
 *
 * sc.nextLine(); //Now newline char will be processed by this extra nextLine().
 *
 * String city=sc.nextLine(); //So, this line will read the input for City.
 * System.out.println(name+” “+city);
 */
