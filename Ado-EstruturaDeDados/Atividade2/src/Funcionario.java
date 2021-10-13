public class Funcionario {

    private String nomeFuncionario, cargo;
    private int matricula;
    private float salario;

    public Funcionario(String nomeFuncionario, int matricula, String cargo, float salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome Funcionario: " + nomeFuncionario + 
                "\nMatricula: " + matricula + 
                "\nCargo: " + cargo + 
                "\nSalario: " + salario;
    }
    
}