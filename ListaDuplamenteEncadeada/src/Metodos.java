
public class Metodos {
	
	private Elemento inicio = null;
	private Elemento atual;
	private Elemento aux;
	private int quantidadeElementos = 0;
	
	
	public Elemento getInicio() {
		return inicio;
	}
	public Elemento getAtual() {
		return atual;
	}
	
	// Inserir um elemento no final da lista
	
	public void inserirElemento(Object objeto) {
		
		if(inicio ==  null) {
			Elemento novoElemento = new Elemento(null, null, objeto);
			this.inicio = novoElemento;
			aux = inicio;
		}
		else {
			Elemento novoElemento = new Elemento(null, aux, objeto);
			this.atual = novoElemento;
			aux.setProx(atual);
			aux = atual;
		}
		quantidadeElementos++;
	}
	 
	public void exibir(Elemento elemento) {
		if(elemento == atual) {
		while(elemento != null) {
			System.out.print(elemento + " ");
			elemento = elemento.getAnt();
			}
		}
		else if(elemento  == inicio) {
			while(elemento != null) {
				System.out.print(elemento + " ");
				elemento = elemento.getProx();
			}
		}
	}
	
	
	

}
