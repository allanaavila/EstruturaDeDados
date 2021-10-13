package lista;

public class Main {

    public static void main(String[] args) {
        
        Metodos metodo = new Metodos();
        
        Funcionario f1 = new Funcionario("Gerson", "prof", 1230);
        metodo.inserirElementoInicio(f1);
        metodo.exibir(metodo.getAtual());
        metodo.pesquisar(metodo.getAtual(), f1.getMatricula());
        
        
    }
}
