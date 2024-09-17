import java.util.Scanner;

public class Quicksort {
  Scanner prompt = new Scanner(System.in);
  int n, num, soma = 0, i = 0;

  public void Quicksort() {
    System.out.print("Quantidade de números: ");
    int n = prompt.nextInt();
    int[] vetor = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Número " + i + ": ");
      num = prompt.nextInt();
      vetor[i] = num;
    }
    System.out.println("Vetor original: ");
    for (int i = 0; i < n; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println();
    quicksort(vetor, 0, n - 1);
    System.out.println("Vetor ordenado: ");
    for (int i = 0; i < n; i++) {
      System.out.print(vetor[i] + " ");
    }
  }

  private void quicksort(int[] arr, int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quicksort(arr, low, pi - 1);
      quicksort(arr, pi + 1, high);
    }
  }

  private int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return i + 1;
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}