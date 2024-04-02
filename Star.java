package Task9;

import java.util.Scanner;
      
        public class Star {
        
        public static void main(String args[]) {
        
        int i, j, n;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a value for n");
        
        n = scanner.nextInt();
        
        for (i = 1; i <=n; i++) {
        
        for (j = 1; j <=n; j++) {
             if(j==i||j==n-i+1)  
             {
                System.out.print("*") ;
             } else {
        
        System.out.print(" ");
             }
        }
        System.out.println(" ");
}
        }
}

       