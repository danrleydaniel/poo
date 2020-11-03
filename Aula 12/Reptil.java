public class Reptil extends Animal{
  //Atributos
  private String corEscama;

  //Métodos especiais
  public String getCorEscama(){
    return this.corEscama;
  }

  public void setCorEscama(String c){
    this.corEscama = c;
  }

  //Métodos
  @Override
  public void locomover(){
    System.out.println("Rastejando");
  }

  @Override
  public void alimentar(){
    System.out.println("Comendo vegetais");
  }

  @Override
  public void emitirSom(){
    System.out.println("Som de réptil");
  }
}
