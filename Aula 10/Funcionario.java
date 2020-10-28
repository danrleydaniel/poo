public class Funcionario extends Pessoa{

  //ATRIBUTOS
  private String setor;
  private boolean trabalhando;

  //MÉTODOS ESPECIAIS
  public String getSetor(){
    return this.setor;
  }

  public boolean getTrabalhando(){
    return this.trabalhando;
  }

  public void setSetor(String s){
    this.setor = s;
  }

  public void setTrabalhando(boolean t){
    this.trabalhando = t;
  }

  //MÉTODOS
  public void mudarTrabalho(){
    this.setTrabalhando(!(this.getTrabalhando()));
  }

}
