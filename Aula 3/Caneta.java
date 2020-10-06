public class Caneta{
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada;

  public void status(){
    System.out.println("\nModelo da caneta: " + this.modelo);
    System.out.println("\nCor da caneta: " + this.cor);
    System.out.println("\nTamanho da ponta: " + this.ponta);
    System.out.println("\nCarga da caneta: " + this.carga);
    System.out.println("\nEstá tampada? " + this.tampada);
  }

  public void rabiscar(){
    if(this.tampada == true){
      System.out.println("\nERRO!");
    } else{
      System.out.println("\nRABISCOU");
    }
  }

  protected void tampar(){
    this.tampada = true;
  }

  protected void destampar(){
    this.tampada = false;
  }

}
