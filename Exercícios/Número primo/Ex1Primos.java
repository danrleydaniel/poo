public class Ex1Primos{
  private int num;

  public Ex1Primos(int n){
    this.setNum(n);
  }

  public int getNum(){
    return this.num;
  }

  public void setNum(int n){
    this.num = n;
  }

  public void checaNumPrimo(){
    int aux = 0;
    for(int i = 1; i <= this.getNum(); i++){
      if(this.getNum() % i == 0){
        aux++;
      }
    }
    if(aux == 2){
      System.out.println(this.getNum() + " é um número primo!");
    } else{
      System.out.println(this.getNum() + " não é um número primo!");
    }
  }
}
