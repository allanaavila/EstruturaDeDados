
public class Alocacao {

	public static void main(String[] args) {
		Alocacao aloc1 = new Alocacao();
		Alocacao aloc2 = new Alocacao();
		Alocacao aloc3;
		
		
		
		aloc3 = aloc1; // Recebe endereco do aloc1
		
		
		
		System.out.println(aloc1); // endereco de memoria
		System.out.println(aloc2);	// endereco de memoria
		System.out.println(aloc3);	
		
		
		aloc1 = aloc2;
		aloc3 = aloc1;
		
		System.out.println(aloc1); 
		System.out.println(aloc2);	
		System.out.println(aloc3);
		

	}

}
