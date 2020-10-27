public class Livro implements Publicacao{
  //ATRIBUTOS
  private String titulo;
  private String autor;
  private int totPaginas;
  private int pagAtual;
  private boolean aberto;
  Pessoa leitor;

  //MÉTODOS ESPECIAIS
  public Livro(String t, String a, int to, Pessoa l){
    this.setTitulo(t);
    this.setAutor(a);
    this.setTotPaginas(to);
    this.setPagAtual(1);
    this.setAberto(false);
    this.setLeitor(l);
  }

  public String getTitulo(){
    return this.titulo;
  }

  public String getAutor(){
    return this.autor;
  }

  public int getTotPaginas(){
    return this.totPaginas;
  }

  public int getPagAtual(){
    return this.pagAtual;
  }

  public boolean getAberto(){
    return this.aberto;
  }

  public Pessoa getLeitor(){
    return this.leitor;
  }

  public void setTitulo(String t){
    this.titulo = t;
  }

  public void setAutor(String a){
    this.autor = a;
  }

  public void setTotPaginas(int t){
    this.totPaginas = t;
  }

  private void setPagAtual(int p){
    this.pagAtual = p;
  }

  private void setAberto(boolean a){
    this.aberto = a;
  }

  public void setLeitor(Pessoa l){
    this.leitor = l;
  }

  //MÉTODOS
  public void detalhes(){
    System.out.println("\n----------------------------------------------------------");
    System.out.println("O título dessa obra é " + this.getTitulo() + ", escrita por " + this.getAutor());
    System.out.println("Esta obra tem um total de " +  this.getTotPaginas() + " páginas, e o leitor " + this.getLeitor().getNome() + " está atualmente na página " + this.getPagAtual());
    if(this.getAberto()){
      System.out.println("O livro está aberto");
    } else{
      System.out.println("O livro está fechado");
    }
    System.out.println("----------------------------------------------------------\n");
  }

  //MÉTODOS ABSTRATOS
  @Override
  public void abrir(){
    if(!(this.getAberto())){
      this.setAberto(true);
    } else{
      System.out.println("O livro já está aberto");
    }
  }

  @Override
  public void fechar(){
    if(this.getAberto()){
      this.setAberto(false);
    } else{
      System.out.println("O livro já está fechado");
    }
  }

  @Override
  public void folhear(int n){
    if(this.getAberto()){
      if(n < 0){
        System.out.println("O valor deve ser positivo...");
      } else{
        int x = this.getPagAtual() + n;

        if(x <= this.getTotPaginas()){
          this.setPagAtual(x);
        } else{
          this.setPagAtual(this.getTotPaginas());
        }
      }
    } else{
      System.out.println("Não é possível folhear, pois o livro está fechado...");
    }
  }

  @Override
  public void avancarPag(){
    if(this.getAberto()){
      this.folhear(1);
    } else{
      System.out.println("Não é possível avançar uma página, pois o livro está fechado...");
    }
  }

  @Override
  public void voltarPag(){
    if(this.getAberto()){
      int x = this.getPagAtual() - 1;

      if(x >= 1){
        this.setPagAtual(x);
      } else{
        this.setPagAtual(1);
      }
    } else{
      System.out.println("Não é possível voltar uma página, pois o livro está fechado...");
    }
  }

  @Override
  public void reiniciar(){
    if(this.getAberto()){
      this.setPagAtual(1);
    } else{
      System.out.println("Não é possível reiniciar a leitura, pois o livro está fechado...");
    }
  }
}
