public class Main {

  public static void main(String[] args) {
        
    Metodos metodo = new Metodos();
        
    Funcionario f1 = new Funcionario("Thomas", 1234, "Programador", 3500);
    Funcionario f2 = new Funcionario("Allana", 2934, "Programador", 4000);
        
    metodo.inserirElemento(f1);
    metodo.inserirElemento(f2);
    
    
    metodo.exibir(metodo.getAtual());
    
    System.out.println("\n");
        
    //metodo.busca(metodo.getInicio(), 1234);
    
    //System.out.println("\n");
    
    metodo.remover(metodo.getAtual(), 2934);
    metodo.exibir(metodo.getAtual());
    
        
    }
}