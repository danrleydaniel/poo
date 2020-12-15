public class ContaEspecial extends ContaBancaria{
  //ATRIBUTOS
  private float limite;

  //MÉTODOS GETTERS
  public float getLimite(){
    return this.limite;
  }

  //MÉTODOS SETTERS
  public void setLimite(float l){
    this.limite = l * (-1);
  }

  //MÉTODOS
  @Override
  public void sacar(float v){
    if(!(this.getSaldo() - v < this.getLimite())){
      this.setSaldo(this.getSaldo() - v);
    }
  }
}
