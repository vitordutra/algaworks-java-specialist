import java.util.Scanner;

public class AvaliacaoAtendimento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Avalie nosso atendimento de 1 a 5: ");
        int nota = entrada.nextInt();
        
        String descricaoNota;
        
        if (nota == 1) {
            descricaoNota = "Muito ruim";
        } else if (nota == 2) {
            descricaoNota = "Ruim";
        } else if (nota == 3) {
            descricaoNota = "Razoável";
        } else if (nota == 4) {
            descricaoNota = "Bom";
        } else if (nota == 5) {
            descricaoNota = "Excelente";
        } else {
            descricaoNota = "Opção inválida";
        }

        System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);
    }
    
}
