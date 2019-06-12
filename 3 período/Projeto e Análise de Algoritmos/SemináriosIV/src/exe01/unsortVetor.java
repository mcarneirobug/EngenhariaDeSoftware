package exe01;

import java.util.Random;

public class unsortVetor {

    private int[] vetor;

    public unsortVetor() {}

    public unsortVetor(int tamanho) {
        this.vetor = new int[tamanho];
        preencherVetor();
    }
    
    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    private void merge(int[] array, int low, int middle, int high) {
        int[] helper = new int[array.length];
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;

            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }

    private void preencherVetor() {
        for(int i = 0; i < vetor.length; i++)
            vetor[i] = geradorAleatorio();
    }

    private int geradorAleatorio() {
        Random gerador = new Random();
        int num = 1 + gerador.nextInt(20);

        if(gerador.nextInt(2) == 1) {
            num = num * -1;
        }
        return num;
    }
    
    public void run() {
        imprimir();
        mergeSort(vetor, 0, vetor.length-1);
        imprimir();
    }
    
    public static void runUNSORT() {
    	unsortVetor vetor = new unsortVetor(10);
        vetor.run();
    }

    private void imprimir() {
        for(int i = 0; i < vetor.length; i++)
            System.out.print(vetor[i] + " ");
        System.out.println("");
    }
}