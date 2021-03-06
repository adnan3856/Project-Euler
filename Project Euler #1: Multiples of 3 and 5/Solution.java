import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) throws IOException{
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(reader.readLine());
            multiples(n);
        }
    }
    public static void multiples(int num){  
    // int S1, S2, S3;  
    // int N=N1-1;
    // S1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;  
    // S2 = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2;  
    // S3 = ((N / 15)) * (2 * 15 + (N / 15 - 1) * 15) / 2;  
    long three=(num-1)/3;
    long five=(num-1)/5;
    long fifteen=(num-1)/15;
    System.out.println(3*(three*(three+1)/2)+5*(five*(five+1)/2)-15*(fifteen*(fifteen+1)/2) );  
}  
 }


Project Euler #1: Multiples of 3 and 5
