import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter integer: ");
    int i1 = in.nextInt();
    int[] a = new int[i1];
    int max = 0;
    int modevalue = 0;
    for (int i = 0; i < i1; i++){
      int i2 = in.nextInt();
      a[i] = i2;
      int count = 0;
      for (int j = 0; j<a.length; j++){
        if (a[j] == a[i]){
        count+=1;
        }
        if (count > max){
          max = count;
          modevalue = a[i];
        }
      }
    }
    System.out.print(modevalue);
  }
}
