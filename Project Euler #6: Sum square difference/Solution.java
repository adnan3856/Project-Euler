import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long sum=0;
        long totalSum=0;
            for(long i=1;i<=n;i++){
                long square=i*i;
                sum=sum+square;
                totalSum=totalSum+i;
            }
            System.out.println((totalSum * totalSum)-sum);
        }
    }
}


//Project Euler #6: Sum square difference
