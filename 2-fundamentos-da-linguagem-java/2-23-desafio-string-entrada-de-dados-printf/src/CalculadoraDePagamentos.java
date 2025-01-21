import java.util.Scanner;

public class CalculadoraDePagamentos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("Digite seu valor por hora: ");
        double valorPorHora = sc.nextDouble();

        System.out.printf("Digite a quantidade de horas trabalhadas: ");
        int quantidadeDeHorasTrabalhadas = sc.nextInt();
        
        double salarioSemDescontos = valorPorHora * quantidadeDeHorasTrabalhadas;

        System.out.printf("Digite o valor dos descontos: ");
        double valorDescontos = sc.nextDouble();
        
        double totalDevido = salarioSemDescontos - valorDescontos;

        System.out.printf("Folha de Pagamento: %s%n" +
                "%d horas x R$%.2f = R$%.2f%n" +
                "Descontos: R$%.2f%n" +
                "Total devido: R$%.2f%n", nome, quantidadeDeHorasTrabalhadas, 
                valorPorHora, salarioSemDescontos, valorDescontos, totalDevido);
    }
    
}
