import java.util.Scanner;

public class Main{
    
    public static void main(String args[])  {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a first number:");
        
        int a = sc.nextInt();
        
        System.out.println("Enter a second number:");
        
        int b = sc.nextInt();
        
        int sum = a + b;
        
        System.out.println("Addition of a and b is:"+ sum);
        
    }
}