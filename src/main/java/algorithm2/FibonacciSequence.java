/**
 * 피보나치 수열을 출력하라 (using an array & for loop)
 * F1 = F2 = 1
 * Fn = Fn-1 + Fn-2 (n >= 3)
 * 1 1 2 3 5 8 13 21 34...
 */

package algorithm2;

public class FibonacciSequence
{
    public static void main(String[] args)
    {

        // Using an array
       int[] arr = new int[10];
       arr[0] = 1;
       arr[1] = 1;

       for(int i = 2; i < 10; i++)
       {
           arr[i] = arr[i-1] + arr[i-2];
       }
       for(int i = 0; i < 10; i++)
       {
           System.out.print(arr[i] + " ");
       }

        // without using an array

        int prevPrev = 1;
       int prev = 1;
       System.out.print("\n" + prevPrev + " ");
       System.out.print(prev + " ");

       for(int i = 2; i < 10; i++)
       {
           int currNum = prevPrev + prev;
           prevPrev = prev;
           prev = currNum;
           System.out.print(currNum + " ");
       }
    }
}
