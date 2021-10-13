/**
 * BSI - 3º Semestre
 * Estrutura de Dados - 2ª ADO
 * @author Lucas Vergilio Cintra
 * @author Wellington Lira de Melo
 */

// Exercício 02

package ADO2_2;

public class Fruta {
   
    private String nome;
    private String paisOrigem;
    private double preco;

    public Fruta(String nome, String paisOrigem, double preco) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    // Sobrescrita para imprimir os atributos do objeto
    @Override
    public String toString() {
            return "\nFruta: " + this.nome +
                   "\nPaís de Origem: " + this.paisOrigem +
                   "\nPreço: R$" + this.preco + "\n";
    
    }
    
}

package ADO2_2;

import java.util.Comparator;

public class Comparador implements Comparator<Fruta> {

    // Sobrescrita para comparar especificamente objetos do tipo
    // fruta por meio de seus preços
    @Override
    public int compare(Fruta f1, Fruta f2) {
        if(f1.getPreco() < f2.getPreco()) 
            return -1;
        if(f1.getPreco() > f2.getPreco()) 
            return 1;
        return 0;
    }
    
}

// main

package ADO2_2;

import java.util.Comparator;
import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
        
        LinkedList<Fruta> lista = new LinkedList();
        
        Fruta banana = new Fruta("banana", "brasil", 5);
        Fruta maca = new Fruta("maçã", "brasil", 15);
        Fruta mamao = new Fruta("mamão", "brasil", 10);
        Fruta laranja = new Fruta("laranja", "brasil", 12);
        Fruta melancia = new Fruta("melancia", "brasil", 20);
        Fruta limao = new Fruta("limao", "brasil", 3);
        Fruta abacaxi = new Fruta("abacaxi", "brasil", 17);
        Fruta manga = new Fruta("manga", "brasil", 9);
        Fruta pera = new Fruta("pera", "brasil", 8);
        Fruta uva = new Fruta("uva", "brasil", 13);
        
        lista.add(banana);
        lista.add(maca);
        lista.add(mamao);
        lista.add(laranja);
        lista.add(melancia);
        lista.add(limao);
        lista.add(abacaxi);
        lista.add(manga);
        lista.add(pera);
        lista.add(uva);
        
        System.out.println("- - - LISTA ORIGINAL - - -\n");
        System.out.println(lista);
        
        // Ordenação por lambda/Double
        lista.sort((s1, s2) -> Double.compare(s1.getPreco(), s2.getPreco()));
        
        System.out.println("\n- - - LISTA ORDENADA POR PREÇO CRESCENTE - - -\n");
        System.out.print(lista);
        
        // Ordenação por referência a método/Comparator
        lista.sort(Comparator.comparingDouble(Fruta::getPreco)
                      .reversed());
        
        System.out.println("\n\n- - - LISTA ORDENADA POR PREÇO DECRESCENTE - - -\n");
        System.out.print(lista);
        
        // Ordenação por função sort/Classe Comparador
        Comparator<Fruta> comparador = new Comparador();
        lista.sort(comparador);
        
        System.out.println("\n\n- - - LISTA ORDENADA POR PREÇO CRESCENTE - - -\n");
        System.out.print(lista);
        
    }
    
}
