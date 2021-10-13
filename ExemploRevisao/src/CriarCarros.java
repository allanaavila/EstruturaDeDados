import java.util.Arrays;
import java.util.Scanner;

public class CriarCarros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o tamanho: ");
		int n = teclado.nextInt();
		
		//Defino o Array
		Carro[] listaCarros = new Carro[n];
		
			// Instanciando a classe carro
		for(int i = 0; i < listaCarros.length; i++) 
			
			listaCarros[i] = new Carro();
		
		
		// Inserindo as informacoes
		for(int i = 0; i < listaCarros.length; i++) {
			teclado.nextLine(); // Limpar o enter do buffer teclado 
			
			System.out.println("Marca: ");
			listaCarros[i].setMarca(teclado.nextLine());
			
			System.out.println("Ano: ");
			listaCarros[i].setAno(teclado.nextInt());
			
			System.out.println("Preco: ");
			listaCarros[i].setPreco(teclado.nextFloat());
			
			
			System.out.println("---------------");
		}
		
		// Imprimir as informacoes
		
		/*for(Carro c:listaCarros) {
			
			System.out.println("Marca: " +c.getMarca());
			
			System.out.println("Ano: " +c.getAno());
			
			System.out.println("Preco: " +c.getPreco());
			
			System.out.println("---------------");
		}*/
		
		// Imprimir as informacoes
		/*for(Carro c:listaCarros) {
			
			System.out.println(c);
			
			System.out.println("---------------");
		}*/
		
		
		//Imprimir as informacoes
		
		System.out.println(Arrays.toString(listaCarros));
		
		

	}

}
