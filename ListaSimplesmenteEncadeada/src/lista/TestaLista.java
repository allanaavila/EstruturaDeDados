
package lista;

public class TestaLista {

    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        metodo.inserirElementoInicio("Gerson");
        metodo.inserirElementoInicio("Sandra");
        metodo.inserirElementoInicio("Mel");
        metodo.inserirElementoInicio("Gaia");
        metodo.inserirElementoInicio("Anna");
        metodo.exibir(metodo.getAtual());
        //metodo.pesquisar(metodo.getAtual(),"Anna");
        if(metodo.remover(metodo.getAtual(),"Joana")){
            System.out.println("Removido com sucesso!");
        }else{
            System.out.println("Não foi possível remover");
        }
         metodo.exibir(metodo.getAtual());
    }
}
