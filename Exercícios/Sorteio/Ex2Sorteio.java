import java.util.Scanner;
import java.util.Random;

public class Ex2Sorteio{
  private int num;
  private int tentativas;

  public Ex2Sorteio(){
    int r;
    Random ra = new Random();
    r = ra.nextInt(1000);
    this.setNum(r);
    this.setTentativas(0);
  }

  public int palpiteUsuario(){
    int n;
    Scanner read = new Scanner(System.in);
    n = read.nextInt();
    return n;
  }

  private void setNum(int n){
    this.num = n;
  }

  public int getNum(){
    return this.num;
  }

  private void setTentativas(int t){
    this.tentativas = t;
  }

  public int getTentativas(){
    return this.tentativas;
  }

  public void acrescentaTentativa(){
    this.setTentativas(this.getTentativas() + 1);
  }

  public void jogar(){
    int palp;
    boolean continuar = true;
    while(continuar){
      palp = this.palpiteUsuario();
      this.acrescentaTentativa();
      System.out.println("\n------------------------------");
      if(palp == this.getNum()){

        System.out.println("VOCÊ ACERTOU! :D");
        System.out.println("O número sorteado foi: " + this.getNum());
        System.out.println("Você acertou em " + this.getTentativas() + " tentativas!");
        continuar = false;

      } else if(palp < this.getNum()){

        System.out.println("VOCÊ ERROU... :c");
        System.out.println("O número que você chutou foi: " + palp);
        System.out.println("O número sorteado é maior do que esse.");

      } else if(palp > this.getNum()){

        System.out.println("VOCÊ ERROU... :c");
        System.out.println("O número que você chutou foi: " + palp);
        System.out.println("O número sorteado é menor do que esse.");
      }
    }
  }
}
