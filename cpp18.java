import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
    int sum=0,max=0;
max=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+ar[i];
        if(max<sum)
        max=sum;
        if(sum<0)
        sum=0;
    }
    System.out.println(max);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}
