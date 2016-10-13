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
    
    public static void solve(int upperBound) {
        int arr[] = {3, 2, 1, 3, 1, 2, 3}; //Increment for multiples of 3 and 5
        int sum = 0;
        int num = 0;
        int i = 0;
        while(num < upperBound) {
            if (i >= arr.length) {
                i = 0;
            }
            num += arr[i];
            if (num < upperBound)
                sum += num;
            i++;
        }
        System.out.printf("%d\n", sum);
    }
}
