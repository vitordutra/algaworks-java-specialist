public class PromocaoAritmetica1 {

    public static void main(String[] args) {
        // z é int
//        int x = 10;
//        int y = 5;
//        int z = x * y;
//        
//        z é long
//        long x = 10;
//        long y = 5;
//        long z = x * y;

        // Não compila sem cast
        // Sempre que fizermos uma operação aritimetica, o resultado será
        // igual ao tipo maior
        // ou seja, z é long
        // Isso é uma promoção aritmética
        int x = 10;
        long y = 5;
        long z = x * y;
        System.out.println(z);
    }
    
}
