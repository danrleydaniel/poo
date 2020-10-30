public class Aluno extends Pessoa{
  //ATRIBUTOS
  private int matricula;
  private String curso;
  
  //MÉTODOS ESPECIAIS
  public int getMatricula(){
    return this.matricula;
  }

  public String getCurso(){
    return this.curso;
  }

  public void setMatricula(int m){
    this.matricula = m;
  }

  public void setCurso(String c){
    this.curso = c;
  }

  //MÉTODOS
  public void pagarMensalidade(){
    System.out.println("Pagando mensalidade do aluno " + this.getNome());
  }

  @Override
  public void mostra(){
    System.out.println("\n---------------------------");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("Curso: " + this.getCurso());
    System.out.println("Matrícula: " + this.getMatricula());
    System.out.println("---------------------------\n");
  }
}
