public final class Bolsista extends Aluno{
  //ATRIBUTOS
  private float bolsa;

  //MÉTODOS ESPECIAIS
  public float getBolsa(){
    return this.bolsa;
  }

  public void setBolsa(float b){
    this.bolsa = b;
  }

  //MÉTODOS
  public void renovarBolsa(){
    System.out.println("Renovando bolsa de " + this.getNome());
  }

  @Override
  public void pagarMensalidade(){
    System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
  }

  @Override
  public void mostra(){
    System.out.println("\n---------------------------");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("Curso: " + this.getCurso());
    System.out.println("Matrícula: " + this.getMatricula());
    System.out.println("Bolsa: " + this.getBolsa());
    System.out.println("---------------------------\n");
  }
}
