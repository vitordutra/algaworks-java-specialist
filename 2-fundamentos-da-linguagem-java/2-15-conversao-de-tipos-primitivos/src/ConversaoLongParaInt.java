public class ConversaoLongParaInt {
    public static void main(String[] args) {
        
        // Não tem como o compilador saber em tempo de compilação que o valor
        // de x cabe em y
        // long x = 10; // 64 bits
        //  int y = x; // 32 bits
        
        // Você pode assumir os riscos e fazer o casting
        long x = 10;
        
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);
        
        long a = 29083476345590L;
        int b = (int) a;

        System.out.println(a);
        System.out.println(b);
    }
}
