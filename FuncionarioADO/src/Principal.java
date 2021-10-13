
public class Principal {

	public static void main(String[] args) {
		
		Metodos metodos = new Metodos();
		
		Funcionario func = new Funcionario("Allana Avila", "Programador", 1234, 4500);
		Funcionario func1 = new Funcionario("Gabriel Lapa", "Programador", 1515, 4000);
		
		
		metodos.inserirElementos(func);
		metodos.inserirElementos(func1);
		
		metodos.exibirElemento(metodos.getAtual());
		
		metodos.remover(metodos.getAtual(), 1515);
		metodos.exibirElemento(metodos.getAtual());

	}

}
