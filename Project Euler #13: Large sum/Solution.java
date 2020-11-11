import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        BigInteger sum = BigInteger.ZERO;
        BigInteger A = BigInteger.ZERO;
        for(int i=0;i<n;i++){
            A=scan.nextBigInteger();
            sum=sum.add(A);
        }
        String s=sum.toString();
        String result=s.substring(0,10);
        System.out.println(result);

        scan.close();
    }
}


//Project Euler #13: Large sum
