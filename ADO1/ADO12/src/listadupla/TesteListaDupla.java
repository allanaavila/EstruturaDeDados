package listadupla;

public class TesteListaDupla {

    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        Funcionario funcionario1 = new Funcionario("Gerson", "Prof", 1212, 2000);
        Funcionario funcionario2 = new Funcionario("Sandra", "Gerente", 3232, 5000);
        Funcionario funcionario3 = new Funcionario("Mel", "Diretora", 3311, 15000);
        Funcionario funcionario4 = new Funcionario("Tchá", "Chefe da segurança", 1121, 3000);

        metodo.inserirElemento(funcionario1);
        metodo.inserirElemento(funcionario2);
        metodo.inserirElemento(funcionario3);
        metodo.inserirElemento(funcionario4);

        metodo.exibir();

        System.out.println("=== Remover ===");
        System.out.println(metodo.remover(1212));

        metodo.exibir();

    }
}
