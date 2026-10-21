import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter the first number");
        int Fnumber = scanner.nextInt();
        
        System.out.println("enter the second number");
        int Snumber = scanner.nextInt();
        
        System.out.println("enter your choice (+ OR - OR * OR /)");
        
        // Read the first character of the input as a char
        char operator = scanner.next().charAt(0); 
        
    
    switch(operator){
        case '+':
              int add = Fnumber + Snumber;
           System.out.println("the result is :" + add);
           break;
    
    case '-':
         int sub = Fnumber - Snumber;
          System.out.println("the result is :" + sub);
    break;
    case '*':

int mul = Fnumber * Snumber;
 System.out.println("the result is :" + mul);
 break;
 case '/':
    int div = Fnumber / Snumber;
               System.out.println("the result is :" + div);
               break;
               default:
               System.out.println("error: invalid operator");
    }
}
}
//     if (operator == '+') {
    //         int add = Fnumber + Snumber;
    //         System.out.println("the result is :" + add);
    //     } else if (operator == '-') {
    //         int sub = Fnumber - Snumber;
    //         System.out.println("the result is :" + sub);
    //     } else if (operator == '*') {
    //         int mul = Fnumber * Snumber;
    //         System.out.println("the result is :" + mul);
    //     } else if (operator == '/') {
    //         if (Snumber == 0) {
    //             System.out.println("error: division by zero is not allowed");
    //         } else {
    //             int div = Fnumber / Snumber;
    //             System.out.println("the result is :" + div);
    //         }
    //     } else {
    //         System.out.println("error: invalid operator");
    //     }
        
    //     scanner.close();
    // 