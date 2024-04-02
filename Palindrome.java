package Task9;

import java.util.Scanner;

public class Palindrome {
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
            s1=s1+s.charAt(i);
        }
        
        if(s.equals(s1))
        System.out.println(" the given string " + s + " is palindrome");
        else 
        System.out.println("the string " + s + " is not a palindrome ");

    }
    
}
