public class Elemento {

  private Object objeto;
  private Elemento ant;
  
  public Elemento(){   
  }

  public Elemento(Object objeto, Elemento ant){
      this.objeto = objeto;
      this.ant = ant;
  }
  
  public void setAnt(Elemento ant){
      this.ant = ant;
  }
  
  public Elemento getAnt(){
      return this.ant;
  }
  
  public void setObjeto(Object objeto){
      this.objeto = objeto;
  }
  
  public Object getObjeto(){
      return this.objeto;
  }

  @Override
  public String toString() {
      return "" + objeto + "";
  }
}   