public class Video implements AcoesVideo{
  //ATRIBUTOS
  private String titulo;
  private int avaliacao;
  private int views;
  private int curtidas;
  private boolean reproduzindo;

  //MÉTODO CONSTRUTOR
  public Video(String t){
    this.setTitulo(t);
    this.setAvaliacao(1);
    this.setViews(0);
    this.setCurtidas(0);
    this.setReproduzindo(false);
  }

  //MÉTODOS ESPECIAIS
  public String getTitulo(){
    return this.titulo;
  }

  public int getAvaliacao(){
    return this.avaliacao;
  }

  public int getViews(){
    return this.views;
  }

  public int getCurtidas(){
    return this.curtidas;
  }

  public boolean getReproduzindo(){
    return this.reproduzindo;
  }

  public void setTitulo(String t){
    this.titulo = t;
  }

  public void setAvaliacao(int a){
    this.avaliacao = a;
  }

  public void setViews(int v){
    this.views = v;
  }

  public void setCurtidas(int c){
    this.curtidas = c;
  }

  public void setReproduzindo(boolean r){
    this.reproduzindo = r;
  }

  //MÉTODOS
  @Override
  public void play(){
    if(!this.getReproduzindo()){
      this.setReproduzindo(true);
    } else{
      System.out.println("O seu vídeo já está em reprodução");
    }
  }

  @Override
  public void pause(){
    if(this.getReproduzindo()){
      this.setReproduzindo(false);
    } else{
      System.out.println("O seu vídeo já está em pausa");
    }
  }

  @Override
  public void like(){
    this.setCurtidas(this.getCurtidas() + 1);
  }

  public void mostrar(){
    System.out.println("\n----------------------------------");
    System.out.println("Título: " + this.getTitulo());
    System.out.println("Avaliação: " + this.getAvaliacao());
    System.out.println("Views: " + this.getViews());
    System.out.println("Curtidas: " + this.getCurtidas());
    System.out.println("Está reproduzindo? " + this.getReproduzindo());
    System.out.println("----------------------------------\n");
  }
}
