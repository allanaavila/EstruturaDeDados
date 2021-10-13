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

    public void exibir() {
        Elemento elemento=this.inicio;
        while (elemento != null) {
            System.out.print(elemento + " ");
            elemento = elemento.getProx();
        }
    }

    private Elemento procurarElemento(int posicao) {
        Elemento elemento = inicio;
        if (posicao > 0 && posicao < this.quantidadeElementos) {
            for (int i = 0; i < posicao; i++) {
                elemento = elemento.getProx();
            }
            return elemento;
        }
        throw new IllegalArgumentException("Posi��o inv�lida!");
    }

    public void inserirElemento(Object objeto, int posicao) {
        try {
            //Retorna o elemento da posi��o requerida
            Elemento elementoPosicao = procurarElemento(posicao);
            //Posiciona uma refer�ncia no elemento anterior ao elementoPosicao
            Elemento auxPosicao = elementoPosicao.getAnt();
            //Adicionanado o novo elemento � lista
            Elemento elemento = new Elemento(elementoPosicao, auxPosicao, objeto);
            //Conectando o elemento auxPosicao ao seu novo pr�ximo elemento. 
            auxPosicao.setProx(elemento);
            //Conectando o elemento elementoPosicao ao seu novo anterior elemento.
            elementoPosicao.setAnt(elemento);
            quantidadeElementos++;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean remover(int matricula) {
        Elemento remov = (Elemento) busca(matricula);
        Elemento auxRem;
        if (inicio != null && remov != null) {//Verifica se lista n�o est� vazia
            //Remo��o do primeiro elemento da lista
            if (remov == inicio) {
                inicio = inicio.getProx();//Movido para o pr�ximo
                inicio.getAnt().setProx(null);
                inicio.setAnt(null); 
                
                //Remo��o do �ltimo elemento da lista
            } else if (remov == atual) {
                atual = remov.getAnt();//Movido para o elemento anterior
                atual.getProx().setAnt(null);
                atual.setProx(null);
                
                //Remo��o de um elemento qualquer
            } else {
                remov.getAnt().setProx(remov.getProx());
                remov.getProx().setAnt(remov.getAnt());
                remov.setAnt(null);
                remov.setProx(null);
            }
            quantidadeElementos--;
            return true;
        } else {
            return false;
        }
    }

    public Object busca(int matricula) {
        Elemento elemento = inicio;
        Funcionario funcionario;
        while (elemento != null) {
            funcionario = (Funcionario) elemento.getObjeto();
            if (funcionario.getMatricula() == matricula) {
                return elemento;
            }
            elemento = elemento.getProx();
        }
        return null;
    }
}
