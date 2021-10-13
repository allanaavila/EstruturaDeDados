 
package lista;
 
public class Elemento {
    private Object objeto;
    private Elemento ant;

    public Elemento() {
    }

    public Elemento(Object objeto, Elemento ant) {
        this.objeto = objeto;
        this.ant = ant;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public void setAnt(Elemento ant) {
        this.ant = ant;
    }

    public Elemento getAnt() {
        return ant;
    }

    @Override
    public String toString() {
        return " " + objeto;
    }
}
