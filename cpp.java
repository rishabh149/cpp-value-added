import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'runningMedian' function below.
     *
     * The function is expected to return a DOUBLE_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Double> runningMedian(List<Integer> a) {
    // Write your code here
int s=a.size();
        ArrayList<Double> d=new ArrayList<Double>(s); 
        double m=0.0;
        double ar[]=new double[s];
          int k=0;
        for(int i=0;i<s;i++)
        {
            ar[i]=a.get(i);
            Arrays.sort(ar);
            if(k!=0)
            {               
                if((k+1)%2==0)
                {
                m=ar[k/2]+ar[k/2-1]+0.0;
                    m=m/2;
                    d.add(m);
                }
                else
                {
                    m=0.0+ar[k/2];
                   d.add(m);
                }
            }
            else
            {
                m=ar[k];
                d.add(m);
                
            }
            k++;
        }
        return d;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < aCount; i++) {
            int aItem = Integer.parseInt(bufferedReader.readLine().trim());
            a.add(aItem);
        }

        List<Double> result = Result.runningMedian(a);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
