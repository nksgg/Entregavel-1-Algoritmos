import java.util.Scanner;

public class Contagem{
  Scanner prompt = new Scanner(System.in);
    int n, nota, cont = 0, i = 0;
      public void Contar(){
        System.out.println("Quantidade de Alunos: ");
        n = prompt.nextInt();

          while(i < n){
            System.out.println("Nota do Aluno: "); 
            nota = prompt.nextInt();
            if(nota >= 50){
              cont++;
            }
            i++;
          }
          System.out.println("São " + n + " alunos");
          System.out.println("São " + cont + " alunos aprovados");  

      }

}