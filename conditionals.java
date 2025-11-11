import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
     int a=10,b=20;
     int c=a+b;
     if (c<30){
            System.out.println("c is less than 30");
     }
     else if (c==30){
            System.out.println("c is equal to 30");
     }
     else{
        System.out.println("c is greater than 30");
     }
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number between 1 and 7: ");
     int day  = sc.nextInt();

switch (day) 
{
       case 1:
       System.out.println("Monday");
       break;
       case 2:
       System.out.println("Tuesday");
       break;
       case 3:
       System.out.println("Wednesday");
       break;
       case 4:
       System.out.println("Thursday");
       break;
       case 5:
       System.out.println("Friday");
       break;
       case 6:
       System.out.println("Saturday");
       break;
       case 7:
       System.out.println("Sunday");
       break;        
       default:
       System.out.println("Invalid day");
}

}

}
