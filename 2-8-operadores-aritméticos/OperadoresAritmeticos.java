public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		int minhaIdade = 40;
		int suaIdade = 25;
		
		int totalIdades = minhaIdade + suaIdade;
		
		//Adição
		System.out.println("Total das idades: " + totalIdades);
		
		//Subtração
		int diferencaIdades = minhaIdade -  suaIdade;
		System.out.println("Diferença das idades: " + diferencaIdades);
		
		// Multiplicação
		int dobroDaIdade = 2 * suaIdade;
		System.out.println("Dobro da sua idade: " + dobroDaIdade);
		
		// Divisão
		// Como está atribuida a um inteiro, perdemos casas decimais
		int metadeDaSuaIdade = suaIdade / 2;
		System.out.println("Metade da sua idade: " + metadeDaSuaIdade);
		
		// Módulo (Resto da divisão)
		int restoDaDivisão = 7 % 2;
		System.out.println("Resto da divisão: " + restoDaDivisão);
	}
	
}