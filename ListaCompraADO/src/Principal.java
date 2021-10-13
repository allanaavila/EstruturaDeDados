
public class Principal {

	public static void main(String[] args) {
		
		Metodos metodos = new Metodos();
		
		Produto produto = new Produto("Arroz", 123, 40, 2, "Alimentacao");
		Produto produto1 = new Produto("Feijao", 2424, 35, 3, "Alimentacao");
		Produto produto2 = new Produto("Coca-Cola", 1313, 12, 2, "Refrigerante");
		Produto produto3 = new Produto("Carne", 3030, 50, 2, "Frios");
				
				
		metodos.inserirElemento(produto);
		metodos.inserirElemento(produto1);
		metodos.inserirElemento(produto2);
		metodos.inserirElemento(produto3);		
		
		System.out.println("Lista Compra!!!");
		
		metodos.exibirElemento(metodos.getAtual()); // sem desconto
		
		
		metodos.descontoProduto(metodos.getAtual(), "Alimentacao",(float) 0.1);
		
		metodos.cupomFiscal(metodos.getAtual());
		
		metodos.removerElemento(metodos.getAtual(), 1313);
		
		metodos.exibirElemento(metodos.getAtual());
		
		metodos.descontoProduto(metodos.getAtual(), "Alimentacao",(float) 0.1);
		
		metodos.cupomFiscal(metodos.getAtual());
		
		
		System.out.println("          \n           VOLTE SEMPRE        ");

	}

}
