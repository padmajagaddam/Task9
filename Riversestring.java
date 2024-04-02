package Task9;

import java.util.Scanner;

public class Riversestring {
     public static void main(String args[])
    {
        String s,s1="";
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the string");
        s=scanner.nextLine();
        int i,j;
        j=s.length();
        for(i=j-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        
        System.out.println(" the given string " + s + "  riverse is " + s1);
    }
}



