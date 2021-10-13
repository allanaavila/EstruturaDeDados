
public class Produto {
	
	private String nomeProduto;
	private int codigo;
	private float preco;
	private String categoria;
	private int quantidade;
	
	
	public Produto(String nomeProduto, int codigo, float preco, int quantidade, String categoria) {
		
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
		
	}
	
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getNomeProduto() {
		return this.nomeProduto;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPreco() {
		return this.preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCategoria() {
		return this.categoria;
	}
	
	public String getExibeItemCupomFiscal() {
		return " " + quantidade + "           " + nomeProduto + "       " + preco;
	}
	
	@Override
	
	public String toString() {
		return 	"\n Nome Produto: " + nomeProduto + " " +
				"Codigo: " + codigo + " " +
				"Preco: " + preco + " " +
				"Qtda: " + quantidade + " " +
				"Categoria: " + categoria +  " \n";
	}
}
