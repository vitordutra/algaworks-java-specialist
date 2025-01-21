public class OperadorDecremento {
    public static void main(String[] args) {
        int limiteTentativasLogin = 10;
        
        // limiteTentativasLogin--;
        
        int novoLimiteTentativasLogin = limiteTentativasLogin--;
        
        System.out.println("Total de Downloads: " + limiteTentativasLogin);
        System.out.println("Total de Downloads: " + novoLimiteTentativasLogin);
    }
}
