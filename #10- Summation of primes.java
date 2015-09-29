import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.Math;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int a=0;a<T;a++){
            System.out.println((int) primeSum(scan.nextDouble()));
        }        
    }
    
    public static double primeSum(double x){
        double sum=0;
        for(double i=2;i<=x;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        
        return sum;
    }
    
    //checks whether an int is prime or not.
    public static boolean isPrime(double num)
    {
        if (num == 1) return false;
        if (num == 2) return true;

        double newnum = Math.floor(Math.sqrt(num));

        for (double i = 2; i <= newnum; i++) 
            if (num % i == 0) return false;

    return true;
    }
}