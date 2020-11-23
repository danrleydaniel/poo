import java.lang.Math;

public class Bhaskara{
  //ATRIBUTOS
  private int a;
  private int b;
  private int c;
  private int delta;
  private int x1;
  private int x2;

  //MÉTODO CONSTRUTOR
  public Bhaskara(int a, int b, int c){
    this.setA(a);
    this.setB(b);
    this.setC(c);
    this.setDelta();
    this.setX(this.getDelta());
  }

  //MÉTODOS ESPECIAIS
  private void setA(int a){
    this.a = a;
  }

  private void setB(int b){
    this.b = b;
  }

  private void setC(int c){
    this.c = c;
  }

  private void setDelta(){
    this.delta = ((this.getB() * this.getB()) - 4 * this.getA() * this.getC());
  }

  private void setX1(int x1){
    this.x1 = x1;
  }

  private void setX2(int x2){
    this.x2 = x2;
  }

  private void setX(int delta){
    int v1 = 0;
    int v2 = 0;
    if(delta > 0){
      v1 = (((b * -1) + (int)Math.sqrt(delta))) / (2 * this.getA());
      v2 = (((b * -1) - (int)Math.sqrt(delta))) / (2 * this.getA());
    } else if (delta < 0){
      v1 = 0;
      v2 = 0;
    } else{
      v1 = (((b * -1) + (int)Math.sqrt(delta))) / (2 * this.getA());
    }

    this.setX1(v1);
    this.setX2(v2);
  }

  private int getA(){
    return this.a;
  }

  private int getB(){
    return this.b;
  }

  private int getC(){
    return this.c;
  }

  private int getDelta(){
    return this.delta;
  }

  private int getX1(){
    return this.x1;
  }

  private int getX2(){
    return this.x2;
  }

  //MÉTODOS:
  public void resolucao(){
    System.out.println("Equação montada:");
    System.out.println(this.getA() + "x² + " + this.getB() + "x + " + this.getC() + " = 0");
    System.out.println("\n--------------");
    System.out.println("Valor de delta: " + this.getDelta());
    System.out.println("\n--------------");
    if(this.getDelta() > 0){
      System.out.println("X₁: " + this.getX1());
      System.out.println("X₂: " + this.getX2());
    } else if(delta < 0){
      System.out.println("O valor de delta é negativo! Não é possível extrair raízes dessa equação.");
    } else{
      System.out.println("O valor de delta é 0. Só existe uma raiz para essa equação: ");
      System.out.println("X: " + this.getX1());
    }

  }
}
