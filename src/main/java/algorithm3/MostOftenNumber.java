/**
 * 최빈수 구하기 (using an array & for loop)
 * 사용자에게 받은 수 중 가장 많이 출현한 수를 출력
 * 1 2 2 3 1 4 2 2 4 3 5 3 2
 * 정답: 2 (5회)
 */

package algorithm3;

import java.util.Scanner;

public class MostOftenNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] inputNumbers = new int[10];
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Enter a number. Count: " + (i + 1));
            inputNumbers[i] = scan.nextInt();
        }

        int[] mode = new int[10];
        // index -> 출현한 숫자
        // index의 값 -> 빈도
        // mode[3] = 5 -> 3이 5번 출현

        // inputNumbers => 1 1 2 3 1 4 1 2 2 4 3
        for(int i = 0; i < 10; i++)
        {
            mode[inputNumbers[i]]++;
        }

        // mode[1] == 4
        // mode[2] == 3
        // mode[3] == 2
        // mode[4] == 2

        int modeNum = 0; //최빈수
        int modeCnt = 0; //최빈수의 횟수
        for(int i = 0; i < 10; i++)
        {
            if(modeCnt < mode[i])
            {
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("Mode number is " + modeNum);
        System.out.println("The number showed " + modeCnt + " times");
    }
}
