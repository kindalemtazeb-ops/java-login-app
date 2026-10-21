import java.util.Scanner;

public class calc {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int Fnumber;
        Fnumber=scanner.nextInt();
        System.out.println("enter the second number");
        int Snumber;
        Snumber=scanner.nextInt();
        int result=Fnumber+Snumber;
        System.out.println("the result is :" + result);

    }
}
