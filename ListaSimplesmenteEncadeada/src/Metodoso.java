
public class Metodoso {
	
	private Elemento atual = null;
	private int quantidadeElementos = 0;
	
	
	public Elemento getAtual() {
		return atual;
		
	}
	
	
	public void inserirElementoInicio(Object objeto){
		Elemento novoElemento = new Elemento(objeto, atual);
		//Esse elemento ele é o atual
		this.atual = novoElemento;
		quantidadeElementos++;
	}
	
	/*public void exibir(Elemento elemento) {
		for(int i = 0; i < quantidadeElementos; i++) {
			System.out.print(elemento + " ");
			elemento=elemento.getAnt();
		}*/
	
	public void exibir(Elemento elemento) {
		while(elemento != null) {
			System.out.print(elemento + " ");
			elemento=elemento.getAnt();
		}
	}
	
	public void pesquisar(Elemento elemento, Object objeto) {
		String s = (String) objeto;
		
		while(elemento!=null) {
			if(elemento.toString().contains(s)) {
				System.out.println("Achei: " + elemento);
				break;
			}
			
			elemento = elemento.getAnt();
		}
		if(elemento == null) {
			System.out.println("Nao Achei!");
		}
	}

	public boolean remover(Elemento elemento, Object objeto) {
		String s = (String) objeto;
		
		Elemento aux = elemento;
		
		while(elemento != null) {
			if(elemento.toString().contains(s)) {
				
				//remocao do primeiro elemento da lista
				if(elemento == atual) {
					atual = atual.getAnt();
					aux.setAnt(null);
					quantidadeElementos--;
					return true;
					
				// remocao do ultimo elemento da lista
				}else if(elemento.getAnt() == null) {
					aux.setAnt(null);
					quantidadeElementos--;
					return true;
					// remocao de um elemento qualquer
				}else {
					aux.setAnt(elemento.getAnt());
					elemento.setAnt(null);
					quantidadeElementos--;
					
					return true;
				}
			}
			
			aux = elemento;
			elemento = elemento.getAnt();
			
		}
		return false;
	}
	
}

