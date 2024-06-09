import java.util.Scanner;
 class Main
 {

public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     

     String input = obj.next();
  
     System.out.println(input);
     int number = Integer.parseInt(input); 
     

       if (number > 0)
        {
          System.out.println(number+" is positive."); 
       }
       else if (number < 0)
        {
           System.out.println(number+" is negative.");
       }
     {
      
    }
    
}
}