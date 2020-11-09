import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a[]=new int[10000],k=0;
        Outer:
        for(int i=2;;i++)
        {
            boolean f=true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    f=false;
                    continue Outer;
                }
            }
            if(f)
            a[k++]=i;
            if(k==10000)
                break;

        }
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(a[n-1]);
        }
    }
}



//Project Euler #7: 10001st prime
