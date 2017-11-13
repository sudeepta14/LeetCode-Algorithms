import java.util.ArrayList;
import java.util.Scanner;

public class seqList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lastAnswer = 0;
        int nSeq = sc.nextInt();
        int nQue = sc.nextInt();
        int type, x, y, index;
        
        ArrayList<Integer>[] seqList = new ArrayList[nSeq];
        while(nQue-->0){
        type = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        index = ((x ^ lastAnswer)% nSeq);
        switch(type){
            case 1:{
                    if(seqList[index] == null){
                        ArrayList<Integer> myList = new ArrayList<>();
                        myList.add(y);
                        seqList[index] = myList;
                    }
                    else{
                        seqList[index].add(y);
                    }
                }
                break;
                
            case 2:
                    System.out.println(lastAnswer = seqList[index].get(y % seqList[index].size()));
                    break;
                
        }
        
    }
    }
}
