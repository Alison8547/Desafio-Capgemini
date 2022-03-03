package teste;

import desafios.Questao1;

public class Questao1Test {
    public static void main(String[] args) {
        // Testes com com arrays de tamanho 5,7,9,15
        int[] arr1 = {9, 2, 1, 4, 6};
        int[] arr2 = {10, 6, 7, 8, 1, 2, 3};
        int[] arr3 = {8, 6, 15, 22, 48, 95, 100, 12, 1};
        int[] arr4 = {4,8,9,1,2,48,56,32,58,99,77,85,123,400,18};
        //Chamando os métodos e passando os arrays
        Questao1.mediana(arr1);
        Questao1.mediana(arr2);
        Questao1.mediana(arr3);
        Questao1.mediana(arr4);

    }
}
