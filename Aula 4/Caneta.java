public class Caneta{
  private String modelo;
  private float ponta;
  private boolean tampada;
  private String cor;

  public Caneta(){
    this.tampar();
    this.cor = "Azul";
  }

  public String getModelo(){
    return this.modelo;
  }

  public void setModelo(String m){
    this.modelo = m;
  }

  public float getPonta(){
    return this.ponta;
  }

  public void setPonta(float p){
    this.ponta = p;
  }

  public void tampar(){
    this.tampada = true;
  }

  public void destampar(){
    this.tampada = false;
  }

  public void status(){
    System.out.println("Modelo da caneta: " +  this.modelo);
    System.out.println("Tamanho da ponta: " + this.ponta);
    System.out.println("A cor da caneza é " +  this.cor);
    System.out.println("A caneta está tampada? " +  this.tampada);
  }
}
