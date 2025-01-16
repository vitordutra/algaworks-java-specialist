public class PromocaoAritmetica2 {

    public static void main(String[] args) {
        long x = 10;
        float y = 9.34f;
        // apesar de long ter 64 bits e float 32 bitss, float leva vantagem por
        // ser ponto fltuante
        // long z = x * y; // não compila
        float z = x * y;

        System.out.println(z);
    }
    
}
