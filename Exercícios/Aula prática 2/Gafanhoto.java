public class Gafanhoto extends Pessoa{
  //ATRIBTOS
  private String login;
  private int totAssistido;

  //MÉTODO CONSTRUTOR
  public Gafanhoto(String nome, int idade, String sexo, String l){
    super(nome, idade, sexo);
    this.setLogin(l);
    this.setTotAssistido(0);
  }

  //MÉTODOS ESPECIAIS
  public String getLogin(){
    return this.login;
  }

  public int getTotAssistido(){
    return this.totAssistido;
  }

  public void setLogin(String l){
    this.login = l;
  }

  public void setTotAssistido(int t){
    this.totAssistido = t;
  }

  //MÉTODOS
  public void viuMaisUm(){

  }

  public void mostrar(){
    System.out.println("\n----------------------------------");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("Login: " + this.getLogin());
    System.out.println("Total assistido: " + this.getTotAssistido());
    System.out.println("----------------------------------\n");
  }
}
