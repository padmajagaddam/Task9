package Task9;

import java.util.Scanner;

public class Stringpattern {
    public static void main(String args[]){
        int x;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        x=scanner.nextInt();
        int c=1;
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
            {
                
                System.out.print (c + " " );
                //System.out.println(++i);
                c++;
               
            }
           
            System.out.println(" ");
        }
    }
    
}
