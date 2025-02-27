import java.util.Scanner;

public class CalculadoraComplexaDeIMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu gênero: M ou F");
        String genero = entrada.nextLine();

        System.out.println("Digite seu peso");
        double peso = entrada.nextDouble();

        System.out.println("Digite sua altura");
        double altura = entrada.nextDouble();
        
        double imc = peso / (altura * altura);
        
        if (genero.equals("F")) {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso");
            } else if ( imc < 25.8) {
                System.out.println("No peso ideal");
            } else if ( imc < 27.3) {
                System.out.println("Um pouco acima do peso");
            } else if ( imc < 32.3) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obesa");
            }
        } else {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso");
            } else if ( imc < 26.4) {
                System.out.println("No peso ideal");
            } else if ( imc < 27.8) {
                System.out.println("Um pouco acima do peso");
            } else if ( imc < 31.1) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
        }
        
    }
    
}
