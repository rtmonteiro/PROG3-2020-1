public class Exercicio_3_13_6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int fibonacci = a + b;
        while (fibonacci <=100) {
            System.out.println(fibonacci);
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }
    }
}
