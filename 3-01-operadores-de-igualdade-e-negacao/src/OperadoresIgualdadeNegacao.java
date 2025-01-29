public class OperadoresIgualdadeNegacao {

    public static void main(String[] args) {
        // boolean numerosIguais = 10 == 20;
        // boolean numerosIguais = (4 + 6) == (5 * 2);
        int numero1 = 10;
        int numero2 = 11;
        // boolean numerosIguais = numero1 == 10;
        boolean numerosIguais = numero1 == numero2;
        System.out.printf("%b%n", numerosIguais);
        
        // Operador unário só funciona em booleanos
        System.out.printf("%b%n", !(numero1 == numero2));
        
        // comparação entre strings
        String nome1 = "Thiago";
        String nome2 = "Thiago";

        System.out.printf("nomes iguais? %b%n", nome1 == nome2);
    }
    
}
