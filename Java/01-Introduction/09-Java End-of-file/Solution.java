import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int lines=0;
        String result = "";
        String input = "";
        
        while(scan.hasNext()){
            if(result.length()!=0){
                result+="\n";
            }
            input = scan.nextLine();
            lines++;
            result += lines + " " + input;
        }
        
        System.out.println(result);

    }
}
