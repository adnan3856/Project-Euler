import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int test_i=0;test_i<t;test_i++){
            long N=scan.nextLong();
            int max=0;
            long result=0;
            for(long i=N-1;i>0;i--){
                int count=0;
                long n=i;
                while(n>1){
                    if(n%2==0){
                        n=n/2;
                        count++;
                    }
                    else{
                        n=3*n+1;
                        count++;
                    }
                }
                if(count>max){
                    max=count;
                    result=i;
                }
            }
            System.out.println(result);
        }
    }
}

//Project Euler #14: Longest Collatz sequence
