
public class Carro {
	
	private String marca;
	private int ano;
	private float preco;
	
	
	
	//Metodos Acessores(Getters e Setters)
	public void setMarca(String marca) {
		
		this.marca=marca;	
	}
	
	public String getMarca() {
		
		return marca;
		
	}
	
	public void setAno(int ano) {
		
		this.ano=ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setPreco(float preco) {
		
		this.preco=preco;
	}
	
	public float getPreco() {
		
		return preco;
	}
	
	@Override
	public String toString() {
		
		return "Carro { " + "Marca = " + marca 
				+ ", Ano = " + ano + ", Preco = " + preco + '}';
	}
	
}

	
