package Task9;

import java.util.Scanner;

public class Universitygrade {
    public static void main(String args[])
    {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the marks for your grade");
        n=scanner.nextInt();
        if(n>100)
        {
            System.out.println("entered marks are INVALID");
        }else{
            if(n==100)
            {
                System.out.println("The Grade for your marks is  S" );
            }
            else{
                if(n<=99&&n>=90)
                {
                    System.out.println("The Grade for your marks is  A" ); 
                }
                else{
                    if(n<=89&&n>=80)
                    {
                        System.out.println("The Grade for your marks is B" ); 
                    }
                    else{
                        if(n<=79&&n>=70)
                        {
                            System.out.println("The Grade for your marks is  C" ); 
                        }
                        else
                            {
                                if(n<=69&&n>=60)
                            {
                                System.out.println("The Grade for your marks is  D" ); 
                            }
                            else{
                                if(n<=59&&n>=50)
                                {
                                    System.out.println("The Grade for your marks is  F" ); 
                                }else{
                                    System.out.println("The Grade for your marks is  FAIL" );
                              
                                  }
                                  }
                                }
                            }
                        }
                    }
            }
        }
    }
    

