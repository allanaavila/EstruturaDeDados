 
package lista;
 
public class Funcionario {
    private String nome,cargo;
    private int matricula;

    public Funcionario() {
    }

    public Funcionario(String nome, String cargo, int matricula) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
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

    @Override
    public String toString() {
        return "{" + "nome=" + nome + ", cargo=" + cargo + ", matricula=" + matricula + '}';
    }

}
