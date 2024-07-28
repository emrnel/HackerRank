import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String []argh){
        
        ArrayList<Integer> list = new ArrayList<>();
        int result=0;
        
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<n; j++){
                result += (b*(int)(Math.pow(2,j)));
                list.add(j,result+a);
            }
            for(int k=0; k<n; k++){
                System.out.print(list.get(k) + " ");
            }
            System.out.println("");
            result=0;
            list.clear();
        }
        
    }
}
