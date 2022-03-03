package desafios;

import java.util.Arrays;

public class Questao1 {
    public static void mediana(int[] numeros) { // metodo retornando um número int passando como parametro um array de inteiros
        Arrays.sort(numeros); // ordenando meu array
        int meio;
        if (numeros.length % 2 != 0) { // Se o numeros de elementos for diferente de resto da divisão igual 0 quer dizer que ele é impar
            meio = numeros[numeros.length / 2]; // Dividindo por 2 o numero de elementos do array
            System.out.println(meio);
        }
    }
}
