public class ExemploString {
    public static void main(String[] args) {
        System.out.println("Fala, mergulhador!");
        
        int x = 10;
        int y = 5;
        int z = x + y;

        System.out.println("Resultado: " + z);
        
        // Concatenação
        System.out.println("Resultado: " + x + y);
        
        // O compilador só concatena a partir do primeiro texto encontrado 
        System.out.println(x + y + " foi o resultado");

        // Para calcular primeiro coloque x + y entre parênteses, isso indica
        // precedência
        System.out.println("Resultado: " + (x + y));
        
        String nome = "Maria";
        int idade = 30;

        System.out.println(nome + " tem " + idade + " anos.");
    }
}
