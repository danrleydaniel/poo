public class Aluno extends Pessoa{

  //ATRIBUTOS
  private int mat;
  private String curso;

  //MÉTODOS ESPECIAIS

  public int getMat(){
    return this.mat;
  }

  public String getCurso(){
    return this.curso;
  }

  public void setMat(int m){
    this.mat = m;
  }

  public void setCurso(String c){
    this.curso = c;
  }

  //MÉTODOS
  public void cancelarMat(){
    System.out.println("A matrícula de " + this.getNome() +  " foi cancelada");
  }
} 
