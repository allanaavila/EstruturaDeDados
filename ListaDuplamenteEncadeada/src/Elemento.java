
public class Elemento {
	
	private Elemento prox, ant; 
	private Object objeto;
	
	
	public Elemento() {
		
	}
	
	public Elemento(Elemento prox, Elemento ant, Object objeto) {
		this.prox = prox;
		this.ant = ant;
		this.objeto = objeto;
	}
	
	public void setProx(Elemento prox) {
		this.prox = prox;
	}
	public Elemento getProx() {
		return this.prox;
	}
	
	public void setAnt(Elemento ant) {
		this.ant = ant;
	}
	public Elemento getAnt() {
		return this.ant;
	}
	
	public void setobbejto(Object objeto) {
		this.objeto = objeto;
	}
	public Object getObjeto() {
		return this.objeto;
	}
	
	@Override
	public String toString() {
		return " " + objeto;
	}
}
