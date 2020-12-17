import java.util.Random;
import java.lang.Thread;
import java.util.Scanner;

public class Reflexos{
  private int num;

  public Reflexos(){
    int r;
    Random ra = new Random();
    r = ra.nextInt(100);
    this.setNum(r);
  }

  private void setNum(int n){
    this.num = n;
  }

  public int getNum(){
    return this.num;
  }

  public void escritaUser(int n){
    int n2;
    Scanner read = new Scanner(System.in);
    boolean continuar = true;
    while(continuar){
      n2 = read.nextInt();
      if(n == n2){
        continuar = false;
      } else{
        System.out.println("O número que você digitou não é o mesmo número sorteado");
      }
    }
    System.out.println('\n');
  }

  public void jogar(){
    int contin = 1;
    int r;
    Random ra = new Random();
    long result;
    while(contin == 1){
      r = ra.nextInt(5000);
      Scanner read = new Scanner(System.in);
      System.out.println("O número aparecerá a qualquer momento...");
      try { Thread.sleep (r); } catch (InterruptedException ex) {}
      System.out.println("Agora!");
      System.out.println("Digite o número: " + this.getNum());
      long millis_startTime = System.currentTimeMillis();
      this.escritaUser(this.getNum());
      long millis_endTime = System.currentTimeMillis();

      result = millis_endTime - millis_startTime;

      System.out.println("Você completou em " + result + " milissegundos.");

      System.out.println("Fazer de novo? Digite 1 para continuar, e qualquer outro número para encerrar.");

      contin = read.nextInt();

      if(contin == 1){
        r = ra.nextInt(100);
        this.setNum(r);
      }      
    }
  }
}
