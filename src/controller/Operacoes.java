package controller;

public class Operacoes {
    
    public static double percorreVetor1(int[] vetor) {
        double t1 = System.nanoTime();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]++;
        }
        double t2 = System.nanoTime();
        return ((t2-t1)/Math.pow(10, 9));
    }

    public static double percorreVetor2(int[] vetor) {
        double t1 = System.nanoTime();
        for (int i : vetor) {
            i++;
        }
        double t2 = System.nanoTime();
        return ((t2-t1)/Math.pow(10, 9));
    }
}
