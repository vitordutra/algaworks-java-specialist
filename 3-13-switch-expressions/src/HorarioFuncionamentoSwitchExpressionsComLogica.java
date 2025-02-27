import java.util.Scanner;

public class HorarioFuncionamentoSwitchExpressionsComLogica {

    public static void main(String[] args) {
        // Exemplo de como switch case pode ser utilizado para economizar linhas
        // de código

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um dia da semana (ex: seg, ter, qua, etc)");
        String diaSemana = entrada.nextLine();

        System.out.println("Digite um mês");
        String mes = entrada.nextLine();
        
        // Switch expression
        String horarioFuncionamento = switch (diaSemana) {
            case "seg" -> {
                if (mes.equals("dez")) {
                    yield "8:00 às 18:00";
                }
                yield "Fechado";
            }
            case "ter", "qua", "qui", "sex" -> "8:00 às 18:00";
            case "sab", "dom" -> "8:00 às 12:00";
            // Obrigado a colocar um default
            default -> "Dia Inválido";
        };
        
//        switch (diaSemana) {
//            case "seg" -> horarioFuncionamento = "Fechado";
//            case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "8:00 às 18:00";
//            case "sab", "dom" -> horarioFuncionamento = "8:00 às 12:00";
//            default -> horarioFuncionamento = "Dia Inválido";
//        }

        System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
    }
    
}
