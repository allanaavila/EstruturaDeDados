public class Main {
  public static void main(String[] args) {
    
   Metodos metodo = new Metodos();
        
    // produto, categoria, codigo, quantidade e preco
    ListaCompra c1 = new ListaCompra("Arroz      ", "Alimentacao", 123, 2, 35);
    ListaCompra c2 = new ListaCompra("Coca- Cola ", "Refrigerante", 234, 3, 12);
    ListaCompra c3 = new ListaCompra("Sabao em Po", "Limpeza", 456, 5, 25);
    ListaCompra c4 = new ListaCompra("Feijao     ", "Alimentacao", 678, 1, 10);
        
    
    metodo.inserirElemento(c1);
    metodo.inserirElemento(c2);
    metodo.inserirElemento(c3);
    metodo.inserirElemento(c4);
    
    
    System.out.println("* Compra!!! *");
    metodo.exibir(metodo.getAtual()); // sem desconto

    System.out.println("\n");

    metodo.descontoProdutos(metodo.getAtual(),"Alimentacao",(float) 0.1);
    
    
    metodo.cupomFiscal(metodo.getAtual());

        
    metodo.remover(metodo.getAtual(), 234);
        
    metodo.descontoProdutos(metodo.getAtual(),"Alimentacao",(float) 0.1);
    
    metodo.cupomFiscal(metodo.getAtual());
  }
}