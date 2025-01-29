// Desejável: acima de 20 ng/mL
// Grupos de risco: 30 a 60 ng/mL

import java.util.Scanner;

public class ExameVitaminaD {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Grupo de risco: ");
        boolean grupoDeRisco = entrada.nextBoolean();

        System.out.println("Vitamina D: ");
        double vitaminaD = entrada.nextDouble(); //ng/mL
        
        boolean vitaminaDNormal = !grupoDeRisco && vitaminaD > 20
                || grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60;

        System.out.printf("Sua vitamina D está normal: %b%n", vitaminaDNormal);
    }
    
}
