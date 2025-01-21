import java.util.Scanner;

public class IndiceDeMassaCorporal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        // Consome o \n que tá solto depois de darmos enter
        entrada.nextLine();
        
        System.out.print("Digite o seu nome: ");

        String nome = entrada.nextLine();
        
        double imc = peso / (altura*altura);

        System.out.println("Olá " + nome + " seu IMC é de " + imc);
    }
    
}
