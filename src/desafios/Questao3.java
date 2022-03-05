package desafios;

public class Questao3 {
    public static String encriptando(String s) {
        char[][] letras = matriz(s); // Utilizando o metodo matriz e passando o texto/frase
        StringBuilder textoCriptografado = new StringBuilder(); // StringBuilder Essa classe permite criar e manipular dados de Strings dinamicamente
        int counter = 0;
        int x = 0;

        while (x < letras.length) { // Enquanto x menor que o tamanho da string
            for (char[] letra : letras) {   // Percorrendo com o for

                if (counter < 4 && letra[counter] != 0) {  // Se counter menor que 4 E letra[counter] diferente de 0 ele vai cair no append
                    textoCriptografado.append(letra[counter]); // Metodo append é tipo um adicionar
                }
            }
            textoCriptografado.append(" "); // adicionando os espaços
            counter++;
            x++;
        }
        return textoCriptografado.toString(); // retornando a string já com o toString
    }

    // Criando um metodo para passar as letras no array bidimensional para cada linha e coluna
    private static char[][] matriz(String s) {
        String stringSemEspaco = s.replaceAll("\\s", ""); // tirando os espaços com o metodo replaceall
        int tamanho = (int) Math.ceil(Math.sqrt(stringSemEspaco.length())); // Math.sqrt pegando a raiz quadrada da string sem espaço e depois o metodo Math.ceil pra pegar o maior valor da raiz quadrada
        char[][] letras = new char[tamanho][tamanho]; // passando o tamanho aqui
        int contador = 0;
        for (int i = 0; i < letras.length; i++) { // criando os for para passar as letras
            for (int j = 0; j < letras[0].length; j++) {
                letras[i][j] = stringSemEspaco.charAt(contador); // metodo charAt para posicao de cada letra
                contador++;
                if (contador == stringSemEspaco.length()) { // se o contador for igual ao tamaho da string. comando break
                    break;
                }
            }

        }
        return letras; // retornando as letras
    }
}
