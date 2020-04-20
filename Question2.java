import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your height: ");
    double height = in.nextDouble();
    System.out.print("Enter your weight: ");
    double weight = in.nextDouble();
    String h1 = String.format("Your height is: %.2f",height);
    String h2 = String.format("Your weight is: %.2f",weight);
    System.out.print(h1);
    System.out.print(h2);
  }
}
