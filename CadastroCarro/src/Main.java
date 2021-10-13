import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos carros sera cadastrado?");
		int n = teclado.nextInt();
		
		System.out.println("\n");
		
		
		Carro[] carros = new Carro[n];
		
		for(int i = 0; i < carros.length; i++) 
			carros[i] = new Carro();
	
		
		for(int i = 0; i < carros.length; i++) {
			teclado.nextLine();
			
			System.out.println("Modelo: ");
			carros[i].setModelo(teclado.nextLine());
			
			System.out.println("Chassi: ");
			carros[i].setChassi(teclado.nextLine());
			
			System.out.println("Ano: ");
			carros[i].setAno(teclado.nextInt());
			
			System.out.println("Preco: ");
			carros[i].setPreco(teclado.nextFloat());
			
			System.out.println("______________________________\n");
			
		}
		
		
        for(int i = 0; i < carros.length; i++){
        	
        	System.out.println("Cadastrado com Sucesso!!! \n");
        	
            System.out.println("Modelo: " + carros[i].getModelo());
            System.out.println("Chassi: " + carros[i].getChassi());
            System.out.println("Ano: " + carros[i].getAno());
            System.out.println("Preco: " + carros[i].getPreco());

            
            System.out.println("_____________________\n");
            
        }
		
		
	}

}
