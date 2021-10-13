package listadupla;

public class Metodos {

    private Elemento inicio = null;
    private Elemento atual, aux;
    private int quantidadeElementos = 0;

    public Elemento getInicio() {
        return inicio;
    }

    public Elemento getAtual() {
        return atual;
    }

    public void inserirElemento(Object objeto) {
        if (inicio == null) {
            Elemento novoElemento = new Elemento(null, null, objeto);
            this.inicio = novoElemento;
            aux = inicio;
        } else {
            Elemento novoElemento = new Elemento(null, aux, objeto);
            this.atual = novoElemento;
            aux.setProx(atual);
            aux = atual;
        }
        quantidadeElementos++;
    }

    public void exibir(Elemento elemento) {
        System.out.print("{");
        if (elemento == atual) {
            while (elemento != null) {
                System.out.print(elemento + " ");
                elemento = elemento.getAnt();
            }
        } else if (elemento == inicio) {
            while (elemento != null) {
                System.out.print(elemento + " ");
                elemento = elemento.getProx();
            }
        }
        System.out.print("}");
    }
    //Fazer uma busca sequencial bidirecional
    public Object busca(Elemento elementoInicio,Elemento elementoFinal ,Object objeto){
      
        return null;
    }
}
