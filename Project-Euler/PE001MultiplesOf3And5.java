import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PE001MultiplesOf3And5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            solve(n);
        }
    }
    
    /*
    3  +3
    5  +2
    6  +1
    9  +3
    10 +1
    12 +2
    15 +3
    18 +3
    20 +2
    21 +1
    24 +3
    25 +1
    27 +2
    30 +3
    */
    public static void solve(int upperBound) {
        int arr[] = {3, 2, 1, 3, 1, 2, 3};
        int sum = 0;
        int num = 0;
        while(num <= upperBound) {
            int i = 0;
            if (i >= arr.length) {
                i = 0;
            }
            num += arr[i];
            if (num <= upperBound)
                sum += num;
            i++;
        }
        System.out.printf("%d\n", sum);
    }
}
