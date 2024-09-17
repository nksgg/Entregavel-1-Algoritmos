import java.util.Scanner;

public class Fibonacci {
Scanner scanner = new Scanner(System.in);
  public void Fibonacci() {
    System.out.print("Digite o número de termos: ");
    int n = scanner.nextInt();

    int a = 0, b = 1;
    System.out.print(a + ", " + b);

    for (int i = 2; i < n; i++) {
      int temp = b;
      b = a + b;
      a = temp;
      System.out.print(", " + b);
    }
  }
}