 
package listasimples;
 
public class Elemento {
  private Elemento ant;
  private Object objeto;

    public Elemento() {
    } 
    
    public Elemento(Elemento ant, Object objeto) {
        this.ant = ant;
        this.objeto = objeto;
    }

    public Elemento getAnt() {
        return ant;
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

    @Override
    public String toString() {
        return " " + objeto;
    }
     
}
