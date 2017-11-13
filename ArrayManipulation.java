
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long [] array = new long[n+1];
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            array[a-1] += k;
            array[b] -= k;
        }
        in.close();
        
        long sum = 0;
        long max = 0;
        for(int i =0;i < n; i++){
            sum += array[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}

