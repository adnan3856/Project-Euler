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
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            
            int max=0;
            char[] ch=num.toCharArray();
            int[] number=new int[ch.length];
            for(int i=0;i<ch.length;i++)
                number[i]=Integer.parseInt(String.valueOf(ch[i]));
            for(int j=0;j<number.length-k;j++){
                int product=1;
                for(int m=j;m<j+k;m++){
                        product=product * number[m];
                    if(product>=max)
                        max=product;
                }
            }
            System.out.println(max);
        }
    }
}


//Project Euler #8: Largest product in a series
