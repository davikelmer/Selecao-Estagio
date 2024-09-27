public class LetterSearcher {
    public static int contadorDeA(String texto){
        int contador = 0;
        char caracter = 'a';
        String textoMinusculo = texto.toLowerCase();
        for(char c: textoMinusculo.toCharArray()){
            if (c == caracter){
                contador++;
            }
        }
        return contador;
    }


    public static void main(String[] args) {
        String texto = "Anastasia ama visitar a quadra.";
        int contador = contadorDeA(texto);
        
        System.out.println("A letra A aparece: " + contador + " vezes");

    }
}
