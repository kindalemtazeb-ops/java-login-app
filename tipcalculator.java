import java.util.Scanner;

public class tipcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int recalculate=1;
        while(recalculate==1){
        System.out.println("please enter initial cost");
        
        int cost = scanner.nextInt();
        
        System.out.println("enter 1 for good service");
        System.out.println("enter 2 for very good service");
        System.out.println("enter 3 for excellent service");
        
        int qualitofservice = scanner.nextInt();
        int totalcost = 0; // Declare it once outside the switch
        
        switch (qualitofservice) {
            case 1: // Removed single quotes to match integer input
                totalcost = cost + 5;
                System.out.println("total cost is :" + totalcost);
                break;
                
            case 2:
                totalcost = cost + 10;
                System.out.println("total cost is :" + totalcost);
                break;
                
            case 3:
                totalcost = cost + 15; // Increased tip for excellent service
                System.out.println("total cost is :" + totalcost);
                break;
                
            default:
                System.out.println("invalid choice");
                
        }
        System.out.print("Do you want to recalculate? Y=1 N=0 ");
        recalculate=scanner.nextInt();
    }
}}