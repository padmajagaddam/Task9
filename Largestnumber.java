package Task9;

import java.util.Scanner;

public class Largestnumber {
    public static void main (String args[])
    {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter the numbers to find largest");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("The number " + a + "is the largest");

        }else{
            if(b>a&&b>c)
            {
                System.out.println("The number "+ b +" is the largest");
            }else{
                System.out.println("the number " + c + " is the largest");
            }
        }

    }
    
}
