public abstract class Animal{
  //Atributos
  protected float peso;
  protected int idade;
  protected int membros;

  //Métodos especiais
  public float getPeso(){
    return this.peso;
  }

  public void setPeso(float p){
    this.peso = p;
  }

  public int getIdade(){
    return this.idade;
  }

  public void setIdade(int i){
    this.idade = i;
  }

  public int getMembros(){
    return this.membros;
  }

  public void setMembros(int m){
    this.membros = m;
  }

  //Métodos
  public abstract void locomover();
  public abstract void alimentar();
  public abstract void emitirSom();
}
