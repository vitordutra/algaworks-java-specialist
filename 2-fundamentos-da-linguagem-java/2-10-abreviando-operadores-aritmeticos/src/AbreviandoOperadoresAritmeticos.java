public class AbreviandoOperadoresAritmeticos {
    public static void main(String[] args) {
        int quantidadeProdutos = 10;
        
        // Isso aqui:
        //quantidadeProdutos = quantidadeProdutos + 3;
        
        // É o mesmo que isso aqui
        quantidadeProdutos += 3;
        System.out.println(quantidadeProdutos); // 13
        
        quantidadeProdutos -= 3;
        System.out.println(quantidadeProdutos); // 10
        
        quantidadeProdutos *= 3;
        System.out.println(quantidadeProdutos); // 30
        
        quantidadeProdutos /= 3;
        System.out.println(quantidadeProdutos);// 10
        
        quantidadeProdutos %= 3;
        System.out.println(quantidadeProdutos); // 1
        
    }
}
