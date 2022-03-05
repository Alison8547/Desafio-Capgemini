package desafios;

public class Questao2 {
    // Metodo retornando a quantidades de pares, passando no parametro o vetor e o 'x' que a diferença tem que ser igual a ele
    public static int quantidadePares(int[] vetor, int x) {
        int pares = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] - x == vetor[j]) { // Conferindo cada for e elementos do vetor - x igual ao vetor[j]
                    pares++; // cada vez que valida adiciona a pares
                }
            }
        }
        return pares; // retornando a quantidade de pares
    }
}
