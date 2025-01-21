public class OperadorIncremento {
    public static void main(String[] args) {
        int totalDownloads = 10;
        
        // totalDownloads = totalDownloads + 1;
        // totalDownloads += 1;
        // totalDownloads++;
        
        // Primeiro atribui depois incremente
        // int novoTotalDownloads = totalDownloads++;
        
        // Primeiro incrementa depois atribui
        int novoTotalDownloads = ++totalDownloads;
        
        System.out.println("Total de Downloads: " + totalDownloads);
        System.out.println("Total de Downloads: " + novoTotalDownloads);
    }
}
