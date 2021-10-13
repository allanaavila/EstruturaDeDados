
public class Funcionario {
	
	private String nomeFuncionario;
	private String cargo;
	private int matricula;
	private float salario;
	
	
	public Funcionario(String nomeFuncionario, String cargo, int matricula, float salario){
		
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.matricula = matricula;
		this.salario = salario;
		
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getNomeFuncionario() {
		return this.nomeFuncionario;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCargo() {
		return this.cargo;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getSalario() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return "Nome Funcionario: " + nomeFuncionario + " " +
				"Cargo:  " + cargo +  " " +
				"Matricula: " + matricula + " " + 
				"Salario:  " + salario + " ";
	}

}
