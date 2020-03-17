public class Exercicio_3_14_1 {
    public static void main(String[] args) {
        int n = 100;
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        while (b <= n){
            System.out.println(b = a + b);
            a = b - a;
            n--;
        }
    }

    // Tried Recursively
/*    private static int fib(int n) {
        if ( n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }*/
}
