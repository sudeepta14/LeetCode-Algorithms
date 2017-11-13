import java.io.*;
import java.util.*;

public class sparseArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int occNum = 0;
        String[] stringArray = new String[n];
        for(int i = 0; i < n ; i++){
            stringArray[i] = input.next();
        }
        int q = input.nextInt();
        for(int i = 0; i < q ; i++){
            String scanString = input.next();
            
            for(int j = 0; j<n ; j ++){
                if(scanString.equals(stringArray[j]))
                    occNum++; 
            }
            
            System.out.println(occNum);
            occNum = 0;
            
        }
        
     
        
    }
}