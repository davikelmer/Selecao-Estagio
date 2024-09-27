import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fibonnacci {
    public static List<Integer> fibonacciSequence(int n) {
        List<Integer> sequencia = new ArrayList<>();
        sequencia.add(0);
        sequencia.add(1);
        for (int i = 2; i < n; i++) {
            int nextValue = sequencia.get(i - 1) + sequencia.get(i - 2);
            sequencia.add(nextValue);
        }
        return sequencia;
    }
    public static boolean checkFibonnaci(int num){
        if (num < 0) {
            return false;
        }
        List<Integer> sequencia = fibonacciSequence(30);
        return sequencia.stream().anyMatch(n -> n == num);
    }

    public static void main(String[] args) {
        int num = 5;
        if (checkFibonnaci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }
}
