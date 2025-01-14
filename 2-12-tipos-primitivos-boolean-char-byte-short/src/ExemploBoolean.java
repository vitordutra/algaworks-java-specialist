public class ExemploBoolean {
    public static void main(String[] args) {
        boolean compraAprovada = true;
        boolean clienteBloqueado = false;

        System.out.println(compraAprovada);
        System.out.println(clienteBloqueado);
        
        
        int quantidadeEstoque = 10;
        int quantidadePedidoCompra = 15;
        
        boolean possuiEstoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;
        System.out.println("Estoque suficiente: " + possuiEstoqueSuficiente);
    }
}
