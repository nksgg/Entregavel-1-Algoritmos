import java.util.Scanner;

public class VerificaPrimo {
        Scanner scanner = new Scanner(System.in);
    
        public void VerificaPrimo(){
            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();
    
            if (numero <= 1) {
                System.out.println("O número deve ser maior que 1.");
                return;
            }
    
            int contDivisores = 0;
            for (int i = 1; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    contDivisores++;
                }
            }
    
            if (contDivisores == 1) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
}