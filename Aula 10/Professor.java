public class Professor extends Pessoa{

  //ATRIBUTOS
  private String especialidade;
  private float salario;

  //MÉTODOS ESPECIAIS
  public String getEspecialidade(){
    return this.especialidade;
  }

  public float getSalario(){
    return this.salario;
  }

  public void setEspecialidade(String e){
    this.especialidade = e;
  }

  public void setSalario(float s){
    this.salario = s;
  }

  //MÉTODOS
  public void receberAum(float a){
    this.setSalario(this.getSalario() + a);
  }

}
