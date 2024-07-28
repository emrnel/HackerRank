import java.io.*;
import java.util.*;

public class Solution {
    
    public static int breadth;
    public static int height;
    
    public static boolean flag;
    
    
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be namgggged Solution. */
        Scanner scan = new Scanner(System.in);
        
        breadth = scan.nextInt();
        height = scan.nextInt();
        
        if(breadth>0 && height>0){
        flag = true;
        }
        else{
        flag = false;
        }
        
        if(flag){
            int area=breadth*height;
            System.out.print(area);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
         
    }
}


