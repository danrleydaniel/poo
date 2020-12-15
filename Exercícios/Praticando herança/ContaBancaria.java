public class ContaBancaria{
  //ATRIBUTOS
  private String cliente;
  private int num_conta;
  private float saldo;
  
  //MÉTODO CONSTRUTOR
  public ContaBancaria(){

  }

  //MÉTODOS GETTERS
  public String getCliente(){
    return this.cliente;
  }

  public int getNum_conta(){
    return this.num_conta;
  }

  public float getSaldo(){
    return this.saldo;
  }

  //MÉTODOS SETTERS
  public void setCliente(String c){
    this.cliente = c;
  }

  public void setNum_conta(int n){
    this.num_conta = n;
  }

  public void setSaldo(float s){
    this.saldo = s;
  }

  //MÉTODOS
  public void sacar(float v){
    if(this.getSaldo() - v > 0){
      this.setSaldo(this.getSaldo() - v);
    }
  }

  public void depositar(float v){
    this.setSaldo(this.getSaldo() + v);
  }

  public void show(){
    System.out.println("\n--------------------------");
    System.out.println(this.getCliente() + " tem " + this.getSaldo() + " reais na sua conta. Seu número da conta é: " + this.getNum_conta());
    System.out.println("--------------------------\n");
  }
}
