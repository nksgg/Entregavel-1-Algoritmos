import java.util.Scanner;

public class MDC {
  Scanner prompt = new Scanner(System.in);
  int n1, n2, resto, mdc;

  public void MDC(){
    System.out.println("Digite o primeiro número: ");
    n1 = prompt.nextInt();
    System.out.println("Digite o segundo número: ");
    n2 = prompt.nextInt();
    while (n2 != 0){
      resto = n1 % n2;
      n1 = n2;
      n2 = resto;
    }
    mdc = n1;
    System.out.println("O MDC é: " + mdc);
  }
}