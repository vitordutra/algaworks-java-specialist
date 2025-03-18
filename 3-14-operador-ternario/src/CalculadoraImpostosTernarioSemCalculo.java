public class CalculadoraImpostosTernarioSemCalculo {

    public static void main(String[] args) {
        char tipoNotaFiscal = 'P';
        double totalFaturado = 1200.30;
        
        double taxaImpostos = tipoNotaFiscal == 'S' ? 0.16 : 0.35;

        double valorImpostos = totalFaturado * taxaImpostos;
        
        System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
    }
    
}
