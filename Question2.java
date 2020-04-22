import java.util.Scanner;
public class Question2 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your height (in m): ");
    double height = in.nextDouble();
    System.out.print("Enter your weight: ");
    double weight = in.nextDouble();
    double bmi = (weight / (height * height));
    System.out.print("Your height is: " + height + "\n");
    System.out.print("Your weight is: " + weight + 
    "\n");
    String b = String.format("Your BMI is: %.2f",bmi);
    System.out.print(b);
  }
}
