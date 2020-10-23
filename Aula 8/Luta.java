import java.util.Random;

public class Luta{

  /*
		REGRAS DA LUTA:
	
	  1 - Só pode ser marcada entre lutadores da mesma categoria;
	  2 - Desafiado e desafiante devem ser pessoas diferentes;
	  3 - Só pode acontecer se estiver aprovada;
	  4 - Só pode ter como resultado a vitória ou a derrota de um dos lutadores ou um empate.
	*/

  //ATRIBUTOS:
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

  //MÉTODOS:
  public void marcarLuta(Lutador l1, Lutador l2){
    if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){

      this.setAprovada(true);
      this.setDesafiado(l1);
      this.setDesafiante(l2);

    } else{
      this.setAprovada(false);
      this.setDesafiado(null);
      this.setDesafiante(null);
    }
  }

  public void lutar(){
    if(this.getAprovada()){
      System.out.println("\n--- DESAFIADO: ---");
      this.getDesafiado().apresentar();
      System.out.println("\n--- DESAFIANTE: ---");
      this.getDesafiante().apresentar();

      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3);

      switch(vencedor){

        case 0: //Empate
          System.out.println("Empatou...");
          this.getDesafiado().empatarLuta();
          this.getDesafiante().empatarLuta();
          break;

        case 1: //Desafiado ganha
          System.out.println(this.getDesafiado().getNome() + " ganhou!");
          this.getDesafiado().ganharLuta();
          this.getDesafiante().perderLuta();

        case 2: //Desafiante ganha
          System.out.println(this.getDesafiante().getNome() + " ganhou!");
          this.getDesafiante().ganharLuta();
          this.getDesafiado().perderLuta();
      }

    } else{
      System.out.println("A luta não pode acontecer");
    }
  }

  //MÉTODOS ESPECIAIS:
  public void setDesafiado(Lutador dd){
    this.desafiado = dd;
  }

  public void setDesafiante(Lutador dd){
    this.desafiante = dd;
  }

  public void setRounds(int r){
    this.rounds = r;
  }

  public void setAprovada(boolean a){
    this.aprovada = a;
  }

  public Lutador getDesafiado(){
    return this.desafiado;
  }

  public Lutador getDesafiante(){
    return this.desafiante;
  }

  public int getRounds(){
    return this.rounds;
  }

  public boolean getAprovada(){
    return this.aprovada;
  }
}

/*
  EXERCÍCIO:
  Melhorar essa classe, acrescentando fatores para um lutador ganhar ou perder uma luta.
*/
