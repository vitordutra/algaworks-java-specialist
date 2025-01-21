public class ExemploLong {
    public static void main(String[] args) {
        // A partir do Java 7: underscores para separar milhares
        long populacaoUberlandia = 699_097;
        
        // Tem que colocar o L no final para dizer para o compilador que é do tipo
        // long e não int
        long maxInt = 2_147_483_648L;
        
        System.out.println(maxInt);
    }
}
