import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Triangle base: ");
    int base = in.nextInt();
    String str = "*";
    for (int i = 0; i < base; i++){
      System.out.println(str.repeat(base-i));
    }
  }
}
