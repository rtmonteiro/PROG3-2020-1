public class Exercicio_3_13_8 {
    public static void main(String[] args) {
        int x = 10;
        for (int i = 1; i < x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", i * j);
            }
            System.out.println();
        }
//        for (int i = 1; i <= x; i++) {
//            if (i == 1) System.out.print("n ");
//            else System.out.printf("n*%d ", i);
//        }

    }
}
