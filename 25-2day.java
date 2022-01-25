import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[4];
        for(int i=0;i<4;i++)
            ar[i]=sc.nextInt();
        int s=0;
        for(int i=0;i<4;i++)
        {
            System.out.print("P"+(i+1)+" (WT="+s+")");
            if(i<3)
                System.out.print(", ");
            s=s+ar[i];
        }
    }
}
