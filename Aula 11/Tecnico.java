public final class Tecnico extends Aluno{
  //ATRIBUTOS
  private String registroProfissional;

  //MÉTODOS ESPECIAIS
  public String getRegistroProfissional(){
    return this.registroProfissional;
  }

  public void setRegistroProfissional(String r){
    this.registroProfissional = r;
  }

  //MÉTODOS
  public void praticar(){
    System.out.println("O aluno " + this.getNome() + " está praticando");
  }

  @Override
  public void mostra(){
    System.out.println("\n---------------------------");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("Curso: " + this.getCurso());
    System.out.println("Matrícula: " + this.getMatricula());
    System.out.println("Registro profissional: " + this.getRegistroProfissional());
    System.out.println("---------------------------\n");
  } 
}
