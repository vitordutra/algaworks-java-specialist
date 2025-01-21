public class ExemploFloatDouble {
    public static void main(String[] args) {
        // Se digitar 84.9 o compilador Java vai entender já como double
        // o nome do número sem o d é "literal
        double peso = 84.9d; // d é opcional
        System.out.println(peso);
        
        // f não é opcional
        float taxa = 1_294.93f;
        System.out.println(taxa);
    }
}
