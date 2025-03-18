import java.util.Scanner;

public class ApostaMegasena {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNumeros = 0;
        do {
            System.out.println("Quantidade de números: ");
            quantidadeDeNumeros = entrada.nextInt();
            if (quantidadeDeNumeros < 6 || quantidadeDeNumeros > 15) {
                System.out.println("Quantidade de números deve ser entre 6 e 15");
            }
        } while (quantidadeDeNumeros < 6 || quantidadeDeNumeros > 15);
        
        int numeroAtual = 1;
        String numerosEscolhidos = "";
        
        do {
            System.out.printf("Número %d/%d: ", numeroAtual, quantidadeDeNumeros);
            int numeroEscolhido = entrada.nextInt();
            
            if (numeroEscolhido < 1 || numeroEscolhido > 60) {
                System.out.println("Número deve ser de 1 a 60");
            } else {
                numerosEscolhidos += numeroEscolhido + " ";
                numeroAtual++;
            }
        } while (numeroAtual <= quantidadeDeNumeros);

        System.out.printf("Números escolhidos: %s%n", numerosEscolhidos);
    }
    
    
}
