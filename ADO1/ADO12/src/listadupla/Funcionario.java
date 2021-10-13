package listadupla;

public class Funcionario {

    private String nome, cargo;
    private int matricula;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cargo, int matricula, float salario){
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cargo=" + cargo
                + ", matricula=" + matricula + ", salario=" + salario + "}\n";
    }

}
