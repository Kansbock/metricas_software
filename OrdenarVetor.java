import java.util.Random;

public class OrdenarVetor {
    public static void main(String[] args) {
        // Cria um vetor com 100 números inteiros
        int[] numeros = new int[100];
        Random rand = new Random();

        // Preenche o vetor com números inteiros aleatórios entre 1 e 1000
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(1000) + 1;
        }

        // Ordena o vetor usando Selection Sort
        selectionSort(numeros);

        // Imprime o vetor ordenado
        System.out.println("Números ordenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    // Função para ordenar o vetor usando Selection Sort
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Encontra o menor elemento na parte não ordenada do vetor
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca o menor elemento encontrado com o elemento na posição i
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}