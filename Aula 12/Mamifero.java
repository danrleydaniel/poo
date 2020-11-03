public class Mamifero extends Animal{
  //Atributos
  private String corPelo;

  //Métodos especiais
  public String getCorPelo(){
    return this.corPelo;
  }

  public void setCorPelo(String c){
    this.corPelo = c;
  }

  //Métodos
  @Override
  public void locomover(){
    System.out.println("Correndo");
  }

  @Override
  public void alimentar(){
    System.out.println("Mamando");
  }

  @Override
  public void emitirSom(){
    System.out.println("Som de mamífero");
  }
}
