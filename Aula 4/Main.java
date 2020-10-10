class Main {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    
    //c1.modelo = "BIC"; <- DÁ ERRO!
    c1.setModelo("BIC");

    //c1.ponta = 0.5f; <- DÁ ERRO!
    c1.setPonta(0.5f);
    c1.status();
  }
}
