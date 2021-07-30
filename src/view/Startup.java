package view;

import controller.Operacoes;

public class Startup {
    
    public static void batch(int size) {
        int[] test = new int[size];
        // Resultados
        System.out.println(" " + size + " pos. - Tempo 1: " + Operacoes.percorreVetor1(test) + " s");
        System.out.println(" " + size + " pos. - Tempo 2: " + Operacoes.percorreVetor2(test) + " s");
    }
}
