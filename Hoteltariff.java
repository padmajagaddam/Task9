package Task9;

import java.util.Scanner;

public class Hoteltariff {
    public static void main(String args[])
    {
        int month,days;
        float rent,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the month days and rent");
        month = scanner.nextInt();
        days = scanner.nextInt();
        rent = scanner.nextFloat();
                //d = rent*(20/100);
       // for(month=1;month<=12;month++)
      // {
            switch(month)
            {
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.println("the rent u have to pay is " +(days*rent) );  
            break;      
                case 4:
                case 5:
                case 6:
                case 11:
                case 12:
            System.out.println("the rent u have to pay is " +String.format("%.2f",(days*(rent+=rent*20/100)) ));
            break;
            default:
                System.out.println("INVALID ENTER");
            }

       // }

    }
    
}
