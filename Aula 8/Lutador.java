public class Lutador{

  //ATRIBUTOS
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;

  //MÉTODOS ESPECIAIS
  public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
    this.setNome(no);
    this.setNacionalidade(na);
    this.setIdade(id);
    this.setAltura(al);
    this.setPeso(pe);
    this.setVitorias(vi);
    this.setDerrotas(de);
    this.setEmpates(em);
  }

  public void setNome(String no){
    this.nome = no;
  }

  public void setNacionalidade(String na){
    this.nacionalidade = na;
  }

  public void setIdade(int id){
    this.idade = id;
  }

  public void setAltura(float al){
    this.altura = al;
  }

  public void setPeso(float pe){
    this.peso = pe;
    this.setCategoria(pe);
  }

  private void setCategoria(float pe){
    if(pe < 52.2){

      this.categoria = "Inválido";

    } else if(pe <= 70.3){
      
      this.categoria = "Leve";

    } else if(pe <= 83.9){

      this.categoria = "Médio";

    } else if(pe <= 120.2){
      
      this.categoria = "Pesado";

    } else{
      
      this.categoria = "Inválido";

    }
  }

  public void setVitorias(int vi){
    this.vitorias = vi;
  }

  public void setDerrotas(int de){
    this.derrotas = de;
  }

  public void setEmpates(int em){
    this.empates = em;
  }

  public String getNome(){
    return this.nome;
  }

  public String getNacionalidade(){
    return this.nacionalidade;
  }

  public int getIdade(){
    return this.idade;
  }

  public float getAltura(){
    return this.altura;
  }

  public float getPeso(){
    return this.peso;
  }

  public String getCategoria(){
    return this.categoria;
  }

  public int getVitorias(){
    return this.vitorias;
  }

  public int getDerrotas(){
    return this.derrotas;
  }

  public int getEmpates(){
    return this.empates;
  }

  //MÉTODOS
  public void apresentar(){
    System.out.println("--------------------------------");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Origem: " + this.getNacionalidade());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Altura: " +  this.getAltura());
    System.out.println("Peso: " + this.getPeso());
    System.out.println("Vitórias: " + this.getVitorias());
    System.out.println("Derrotas: " + this.getDerrotas());
    System.out.println("Empates: " + this.getEmpates());
    System.out.println("--------------------------------\n");
  }

  public void status(){
    System.out.println("=====================================================");
    System.out.println(this.getNome() + " é um lutador peso " + this.getCategoria());
    System.out.println("Ganhou " + this.getVitorias() +  " vezes, perdeu " + this.getDerrotas() + " vezes, e empatou " + this.getEmpates() + " vezes.");
    System.out.println("=====================================================\n");
  }

  public void ganharLuta(){
    this.setVitorias(this.getVitorias() +  1);
  }

  public void perderLuta(){
    this.setDerrotas(this.getDerrotas() +  1);
  }

  public void empatarLuta(){
    this.setEmpates(this.getEmpates() +  1);
  }
  
}
