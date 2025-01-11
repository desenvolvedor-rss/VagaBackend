import java.util.Scanner;

/**
 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

 IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */

public class SequenciaBackend {    public static boolean pertenceFibonacci(int n) {
        int a = 0, b = 1;
        while (a < n) {int temp = a; a = b; b = temp + b;
        }
        return a == n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência: ");
        int num = scanner.nextInt();

        if (pertenceFibonacci(num)) {
            System.out.println(num + " pertence à sequência.");
        } else {
            System.out.println(num + " não pertence à sequência.");
        }
    }
}

