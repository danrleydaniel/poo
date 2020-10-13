public class ContaBanco{
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  public ContaBanco(){
    this.setSaldo(0);
    this.setStatus(false);
  }

  public void estadoAtual(){
    System.out.println("------------------------");
    System.out.println("Número da conta: " + this.getnumConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Dono da conta: " + this.getDono());
    System.out.println("Saldo atual: " + this.getSaldo());
    System.out.println("Está aberta? " + this.getStatus());
  }
  
  public void setnumConta(int n){
    this.numConta = n;
  }

  public int getnumConta(){
    return this.numConta;
  }

  public void setTipo(String t){
    this.tipo = t;
  }

  public String getTipo(){
    return this.tipo;
  }

  public void setDono(String d){
    this.dono = d;
  }

  public String getDono(){
    return this.dono;
  }

  public void setSaldo(float s){
    this.saldo = s;
  }

  public float getSaldo(){
    return this.saldo;
  }

  public void setStatus(boolean s){
    this.status = s;
  }

  public boolean getStatus(){
    return this.status;
  }

  public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if(t == "CC"){
      this.setSaldo(50);
    } else if(t == "CP"){
      this.setSaldo(150);
    }
    System.out.println("Conta aberta com sucesso!");
  }

  public void fecharConta(){
    if(this.getSaldo() > 0){
      System.out.println("Conta com dinheiro");
    } else if(this.getSaldo() < 0){
      System.out.println("Conta em débito");
    } else{
      this.setStatus(false);
      System.out.println("Conta fechada com sucesso!");
    }
  }

  public void depositar(float v){
    if(this.getStatus()){
      this.setSaldo(this.getSaldo() +  v);
      System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
    } else{
      System.out.println("Conta fechada");
    }
  }

  public void sacar(float v){
    if(this.getStatus()){
      if(this.getSaldo() > v){
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Saque realizado com sucesso na conta de " +  this.getDono());
      } else{
        System.out.println("Saldo insuficiente");
      }
    } else{
      System.out.println("A conta está fechada");
    }
  }

  public void pagarMensal(){
    float v = 0;
    if(this.getTipo() == "CC"){
      v = 12;
    } else if (this.getTipo() == "CP"){
      v = 20;
    }
    if(this.getStatus()){
      this.setSaldo(this.getSaldo() - v);
      System.out.println("Mensalidade da conta de " + this.getDono() + " paga com sucesso!");
    }
  }
}
