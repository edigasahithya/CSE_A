import java.util.Scanner;
public class add_num
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter First No:");
   int num1=sc.nextInt();
   System.out.println("Enter Second No:");
   int num2=sc.nextInt();
   int sum=num1+num2;
   System.out.println("sum of num1 & num2: " +sum);  
  }
}
