import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%s",s1);
                for(int j=0;j<15-s1.length();j++){
                    System.out.printf(" ");
                }
                String str = new String("");
                str = String.valueOf(x);
                for(int k=0;k<3-str.length();k++){
                    System.out.printf("0");
                }
                System.out.println(x);
                //Complete this line
            }
            System.out.println("================================");

    }
}



