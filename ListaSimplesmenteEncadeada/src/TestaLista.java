
public class TestaLista {

	public static void main(String[] args) {
		
		Metodoso metodo = new Metodoso();
		metodo.inserirElementoInicio("Gerson");
		metodo.inserirElementoInicio("Sandra");
		metodo.inserirElementoInicio("Mel");
		metodo.inserirElementoInicio("Gaia");
		metodo.inserirElementoInicio("Anna");
		
		metodo.exibir(metodo.getAtual());
			
		//metodo.pesquisar(metodo.getAtual(), "Anna");
		
		
		System.out.println(" ");
		//metodo.remover(metodo.getAtual(), "Gaia");
		//metodo.exibir(metodo.getAtual());
		
		
	}

}
