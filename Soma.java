import java.util.Scanner;
public class Soma {
  Scanner prompt = new Scanner(System.in);
  int n, num, soma = 0, i = 0;

  public void Soma(){
      System.out.print("Quantidade de números: ");
    int n = prompt.nextInt();

    while (i < n) {
      i = i + 1;
      System.out.print("Número " + i + ": ");
      num = prompt.nextInt();
    soma = soma + num;
      }
    System.out.println("A soma dos números é: " + soma);
  } 
}