package lista;

public class Metodos {

    private Elemento atual = null;
    private int quantidadeElementos = 0;

    public Elemento getAtual() {
        return atual;
    }

    public void inserirElementoInicio(Object objeto) {
        Elemento novoElemento = new Elemento(objeto, atual);
        //Esse elemento é o atual
        this.atual = novoElemento;
        quantidadeElementos++;
    }

    public void exibir(Elemento elemento) {
        System.out.print("{");
        while (elemento != null) {
            System.out.print(elemento + " ");
            elemento = elemento.getAnt();
        }
        System.out.print("}");
    }

    public void pesquisar(Elemento elemento, Object objeto) {
        String string = (String) objeto;
        while (elemento != null) {
            if (elemento.toString().contains(string)) {
                System.out.println("Achei: " + elemento);
                break;
            }
            elemento = elemento.getAnt();
        }
        if (elemento == null) {
            System.out.println("Não achei!");
        }
    }

    public boolean remover(Elemento remov, Object objeto) {
        String s = (String) objeto;
        if (atual != null) {
            Elemento aux = remov;
            while (remov != null) {
                if (remov.toString().contains(s)) {
                    //Remoção do primeiro elemento da lista
                    if (remov == atual) {
                        atual = atual.getAnt();
                        remov.setAnt(null);
                        quantidadeElementos--;
                        return true;
                        //Remoção do último elemento da lista
                    } else if (remov.getAnt() == null) {
                        aux.setAnt(null);
                        quantidadeElementos--;
                        return true;
                        //Remoção de um elemento qualquer
                    } else {
                        aux.setAnt(remov.getAnt());
                        remov.setAnt(null);
                        quantidadeElementos--;
                        return true;
                    }
                }
                aux = remov;
                remov = remov.getAnt();
            }
        }
        return false;
    }
}
