import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter integer: ");
    int i1 = in.nextInt();
    int result = i1*i1;
    String reply = String.format("Your calculated integer is: %d",result);
    System.out.print(reply);
  }
}
