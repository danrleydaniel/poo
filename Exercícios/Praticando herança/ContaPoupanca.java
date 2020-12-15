public class ContaPoupanca extends ContaBancaria{
  //ATRIBUTOS
  private int dia_de_rendimento;

  //MÉTODOS GETTERS
  public int getDia_de_rendimento(){
    return this.dia_de_rendimento;
  }

  //MÉTODOS SETTERS
  public void setDia_de_rendimento(int d){
    this.dia_de_rendimento = d;
  }

  //MÉTODOS
  public void calcularNovoSaldo(float t){
    float calc = this.getSaldo() * (t / 100);
    this.setSaldo(this.getSaldo() + calc);
  }
}
