public class Exercicio_3_13_4 {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 0; i <= 10; i++) {
            if (i == 0) System.out.println("O fatorial de " + i + " é 1");
            else {
                System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", i, i - 1, i, fatorial *= i);
            }
        }
    }
}
