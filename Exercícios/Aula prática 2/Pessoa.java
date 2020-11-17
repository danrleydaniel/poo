public abstract class Pessoa{
  //ATRIBUTOS
  protected String nome;
  protected int idade;
  protected String sexo;
  protected int experiencia;

  //MÉTODO CONSTRUTOR
  public Pessoa(String n, int i, String s){
    this.setNome(n);
    this.setIdade(i);
    this.setSexo(s);
    this.setExperiencia(0);
  }

  //MÉTODOS ESPECIAIS
  public String getNome(){
    return this.nome;
  }

  public int getIdade(){
    return this.idade;
  }

  public String getSexo(){
    return this.sexo;
  }

  public int getExperiencia(){
    return this.experiencia;
  }

  public void setNome(String n){
    this.nome = n;
  }

  public void setIdade(int i){
    this.idade = i;
  }

  public void setSexo(String s){
    this.sexo = s;
  }

  public void setExperiencia(int e){
    this.experiencia = e;
  }

  //MÉTODOS
  protected void ganharExp(){
    this.setExperiencia(this.getExperiencia() + 1);
  }
}
