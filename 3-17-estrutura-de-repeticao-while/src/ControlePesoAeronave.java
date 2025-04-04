import java.util.Scanner;

public class ControlePesoAeronave {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Peso máximo da aeronave: ");
        int pesoMaximo = entrada.nextInt();

        int pesoTotalPassageiros = 0;
        boolean incluirNovoPassageiro = true;
        
        while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
            System.out.printf("Peso do passageiro: ");
            int pesoPassageiro = entrada.nextInt();

            pesoTotalPassageiros += pesoPassageiro;

            System.out.println("Incluir novo passageiro?");
            incluirNovoPassageiro = entrada.nextBoolean();
            
        }

        System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
        System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
    }

}
