import java.util.Scanner;

public class CaixaLojaCorrigido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço dos produtos: ");
        double precoProdutos = entrada.nextDouble();

        System.out.print("Cobrar Frete? ");
        boolean cobrarFrete = entrada.nextBoolean();
        
        double valorFrete = 0;
        if (cobrarFrete) {
            System.out.print("Valor do frete: ");
            valorFrete = entrada.nextDouble();
        }
        // valorFrete foi declarada dentro de um bloco
        // Nós só conseguimos usar uma variável dentro do
        // bloco que ela foi criada
        double valorTotal = precoProdutos + valorFrete;

        System.out.printf("Valor total: R$%.2f%n", valorTotal);
    }
}
