public class Metodos {
	
    private Elemento atual = null;
    private int quantidadeElementos = 0;

    public Elemento getAtual() {
	return atual;	
    }
    
    public void descontoProdutos(Elemento elemento, String categoria, float percentualDesconto) {
        
        System.out.println("\n");
        System.out.println("Lista de Descontos para Categoria: " + categoria);
        
        System.out.println("Produto             Preco            Valor com Desconto");
        
        while(elemento != null){
            ListaCompra item = (ListaCompra)elemento.getObjeto();

            if(item.getCategoria() == categoria){
                float precoSemDesconto = item.getPreco();
                item.setPreco(item.getPreco() - (item.getPreco() * percentualDesconto));
                System.out.println(item.getNomeProduto() + "         " + precoSemDesconto + "                 " + item.getPreco()); 
            }
            
            elemento = elemento.getAnt();
        }

    }

    
    public void cupomFiscal(Elemento elemento){
        System.out.println("\n");
        System.out.println("               Cupom Fiscal      ");
        System.out.println("Qtde      Produto                       Preco");
         
        float totalDaCompra = 0;
        
        while(elemento != null){
            ListaCompra item = (ListaCompra)elemento.getObjeto(); //cast
            
            //somar cupom fiscal
            totalDaCompra += (item.getPreco() * item.getQuantidade());

            System.out.println(item.getExibeItemCupomFiscal());
            
            elemento = elemento.getAnt();
        }
        
        System.out.println("                                  Total: " + totalDaCompra);
    }
    

    public void inserirElemento(Object objeto){
	Elemento novoElemento = new Elemento(objeto, atual);
	//Esse elemento ele é o atual
	this.atual = novoElemento;
	quantidadeElementos++;
    }
    
    public void exibir(Elemento elemento) {
	while(elemento != null) {
            System.out.print(elemento + " ");
            elemento=elemento.getAnt();
	}
    }
    
    public void pesquisarLista(Elemento elemento, Object objeto) {
	String s = (String) objeto;
        
	while(elemento != null) {
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
    
    public boolean remover(Elemento elemento, int codigo) {
    
        System.out.println("\n");
        System.out.println("Removendo produto pelo seu codigo");
        System.out.println("Remover elemento com codigo: " + codigo);
        
        System.out.println("Produto removido!");
        Elemento aux = elemento;
        
        while(elemento != null) {
            
            ListaCompra item = (ListaCompra)elemento.getObjeto();
            
            if(item.getCodigo() == codigo) {
                       
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

