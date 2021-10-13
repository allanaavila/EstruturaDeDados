
public class Carro {
	
	
	private String modelo;
	private int ano;
	private float preco;
	private String chassi;
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public String getChassi() {
		return this.chassi;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return this.ano;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPreco() {
		return this.preco;
	}
}
