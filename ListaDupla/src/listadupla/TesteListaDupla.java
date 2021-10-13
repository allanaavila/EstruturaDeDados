package listadupla;

public class TesteListaDupla {

    public static void main(String[] args) {
        Metodos metodo = new Metodos();

        metodo.inserirElemento("Gerson");
        metodo.inserirElemento("Anna");
        metodo.inserirElemento("Sandra");
        int opc = 2;

        if (opc == 1) {
            metodo.exibir(metodo.getAtual());
        } else if (opc == 2) {
            metodo.exibir(metodo.getInicio());
        }

    }
}
