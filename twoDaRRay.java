
import java.io.*;
import java.util.*;

public class twoDaRRay {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        int i, j, sum, final_sum = -99999;
        for(i = 0; i<6; i++){
            for(j = 0; j<6 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i<4; i++){
            for(j = 0;j < 4; j++){
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                final_sum = Math.max(sum, final_sum);
            }
        }
        System.out.println(final_sum);
    }
}