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

  public void setSalario(float s){
    this.salario = s;
  }

  public void setEspecialidade(String e){
    this.especialidade = e;
  }

  //MÉTODOS
  public void receberAumento(float a){
    this.setSalario(this.getSalario() + a);
  }

  @Override
  public void mostra(){
    System.out.println("\n---------------------------");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("Salário: " + this.getSalario());
    System.out.println("Especialidade: " + this.getEspecialidade());
    System.out.println("---------------------------\n");
  }
}
