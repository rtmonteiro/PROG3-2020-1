public class Exercicio_3_13_5 {
    public static void main(String[] args) {
        long fatorial = 1;
        for (int n = 0; n <= 20; n++) {
            if (n == 0) System.out.println("O fatorial de " + n + " é 1");
            else {
                System.out.printf("O fatorial de %d é (%d!) * %d = %d\n", n, n - 1, n, fatorial *= n);
            }
        }
    }
}
