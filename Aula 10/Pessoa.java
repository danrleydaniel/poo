public class Pessoa{

  //ATRIBUTOS
  private String nome;
  private int idade;
  private String sexo;

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

  public void setNome(String n){
    this.nome = n;
  }

  public void setIdade(int i){
    this.idade = i;
  }

  public void setSexo(String s){
    this.sexo = s;
  }

  //MÉTODOS
  public void fazerAniver(){
    this.setIdade(this.getIdade() + 1);
  }

  public void mostra(){
    System.out.println("\n--------------------------------");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("--------------------------------\n");
  }
}
