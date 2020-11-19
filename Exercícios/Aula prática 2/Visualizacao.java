public class Visualizacao{
  //ATRIBUTOS
  private Gafanhoto espectador;
  private Video filme;

  //MÉTODO CONSTRUTOR
  public Visualizacao(Gafanhoto e, Video f){
    this.setEspectador(e);
    this.setFilme(f);
    this.getEspectador().setTotAssistido(this.getEspectador().getTotAssistido() + 1);
    this.getFilme().setViews(this.getFilme().getViews() + 1);
  }

  //MÉTODOS ESPECIAIS
  public Gafanhoto getEspectador(){
    return this.espectador;
  }

  public Video getFilme(){
    return this.filme;
  }

  public void setEspectador(Gafanhoto e){
    this.espectador = e;
  }

  public void setFilme(Video f){
    this.filme = f;
  }

  //MÉTODOS
  public void avaliar(){
    this.getFilme().setAvaliacao(5);
  }

  public void avaliar(int nota){
    this.getFilme().setAvaliacao(nota);
  }

  public void avaliar(float porc){
    int tot = 0;
    if(porc <= 20){
      tot = 3;
    } else if(porc <= 50){
      tot = 5;
    } else if(porc <= 90){
      tot = 9;
    } else{
      tot = 10;
    }
    this.getFilme().setAvaliacao(tot);
  }

  public void mostrar(){
    System.out.println(this.getEspectador().getNome() + " está assistindo " + this.getFilme().getTitulo() + ".");
  }
}
