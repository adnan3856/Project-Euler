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
            int product = -1,temp=0; 
        for(int a = 1, b, c; a <= n/3; a++){
            b = (n*n - 2*n*a)/(2*n - 2*a);
            c = n - a - b; 
            if(c*c == (a*a + b*b)){
                temp = a*b*c; 
                if(temp > product){
                    product = temp; 
                }
            }
        }
        System.out.println(product);
        }
    }
}



//Project Euler #9: Special Pythagorean triplet
