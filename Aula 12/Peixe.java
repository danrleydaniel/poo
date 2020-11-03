public class Peixe extends Animal{
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
    System.out.println("Nadando");
  }

  @Override
  public void alimentar(){
    System.out.println("Comendo substâncias");
  }

  @Override
  public void emitirSom(){
    System.out.println("Peixe não faz som");
  }

  public void soltarBolha(){
    System.out.println("Soltou uma bolha");
  }
}
