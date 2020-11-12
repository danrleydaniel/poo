class Main {
  public static void main(String[] args) {
    Cachorro c = new Cachorro();
    //Método                     Resultado esperado
    c.reagir("Olá");             //Abanar e latir
    c.reagir("Vai apanhar");     //Rosnar
    c.reagir(11, 45);            //Abanar
    c.reagir(21, 00);            //Ignorar
    c.reagir(true);              //Abanar
    c.reagir(false);             //Rosnar e latir
    c.reagir(2, 12.5f);          //Latir
    c.reagir(17, 1.5f);          //Rosnar
  }
}
